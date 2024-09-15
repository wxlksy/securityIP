package com.example.securityIP;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class JThread extends JavaPlugin
{
    private final JavaPlugin plugin;
    private final Player player;

    public JThread(JavaPlugin plugin, Player player) {
        this.plugin = plugin;
        this.player = player;
        startPlugin();
    }

    public synchronized void startPlugin()
    {
        plugin.reloadConfig();
        FileConfiguration config = plugin.getConfig();
        String reason = config.getString("reason");
        String nickname = player.getName();
        String ip = player.getAddress().getAddress().toString().replace("/", "");
        List<String> list = config.getStringList(nickname);
        System.out.println(ip);

        if (!list.toString().equals("[]")) return;

        if (!list.contains(ip))
        {
            player.kickPlayer(reason);
        }
    }
}
