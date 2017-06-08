package com.midnightsfx.exadventures.init;

import net.minecraft.init.Items;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.shared.TinkerFluids;

/**
 * Created by MidnightsFX on 5/31/17.
 */
public class modRecipes {
        public static void addTConstructRecipes() {
            // Melt Swords
            TinkerRegistry.registerMelting(Items.GOLDEN_SWORD, TinkerFluids.gold, Material.VALUE_Ingot * 1);
            TinkerRegistry.registerMelting(Items.IRON_SWORD, TinkerFluids.iron, Material.VALUE_Ingot * 1);

            // Melt Axes
            TinkerRegistry.registerMelting(Items.GOLDEN_AXE, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_AXE, TinkerFluids.iron, Material.VALUE_Ingot * 2);

            // Melt Pickaxes
            TinkerRegistry.registerMelting(Items.GOLDEN_PICKAXE, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_PICKAXE, TinkerFluids.iron, Material.VALUE_Ingot * 2);

            // Melt Shovels
            TinkerRegistry.registerMelting(Items.GOLDEN_SHOVEL, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_SHOVEL, TinkerFluids.iron, Material.VALUE_Ingot * 2);

            // Melt Hoes
            TinkerRegistry.registerMelting(Items.GOLDEN_HOE, TinkerFluids.gold, Material.VALUE_Ingot * 1);
            TinkerRegistry.registerMelting(Items.IRON_HOE, TinkerFluids.iron, Material.VALUE_Ingot * 1);

            // Melt Armour pieces
            TinkerRegistry.registerMelting(Items.GOLDEN_BOOTS, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.GOLDEN_HELMET, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.GOLDEN_LEGGINGS, TinkerFluids.gold, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(Items.GOLDEN_CHESTPLATE, TinkerFluids.gold, Material.VALUE_Ingot * 4);
            TinkerRegistry.registerMelting(Items.IRON_BOOTS, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_HELMET, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_LEGGINGS, TinkerFluids.iron, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(Items.IRON_CHESTPLATE, TinkerFluids.iron, Material.VALUE_Ingot * 4);
            TinkerRegistry.registerMelting(Items.CHAINMAIL_BOOTS, TinkerFluids.iron, Material.VALUE_Ingot * 1);
            TinkerRegistry.registerMelting(Items.CHAINMAIL_HELMET, TinkerFluids.iron, Material.VALUE_Ingot * 1);
            TinkerRegistry.registerMelting(Items.CHAINMAIL_LEGGINGS, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.CHAINMAIL_CHESTPLATE, TinkerFluids.iron, Material.VALUE_Ingot * 3);
        }

}

