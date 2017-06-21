package com.midnightsfx.exacompat.blocks.helpers;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockBaseHelper extends Block implements itemModelRegister {

    protected String name;

    public blockBaseHelper(Material material, String name) {
        super(material);

        this.name = name;
        this.setCreativeTab(exacompat.creativeTab); // Always display in the mods tab also
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public blockBaseHelper setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        setCreativeTab(exacompat.creativeTab); // Always display in the mods tab
        return this;
    }

    @Override
    public void registerItemModel(Item item) {
        exacompat.proxy.registerItemRenderer(item, 0, name);
    }
}
