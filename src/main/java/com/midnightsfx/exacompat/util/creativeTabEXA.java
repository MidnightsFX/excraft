package com.midnightsfx.exacompat.util;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.items.itemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class creativeTabEXA extends CreativeTabs {

    public creativeTabEXA() {
        super(exacompat.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return itemRegister.eclair;
    }
}
