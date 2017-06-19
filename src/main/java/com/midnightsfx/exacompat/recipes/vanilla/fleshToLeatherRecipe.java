package com.midnightsfx.exacompat.recipes.vanilla;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class fleshToLeatherRecipe {
    public static void addFleshToLeather(){

        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 0.1F);
    }
}
