package com.midnightsfx.exacompat.recipes.exa;

import blusunrize.immersiveengineering.api.crafting.CrusherRecipe;
import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.items.itemRegister;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.shared.TinkerFluids;

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

    public static void addVanillaNetherOresTinkersSmelt(){
        TinkerRegistry.registerMelting(blockRegister.oreNetherIron, TinkerFluids.iron, Material.VALUE_Ingot * 4);
        TinkerRegistry.registerMelting(blockRegister.oreNetherGold, TinkerFluids.gold, Material.VALUE_Ingot * 4);
        // TODO implement Emerald Smelting - seems to be different than other metals
        //TinkerRegistry.registerMelting(blockRegister.oreNetherEmerald, TinkerFluids.emerald,Material.VALUE_Gem * 6);
    }

    public static void addVanillaNetherOresIECrusher(){
        CrusherRecipe.addRecipe(new ItemStack(Items.COAL, 4),blockRegister.oreNetherCoal,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.IRON_INGOT, 4),blockRegister.oreNetherIron,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.GOLD_INGOT, 4),blockRegister.oreNetherGold,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.DYE, 8, 4),blockRegister.oreNetherLapis,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.REDSTONE, 12),blockRegister.oreNetherRedstone,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.DIAMOND, 3),blockRegister.oreNetherDiamond,4800);
        CrusherRecipe.addRecipe(new ItemStack(Items.EMERALD, 4),blockRegister.oreNetherEmerald,4800);
    }

    public static void addThermalExpansionNetherOres(){
        GameRegistry.addSmelting(blockRegister.oreNetherCopper, new ItemStack(itemRegister.ingotCopper, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherLead, new ItemStack(itemRegister.ingotLead, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherNickel, new ItemStack(itemRegister.ingotNickel, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherSilver, new ItemStack(itemRegister.ingotSilver, 2), 0.5F);
        GameRegistry.addSmelting(blockRegister.oreNetherTin, new ItemStack(itemRegister.ingotTin, 2), 0.5F);
    }

    public static void addTENetherOresTinkersSmelt(){
        TinkerRegistry.registerMelting(blockRegister.oreNetherCopper, TinkerFluids.copper, Material.VALUE_Ingot * 4);
        TinkerRegistry.registerMelting(blockRegister.oreNetherLead, TinkerFluids.lead, Material.VALUE_Ingot * 4);
        TinkerRegistry.registerMelting(blockRegister.oreNetherNickel, TinkerFluids.nickel, Material.VALUE_Ingot * 4);
        TinkerRegistry.registerMelting(blockRegister.oreNetherSilver, TinkerFluids.silver, Material.VALUE_Ingot * 4);
        TinkerRegistry.registerMelting(blockRegister.oreNetherTin, TinkerFluids.tin, Material.VALUE_Ingot * 4);
    }

    public static void addTENetherOresIECrusher(){
        CrusherRecipe.addRecipe(new ItemStack(itemRegister.ingotCopper, 4),blockRegister.oreNetherCopper,4800);
        CrusherRecipe.addRecipe(new ItemStack(itemRegister.ingotLead, 4),blockRegister.oreNetherLead,4800);
        CrusherRecipe.addRecipe(new ItemStack(itemRegister.ingotNickel, 4),blockRegister.oreNetherNickel,4800);
        CrusherRecipe.addRecipe(new ItemStack(itemRegister.ingotSilver, 4),blockRegister.oreNetherSilver,4800);
        CrusherRecipe.addRecipe(new ItemStack(itemRegister.ingotTin, 4),blockRegister.oreNetherTin,4800);
    }
}
