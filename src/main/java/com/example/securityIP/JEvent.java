package com.example.securityIP;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JEvent implements Listener
{
    private final JavaPlugin plugin;

    public JEvent(JavaPlugin plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event)
    {
        JThread thread = new JThread(plugin, event.getPlayer());
    }
}

