package com.midnightsfx.exacompat.proxy;

import com.midnightsfx.exacompat.recipes.recipeController;
import com.midnightsfx.exacompat.util.commonConfig;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class commonProxy {

    public static commonConfig config; // Config instance

    public void preInit(FMLPreInitializationEvent e) {
        //File directory = e.getModConfigurationDirectory();
        //config = new Configuration(new File(directory.getPath(), "excompat.cfg"));
        config = new commonConfig(e.getSuggestedConfigurationFile()); // Create/intake config
        //Config.readConfig();

        recipeController.initRecipes(); // Initialize configured recipes based on existing mods
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
//        if (config.hasChanged()) {
//            config.save();
//        }
    }
}
