package com.midnightsfx.exacompat.proxy;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by MidnightsFX on 6/19/17.
 */
public interface proxyInterface {

    void preInit(FMLPreInitializationEvent e);

    void init(FMLInitializationEvent e);

    void postInit(FMLPostInitializationEvent e);

    void registerItemRenderer(Item item, int metadata, String id);
}
