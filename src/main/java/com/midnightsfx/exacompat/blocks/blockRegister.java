package com.midnightsfx.exacompat.blocks;

import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockRegister {

    public static blockOreHelper oreDark;
    public static blockCropCotton cropCotton;

    public static void init() {
        oreDark = register(new blockOreHelper("oreDark").setCreativeTab(CreativeTabs.MATERIALS));
        cropCotton = register(new blockCropCotton(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if(itemBlock != null){ GameRegistry.register(itemBlock);}


        if (block instanceof itemModelRegister) {
            ((itemModelRegister)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
