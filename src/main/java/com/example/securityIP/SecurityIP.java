package com.example.securityIP;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.io.File;

public final class SecurityIP extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        File file = new File(getDataFolder() + File.separator + "config.yml");
        if (!file.exists()) saveDefaultConfig();

        JEvent event = new JEvent(this);
        Bukkit.getPluginManager().registerEvents(event, this);

        System.out.println(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[securityIP]" + ChatColor.RESET + "Activated Security");
    }
}
