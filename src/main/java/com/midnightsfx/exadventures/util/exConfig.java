package com.midnightsfx.exadventures.util;

import com.midnightsfx.exadventures.exadventures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MidnightsFX on 6/1/17.
 */
public class exConfig {

    private Configuration config;
    private static final String CONFIG_FILE = "config/exadventures.cfg";

    //region Categories
    private static final String ADDON = "addon";

    //region Addon
    public boolean genericRecipes;
    public boolean modTConstructRecipes;

    public exConfig(File configFile) {
        config = new Configuration(configFile);

        MinecraftForge.EVENT_BUS.register(this);

        loadConfig();
    }

    public Configuration getConfig() {
        return config;
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(exadventures.MODID)) {
            loadConfig();
        }
    }

    private void loadConfig() {
        //region Addon
        genericRecipes = config.getBoolean("enableGenericRecipes", ADDON, true, "Enable generic recipes. Default: true");
        modTConstructRecipes = config.getBoolean("enableTConstructRecipes", ADDON, true, "Enable Tinkers Construct recipes. Default: true");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SuppressWarnings("unchecked")
    public List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<>();

        list.addAll(new ConfigElement(config.getCategory(ADDON)).getChildElements());

        return list;
    }

}
