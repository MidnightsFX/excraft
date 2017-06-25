package com.midnightsfx.exacompat.recipes.exa;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.items.itemRegister;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/24/2017.
 */
public class oreNetherRecipes {

    public static void addVanillaNetherOres(){
        GameRegistry.addSmelting(blockRegister.oreNetherCoal, new ItemStack(Items.COAL, 2), 0.2F);
        GameRegistry.addSmelting(blockRegister.oreNetherIron, new ItemStack(Items.IRON_INGOT, 2), 0.2F);
        GameRegistry.addSmelting(blockRegister.oreNetherGold, new ItemStack(Items.GOLD_INGOT, 2), 0.2F);
        GameRegistry.addSmelting(blockRegister.oreNetherLapis, new ItemStack(Items.DYE, 6, 4), 0.3F);
        GameRegistry.addSmelting(blockRegister.oreNetherRedstone, new ItemStack(Items.REDSTONE, 8), 0.1F);
        GameRegistry.addSmelting(blockRegister.oreNetherDiamond, new ItemStack(Items.DIAMOND, 2), 1F);
        GameRegistry.addSmelting(blockRegister.oreNetherEmerald, new ItemStack(Items.EMERALD, 2), 1F);
    }

    public static void addThermalExpansionNetherOres(){
        GameRegistry.addSmelting(blockRegister.oreNetherCopper, new ItemStack(itemRegister.ingotCopper, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherLead, new ItemStack(itemRegister.ingotLead, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherNickel, new ItemStack(itemRegister.ingotNickel, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherSilver, new ItemStack(itemRegister.ingotSilver, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherTin, new ItemStack(itemRegister.ingotTin, 2), 0.5F);
    }
}
