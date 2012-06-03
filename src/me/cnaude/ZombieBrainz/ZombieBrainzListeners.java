/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cnaude.ZombieBrainz;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.player.PlayerMoveEvent;
    
public class ZombieBrainzListeners implements Listener { 
    private final ZombieBrainz plugin;
    
    public ZombieBrainzListeners(ZombieBrainz Instance) {
        plugin = Instance;
    }
          
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerMove(PlayerMoveEvent event) {
        
    }
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {   
        if (event.getPlayer().hasPotionEffect(PotionEffectType.HUNGER)) {
            if (event.getRightClicked() instanceof Player) {
                Player victim = (Player)event.getRightClicked();
                Player attacker = event.getPlayer();
                victim.damage(1);
                PotionEffect potion = new PotionEffect(PotionEffectType.HUNGER, 50, 50);                
                victim.addPotionEffect(potion);
                attacker.addPotionEffect(potion);
            }
        }
    }
}

