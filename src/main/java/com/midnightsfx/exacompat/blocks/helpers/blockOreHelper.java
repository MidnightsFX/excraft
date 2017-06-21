package com.midnightsfx.exacompat.blocks.helpers;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockOreHelper extends blockBaseHelper implements itemOreDictInterface {

    private String oreName;

    public blockOreHelper(String name, String oreName) {
        super(Material.ROCK, name);

        this.oreName = oreName;
        this.setCreativeTab(exacompat.creativeTab); // Always display in the mods tab also
        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public blockOreHelper setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
