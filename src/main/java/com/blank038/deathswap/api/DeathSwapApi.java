package com.blank038.deathswap.api;

import com.blank038.deathswap.DeathSwap;
import com.blank038.deathswap.enums.GameLocType;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class DeathSwapApi {
    private final DeathSwap INSTANCE;

    public DeathSwapApi() {
        INSTANCE = DeathSwap.getInstance();
    }

    public boolean createArena(Player player, String arenaName, String world) {
        if (INSTANCE.getGameManager().hasArena(arenaName)) return false;
        File file = new File(INSTANCE.getDataFolder() + "/arenas/", arenaName + ".yml");
        FileConfiguration data = new YamlConfiguration();
        data.set("min", 2);
        data.set("max", 8);
        data.set("size", 100);
        data.set("display-name", arenaName);
        data.set("world", world);
        data.set("loc-type", GameLocType.RANDOM.name());
        return true;
    }
}