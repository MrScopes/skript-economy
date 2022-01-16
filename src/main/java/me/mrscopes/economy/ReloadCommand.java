package me.mrscopes.economy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        SkriptEconomy plugin = SkriptEconomy.get();
        if (sender.hasPermission(plugin.getConfig().getString("reload permission"))) {
            try {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                sender.sendMessage("Successfully reloaded Economy.");
            } catch (Error error) {
                sender.sendMessage(error.toString());
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("permission message")));
        }

        return true;
    }
}
