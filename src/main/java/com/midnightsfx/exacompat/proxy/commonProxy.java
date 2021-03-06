package com.midnightsfx.exacompat.proxy;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.items.itemRegister;
import com.midnightsfx.exacompat.util.commonConfig;
import com.midnightsfx.exacompat.worldgen.worldgenRegister;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        GameRegistry.registerWorldGenerator(new worldgenRegister(), 231); //run worldgen-late
    }

    public void init(FMLInitializationEvent e) {
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
