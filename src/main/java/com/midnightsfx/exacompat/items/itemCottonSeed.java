package com.midnightsfx.exacompat.items;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemCottonSeed extends ItemSeeds implements itemModelRegister {

    private String name = "cottonSeed";

    public itemCottonSeed() {
        super(blockRegister.cropCotton, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(exacompat.creativeTab); // Always display in the mods tab
    }

    @Override
    public void registerItemModel(Item item) {
        exacompat.proxy.registerItemRenderer(item, 0, name);
    }
}
