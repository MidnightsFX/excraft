package com.midnightsfx.exacompat.proxy;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.items.itemRegister;
import com.midnightsfx.exacompat.recipes.recipeController;
import com.midnightsfx.exacompat.util.commonConfig;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class commonProxy implements proxyInterface {

    public static commonConfig config; // Config instance

    public void preInit(FMLPreInitializationEvent e) {
        //File directory = e.getModConfigurationDirectory();
        //config = new Configuration(new File(directory.getPath(), "excompat.cfg"));
        config = new commonConfig(e.getSuggestedConfigurationFile()); // Create/intake config
        //Config.readConfig();
        blockRegister.init();
        itemRegister.init();
        recipeController.initRecipes(); // Initialize configured recipes based on existing mods
    }

    public void init(FMLInitializationEvent e) {
        recipeController.initRecipes(); // Initialize configured recipes based on existing mods
    }

    public void postInit(FMLPostInitializationEvent e) {
//        if (config.hasChanged()) {
//            config.save();
//        }
    }

    @Override
    public void registerItemRenderer(Item item, int metadata, String id) {

    }

}
