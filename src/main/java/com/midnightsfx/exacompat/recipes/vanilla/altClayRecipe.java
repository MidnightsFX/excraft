package com.midnightsfx.exacompat.recipes.vanilla;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class altClayRecipe {
    public static void addAltClay(){
        GameRegistry.addShapelessRecipe(new ItemStack(Items.CLAY_BALL,2 ), Items.WHEAT, Blocks.DIRT, Items.WATER_BUCKET);
    }
}
