package com.blank038.deathswap.command;

import com.blank038.deathswap.DeathSwap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {
    private final DeathSwap INSTANCE;

    public MainCommand() {
        INSTANCE = DeathSwap.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        return false;
    }
}