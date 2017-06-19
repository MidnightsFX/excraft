package com.midnightsfx.exacompat.util;

import com.midnightsfx.exacompat.exacompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class commonConfig {

    private Configuration config;
    //region Categories
    private static final String TCON = "TConstructRecipes";
    private static final String VANILLA = "AltVanillaRecipes";

    //region Recipes - Config Values
    public boolean vanillaTconSmelt;
    public boolean thermalTconSmelt;
    public boolean vanillaAltClay;
    public boolean vanillaFleshToLeather;

    public commonConfig(File configFile) {
        config = new Configuration(configFile);
        MinecraftForge.EVENT_BUS.register(this);
        loadConfig();
    }

    public Configuration getConfig() {
        return config;
    }

    private void loadConfig() {
        //region TinkersConstructRecipes
        vanillaTconSmelt = config.getBoolean("enableVanillaTconMeltdown", TCON, true, "Enables Melting down of VANILLA armor, weapons and tools. Default: true");
        thermalTconSmelt = config.getBoolean("enableThermalTconMeltdown", TCON, true, "Enables Melting down of THERMAL FOUNDATION armor, weapons and tools. Default: true");

        //region AltVanillaRecipes
        vanillaAltClay = config.getBoolean("enableAltClay", VANILLA, true, "Enable a simple recipe to make clay from dirt, wheat and water. Default: true");
        vanillaFleshToLeather = config.getBoolean("enableFleshToLeather", VANILLA, true, "Enable smelting Rotten Flesh to leather. Default: true");


        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(exacompat.MODID)) {
            loadConfig();
        }
    }
}
