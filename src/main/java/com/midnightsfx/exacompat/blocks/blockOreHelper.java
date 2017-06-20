package com.midnightsfx.exacompat.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockOreHelper extends blockBaseHelper {


    public blockOreHelper(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public blockOreHelper setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
