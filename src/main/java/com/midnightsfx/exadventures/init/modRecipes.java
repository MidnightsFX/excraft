package com.midnightsfx.exadventures.init;

import cofh.thermalfoundation.init.TFEquipment;
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
            TinkerRegistry.registerMelting(Items.GOLDEN_SWORD, TinkerFluids.gold, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(Items.IRON_SWORD, TinkerFluids.iron, Material.VALUE_Ingot );

            // Melt Axes
            TinkerRegistry.registerMelting(Items.GOLDEN_AXE, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_AXE, TinkerFluids.iron, Material.VALUE_Ingot * 2);

            // Melt Pickaxes
            TinkerRegistry.registerMelting(Items.GOLDEN_PICKAXE, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_PICKAXE, TinkerFluids.iron, Material.VALUE_Ingot * 2);

            // Melt Shovels
            TinkerRegistry.registerMelting(Items.GOLDEN_SHOVEL, TinkerFluids.gold, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(Items.IRON_SHOVEL, TinkerFluids.iron, Material.VALUE_Ingot );

            // Melt Hoes
            TinkerRegistry.registerMelting(Items.GOLDEN_HOE, TinkerFluids.gold, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(Items.IRON_HOE, TinkerFluids.iron, Material.VALUE_Ingot );

            // Melt Armor pieces
            TinkerRegistry.registerMelting(Items.GOLDEN_BOOTS, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.GOLDEN_HELMET, TinkerFluids.gold, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.GOLDEN_LEGGINGS, TinkerFluids.gold, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(Items.GOLDEN_CHESTPLATE, TinkerFluids.gold, Material.VALUE_Ingot * 4);

            TinkerRegistry.registerMelting(Items.IRON_BOOTS, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_HELMET, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.IRON_LEGGINGS, TinkerFluids.iron, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(Items.IRON_CHESTPLATE, TinkerFluids.iron, Material.VALUE_Ingot * 4);

            TinkerRegistry.registerMelting(Items.CHAINMAIL_BOOTS, TinkerFluids.iron, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_HELMET, TinkerFluids.iron, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(Items.CHAINMAIL_LEGGINGS, TinkerFluids.iron, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(Items.CHAINMAIL_CHESTPLATE, TinkerFluids.iron, Material.VALUE_Ingot * 3);
        }

        public static void addTconstructThermalRecipes() {

            ///////// Melt Bronze /////////
            // Armor
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.BRONZE.armorBoots, TinkerFluids.bronze, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.BRONZE.armorHelmet, TinkerFluids.bronze, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.BRONZE.armorLegs, TinkerFluids.bronze, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.BRONZE.armorChestplate, TinkerFluids.bronze, Material.VALUE_Ingot * 4);
            // Tools
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemPickaxe, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemAxe, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemHoe, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemShovel, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemFishingRod, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemSickle, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemShears, TinkerFluids.bronze, Material.VALUE_Ingot );
            // Weapons
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemBow, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemSword, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemShield, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.BRONZE.itemHammer, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );

            ///////// Melt Copper /////////
            // Armor
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.COPPER.armorBoots, TinkerFluids.copper, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.COPPER.armorHelmet, TinkerFluids.copper, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.COPPER.armorLegs, TinkerFluids.copper, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.COPPER.armorChestplate, TinkerFluids.copper, Material.VALUE_Ingot * 4);
            // Tools
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemPickaxe, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemAxe, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemHoe, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemShovel, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemFishingRod, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemSickle, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemShears, TinkerFluids.bronze, Material.VALUE_Ingot );
            // Weapons
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemBow, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemSword, TinkerFluids.bronze, Material.VALUE_Ingot );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemShield, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );
            TinkerRegistry.registerMelting(TFEquipment.ToolSet.COPPER.itemHammer, TinkerFluids.bronze, Material.VALUE_Ingot * 2 );

            ///////// Melt Tin /////////
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.TIN.armorBoots, TinkerFluids.tin, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.TIN.armorHelmet, TinkerFluids.tin, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.TIN.armorLegs, TinkerFluids.tin, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.TIN.armorChestplate, TinkerFluids.tin, Material.VALUE_Ingot * 4);

            ///////// Melt Silver /////////
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.SILVER.armorBoots, TinkerFluids.silver, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.SILVER.armorHelmet, TinkerFluids.silver, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.SILVER.armorLegs, TinkerFluids.silver, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.SILVER.armorChestplate, TinkerFluids.silver, Material.VALUE_Ingot * 4);

            ///////// Melt Lead /////////
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.LEAD.armorBoots, TinkerFluids.lead, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.LEAD.armorHelmet, TinkerFluids.lead, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.LEAD.armorLegs, TinkerFluids.lead, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.LEAD.armorChestplate, TinkerFluids.lead, Material.VALUE_Ingot * 4);

            ///////// Melt Nickel /////////
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.NICKEL.armorBoots, TinkerFluids.nickel, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.NICKEL.armorHelmet, TinkerFluids.nickel, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.NICKEL.armorLegs, TinkerFluids.nickel, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.NICKEL.armorChestplate, TinkerFluids.nickel, Material.VALUE_Ingot * 4);

            ///////// Melt Electrum /////////
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.ELECTRUM.armorBoots, TinkerFluids.electrum, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.ELECTRUM.armorHelmet, TinkerFluids.electrum, Material.VALUE_Ingot * 2);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.ELECTRUM.armorLegs, TinkerFluids.electrum, Material.VALUE_Ingot * 3);
            TinkerRegistry.registerMelting(TFEquipment.ArmorSet.ELECTRUM.armorChestplate, TinkerFluids.electrum, Material.VALUE_Ingot * 4);

            ///////// Melt Invar /////////
            // - This currently does not have an ingot it turns into in the smeltery

            ///////// Melt Platinum /////////
            // - This currently does not have an ingot it turns into in the smeltery
        }

}

