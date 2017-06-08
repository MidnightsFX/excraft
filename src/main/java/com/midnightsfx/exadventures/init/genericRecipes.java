package com.midnightsfx.exadventures.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 5/31/17.
 */
public class genericRecipes {




    public static void addRecipes() {
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 0.1F);
        //GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK), Items.DIAMOND, Items.LAVA_BUCKET, new ItemStack(Blocks.WOOL, 1, 2));

//        GameRegistry.addRecipe(new ItemStack(Items.LEATHER, 1),
//                "AA",
//                "AA",
//                "AA",
//                'A', Items.ROTTEN_FLESH
//        );

    }


}
