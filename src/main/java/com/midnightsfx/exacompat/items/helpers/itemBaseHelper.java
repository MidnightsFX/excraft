package com.midnightsfx.exacompat.items.helpers;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemBaseHelper extends Item implements itemModelRegister {

    protected String name;

    public itemBaseHelper(String name) {
        this.name = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(exacompat.creativeTab); // Always display in the mods tab also
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public itemBaseHelper setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        super.setCreativeTab(exacompat.creativeTab); // Always display in the mods tab
        return this;
    }

    @Override
    public void registerItemModel(Item item) {
        exacompat.proxy.registerItemRenderer(this, 0, name);
    }
}
