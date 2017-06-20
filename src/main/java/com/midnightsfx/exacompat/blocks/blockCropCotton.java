package com.midnightsfx.exacompat.blocks;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.items.itemRegister;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockCropCotton extends BlockCrops {

    public blockCropCotton() {
        setUnlocalizedName("cropCotton");
        setRegistryName("cropCotton");
        setCreativeTab(exacompat.creativeTab); // Always display in the mods tab
    }

    @Override
    protected Item getSeed() {
        return itemRegister.cottonseed;
    }

    @Override
    protected Item getCrop() {
        return itemRegister.cotton;
    }
}
