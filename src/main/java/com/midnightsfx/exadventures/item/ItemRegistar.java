package com.midnightsfx.exadventures.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/16/17.
 */
public class ItemRegistar {

        public static final Item ECLAIR = new ItemEclair(2,1F);

    public static void callRegistry(FMLPreInitializationEvent e) {
        GameRegistry.register(ECLAIR);
    }


}
