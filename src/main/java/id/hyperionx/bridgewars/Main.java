package id.hyperionx.bridgewars;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private GameManager gameManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("BridgeWars plugin enabled!");

        // Initialize game manager
        gameManager = new GameManager(this);

        // Register commands
        getCommand("bridgewars").setExecutor(new BridgeWarsCommand(this));
        getCommand("bwadmin").setExecutor(new AdminCommand(this));

        // Register events
        getServer().getPluginManager().registerEvents(new GameListener(this), this);

        // Load configurations
        saveDefaultConfig();
        gameManager.loadArenas();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("BridgeWars plugin disabled!");

        if (gameManager != null) {
            gameManager.shutdown();
        }
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}