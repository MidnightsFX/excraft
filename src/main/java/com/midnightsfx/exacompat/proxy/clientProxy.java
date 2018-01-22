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

    /*@Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit();
    }*/
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
