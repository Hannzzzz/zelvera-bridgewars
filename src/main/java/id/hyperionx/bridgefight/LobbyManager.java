package id.hyperionx.bridgefight;

// import com.gmail.filoghost.holographicdisplays.api.Hologram;
// import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
// import net.citizensnpcs.api.CitizensAPI;
// import net.citizensnpcs.api.npc.NPC;
// import net.citizensnpcs.api.trait.Trait;
// import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

public class LobbyManager {

    private final JavaPlugin plugin;
    // private Hologram lobbyHologram;
    // private NPC modeSelectorNPC;
    // private NPC backToSpawnNPC;

    public LobbyManager(JavaPlugin plugin, Location lobbyLocation) {
        this.plugin = plugin;
        // setupHologram(lobbyLocation);
        // setupNPCs(lobbyLocation);
    }

    // private void setupHologram(Location location) {
    //     if (Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
    //         lobbyHologram = HologramsAPI.createHologram(plugin, location.clone().add(0, 2, 0));
    //         lobbyHologram.appendTextLine("§6BridgeFight Lobby");
    //         lobbyHologram.appendTextLine("§7Click NPCs to join modes!");
    //         lobbyHologram.appendTextLine("§eWelcome to fast-paced duels!");
    //     }
    // }

    // private void setupNPCs(Location location) {
    //     if (Bukkit.getPluginManager().isPluginEnabled("Citizens")) {
    //         // Mode selector NPC
    //         modeSelectorNPC = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "§6Mode Selector");
    //         modeSelectorNPC.spawn(location.clone().add(2, 0, 0));
    //         modeSelectorNPC.addTrait(new ClickableTrait(this::openModeMenu));
    //
    //         // Back to spawn NPC
    //         backToSpawnNPC = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "§cBack to Spawn");
    //         backToSpawnNPC.spawn(location.clone().add(-2, 0, 0));
    //         backToSpawnNPC.addTrait(new ClickableTrait(this::teleportToSpawn));
    //     }
    // }

    private void openModeMenu(Player player) {
        Inventory menu = Bukkit.createInventory(null, 9, "§6Select BridgeFight Mode");
        menu.setItem(0, createItem(Material.DIAMOND_SWORD, "§bClassic Duel", "§71v1 bridge combat"));
        menu.setItem(2, createItem(Material.BOW, "§eArcher Duel", "§7Ranged bridge fights"));
        menu.setItem(4, createItem(Material.TNT, "§cExplosive Mode", "§7TNT-enabled chaos"));
        player.openInventory(menu);
    }

    private void teleportToSpawn(Player player) {
        player.teleport(Bukkit.getWorld("world").getSpawnLocation());
        player.sendMessage("§aTeleported back to spawn!");
    }

    private ItemStack createItem(Material material, String name, String lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(java.util.Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }

    public void destroy() {
        // if (lobbyHologram != null) lobbyHologram.delete();
        // if (modeSelectorNPC != null) modeSelectorNPC.destroy();
        // if (backToSpawnNPC != null) backToSpawnNPC.destroy();
    }

    // private static class ClickableTrait implements Trait {
    //     private final Consumer<Player> action;
    //
    //     public ClickableTrait(Consumer<Player> action) {
    //         this.action = action;
    //     }
    //
    //     @EventHandler
    //     public void onClick(NPCRightClickEvent event) {
    //         action.accept(event.getClicker());
    //     }
    //
    //     @Override
    //     public void run() {}
    //
    //     @Override
    //     public void onAttach() {}
    //
    //     @Override
    //     public void onRemove() {}
    //
    //     @Override
    //     public void onSpawn() {}
    //
    //     @Override
    //     public void onDespawn() {}
    // }
}
