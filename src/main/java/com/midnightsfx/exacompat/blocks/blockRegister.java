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

    // Vanilla Nether Ores
    public static blockOreHelper oreNetherCoal;
    public static blockOreHelper oreNetherIron;
    public static blockOreHelper oreNetherGold;
    public static blockOreHelper oreNetherLapis;
    public static blockOreHelper oreNetherRedstone;
    public static blockOreHelper oreNetherDiamond;
    public static blockOreHelper oreNetherEmerald;

    // Thermal Expansion Nether Ores
    public static blockOreHelper oreNetherCopper;
    public static blockOreHelper oreNetherTin;
    public static blockOreHelper oreNetherSilver;
    public static blockOreHelper oreNetherLead;
    public static blockOreHelper oreNetherNickel;

    public static blockCropCotton cropCotton;

    public static void init() {
        // Register Vanilla Nether Ores
        oreNetherCoal = register(new blockOreHelper("oreNetherCoal", "oreNetherCoal"));
        oreNetherIron = register(new blockOreHelper("oreNetherIron", "oreNetherIron"));
        oreNetherGold = register(new blockOreHelper("oreNetherGold", "oreNetherGold"));
        oreNetherLapis = register(new blockOreHelper("oreNetherLapis", "oreNetherLapis"));
        oreNetherRedstone = register(new blockOreHelper("oreNetherRedstone", "oreNetherRedstone"));
        oreNetherDiamond = register(new blockOreHelper("oreNetherDiamond", "oreNetherDiamond"));
        oreNetherEmerald = register(new blockOreHelper("oreNetherEmerald", "oreNetherEmerald"));

        //Register Thermal Foundation Nether Ores
        oreNetherCopper = register(new blockOreHelper("oreNetherCopper", "oreNetherCopper"));
        oreNetherTin = register(new blockOreHelper("oreNetherTin", "oreNetherTin"));
        oreNetherSilver = register(new blockOreHelper("oreNetherSilver", "oreNetherSilver"));
        oreNetherLead = register(new blockOreHelper("oreNetherLead", "oreNetherLead"));
        oreNetherNickel = register(new blockOreHelper("oreNetherNickel", "oreNetherNickel"));

        // Register Cotton
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
