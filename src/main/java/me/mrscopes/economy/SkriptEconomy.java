package me.mrscopes.economy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkriptEconomy extends JavaPlugin {

    public static SkriptEconomy instance;
    public static SkriptEconomy get() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();

        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            Bukkit.getLogger().severe("Vault is a required plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        if (getServer().getPluginManager().getPlugin("Skript") == null) {
            Bukkit.getLogger().severe("Skript is a required plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getServer().getServicesManager().register(net.milkbowl.vault.economy.Economy.class, new SkriptEconomyProvider(), this, ServicePriority.Highest);
    }
}