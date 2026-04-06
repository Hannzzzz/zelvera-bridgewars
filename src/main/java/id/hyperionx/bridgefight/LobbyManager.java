package id.hyperionx.bridgefight;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyManager {

    private final JavaPlugin plugin;

    public LobbyManager(JavaPlugin plugin, Location lobbyLocation) {
        this.plugin = plugin;
        // Hologram and NPC setup commented out until plugins are installed
        // Uncomment when HolographicDisplays and Citizens are added
        /*
        if (Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
            // Setup hologram
        }
        if (Bukkit.getPluginManager().isPluginEnabled("Citizens")) {
            // Setup NPCs
        }
        */
    }

    public void destroy() {
        // Destroy hologram and NPCs if created
    }
}
