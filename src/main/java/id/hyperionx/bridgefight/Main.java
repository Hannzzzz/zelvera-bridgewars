package id.hyperionx.bridgefight;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private GameManager gameManager;

    @Override
    public void onEnable() {
        // startup logic plugin
        getLogger().info("BridgeFight plugin enabled!");

        // initialize game manager
        gameManager = new GameManager(this);

        // registers commands
        getCommand("bridgefight").setExecutor(new BridgeFightCommand(this));
        getCommand("bfadmin").setExecutor(new AdminCommand(this));

        // registers events
        getServer().getPluginManager().registerEvents(new GameListener(this), this);
        // getServer().getPluginManager().registerEvents(new MenuListener(), this); // Uncomment when Citizens is installed

        // Register Citizens trait if available
        // if (Bukkit.getPluginManager().isPluginEnabled("Citizens")) {
        //     CitizensAPI.getTraitFactory().registerTrait(TraitInfo.create(LobbyManager.ClickableTrait.class));
        // }

        // loads configurations
        saveDefaultConfig();
        gameManager.loadArenas();
    }

    @Override
    public void onDisable() {
        // plugin shutdown logic
        getLogger().info("BridgeFight plugin disabled!");

        if (gameManager != null) {
            gameManager.shutdown();
        }
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}