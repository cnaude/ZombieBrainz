/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cnaude.ZombieBrainz;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author naudec
 */
public class ZombieBrainz extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft"); 
    private final ZombieBrainzListeners eventListener = new ZombieBrainzListeners(this);
    
    @Override
    public void onEnable() {       
        getServer().getPluginManager().registerEvents(eventListener, this);
    }
}
