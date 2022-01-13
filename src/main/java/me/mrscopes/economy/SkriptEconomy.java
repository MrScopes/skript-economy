package me.mrscopes.economy;

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
        saveDefaultConfig();
        getServer().getServicesManager().register(net.milkbowl.vault.economy.Economy.class, new SkriptEconomyProvider(), this, ServicePriority.High);
    }
}