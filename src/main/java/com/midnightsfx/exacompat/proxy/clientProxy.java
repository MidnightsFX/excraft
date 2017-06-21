package com.midnightsfx.exacompat.proxy;

import com.midnightsfx.exacompat.exacompat;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by MidnightsFX on 6/19/17.
 */
public class clientProxy extends commonProxy {

    //public static commonConfig config; // Config instance


    // Aquire all of the PRE-INIT stuff from the common proxy
    //@Override
//    public void preInit(FMLPreInitializationEvent e) {
//        //File directory = e.getModConfigurationDirectory();
//        //config = new Configuration(new File(directory.getPath(), "excompat.cfg"));
//        config = new commonConfig(e.getSuggestedConfigurationFile()); // Create/intake config
//        //Config.readConfig();
//        recipeRegister.init(); // Initialize configured recipes based on existing mods
//
//    }

    @Override
    public void init(FMLInitializationEvent e) {

    }
    @Override
    public void postInit(FMLPostInitializationEvent e) {
//        if (config.hasChanged()) {
//            config.save();
//        }
    }

    @Override
    public void registerItemRenderer(Item item, int metadata, String id) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(exacompat.MODID + ":" + id, "inventory"));
    }

}
