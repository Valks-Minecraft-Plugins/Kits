package com.valkkits;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.valkkits.commands.CommandKit;
import com.valkkits.listeners.ListenerInvClose;

public class ValkKits extends JavaPlugin {
	@Override
	public void onEnable() {
		registerListeners();
		registerCommands();
	}
	
	private void registerListeners() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new ListenerInvClose(), this);
	}
	
	private void registerCommands() {
		getCommand("kit").setExecutor(new CommandKit());
	}
}