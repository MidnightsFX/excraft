package com.midnightsfx.exacompat.blocks;

import com.midnightsfx.exacompat.blocks.helpers.blockOreHelper;
import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class blockRegister {

    public static blockOreHelper oreDark;
    public static blockCropCotton cropCotton;

    public static void init() {
        //oreDark = register(new blockOreHelper("oreDark", "oreDark")); //Dark ore is not used yet
        cropCotton = register(new blockCropCotton(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if(itemBlock != null){ GameRegistry.register(itemBlock);}
        // Register model
        if(block instanceof itemModelRegister) {((itemModelRegister)block).registerItemModel(itemBlock);}
        // Register to Ore Dictionary
        if (block instanceof itemOreDictInterface) {((itemOreDictInterface)block).initOreDict();}
        if (itemBlock instanceof itemOreDictInterface) {((itemOreDictInterface)itemBlock).initOreDict();}

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
