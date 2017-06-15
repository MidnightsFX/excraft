package com.midnightsfx.exadventures.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 5/31/17.
 */
public class genericRecipes {




    public static void addRecipes() {
        // Smelting
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 0.1F);

        // Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(Items.CLAY_BALL,2 ), Items.WHEAT, Blocks.DIRT, Items.WATER_BUCKET);

        //GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK), Items.DIAMOND, Items.LAVA_BUCKET, new ItemStack(Blocks.WOOL, 1, 2));

//        GameRegistry.addRecipe(new ItemStack(Items.LEATHER, 1),
//                "AA",
//                "AA",
//                "AA",
//                'A', Items.ROTTEN_FLESH
//        );

    }


}
