package com.valkkits.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CommandKit implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("kit")) {
			if (!sender.hasPermission("valkkits.kit")) {
				sender.sendMessage("No permission.");
				return false;
			}
			
			if (args.length < 1) {
				sender.sendMessage("Usage: /kit [name]");
			}
			
			Player p = Bukkit.getPlayer(sender.getName());
			
			Inventory inv = Bukkit.createInventory(null, 54, p.getName());
			
			p.openInventory(inv);
			
			return true;
		}
		return false;
	}

}
