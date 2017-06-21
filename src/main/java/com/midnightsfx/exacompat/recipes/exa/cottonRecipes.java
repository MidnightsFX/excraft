package com.midnightsfx.exacompat.recipes.exa;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by MidnightsFX on 6/20/2017.
 */
public class cottonRecipes {
    public static void addToString(){
        GameRegistry.addRecipe(new ShapedOreRecipe(Items.STRING, "CC ", 'C', "oreCotton"));
    }

    public static void addToWool(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.WOOL, 1), "CC ", "CC ", 'C', "oreCotton"));
    }
}
