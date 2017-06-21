package com.midnightsfx.exacompat.items;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class eclair {

    public static itemBaseHelper eclair = new itemBaseHelper("eclair");

    public static void init() {
        eclair.setCreativeTab(CreativeTabs.FOOD);
        eclair.setMaxStackSize(16);
        //eclair.setAlwaysEdible();
        //eclair = register(item_eclair);
    }
}
