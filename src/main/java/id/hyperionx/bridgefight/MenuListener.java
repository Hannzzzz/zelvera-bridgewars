package id.hyperionx.bridgefight;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.entity.Player;

public class MenuListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals("§6Select BridgeFight Mode")) return;
        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        switch (event.getSlot()) {
            case 0: // Classic Duel
                // Join classic duel arena
                player.sendMessage("§aJoining Classic Duel!");
                break;
            case 2: // Archer Duel
                player.sendMessage("§aJoining Archer Duel!");
                break;
            case 4: // Explosive Mode
                player.sendMessage("§aJoining Explosive Mode!");
                break;
        }
        player.closeInventory();
    }
}