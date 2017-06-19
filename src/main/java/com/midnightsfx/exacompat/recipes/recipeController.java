package com.midnightsfx.exacompat.recipes;

import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.recipes.tinkers.smelteryThermalFoundation;
import com.midnightsfx.exacompat.recipes.vanilla.altClayRecipe;
import com.midnightsfx.exacompat.recipes.vanilla.fleshToLeatherRecipe;
import net.minecraftforge.fml.common.Loader;


/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class recipeController {

    public static boolean isTConstructInstalled = Loader.isModLoaded("tinkersconstruct");
    public static boolean isThermalFoundation = Loader.isModLoaded("thermalfoundation");

    public static void initRecipes(){

        // Load the recipes to smelt down vanillia metal armors, tools and weapons
        if(commonProxy.config.vanillaTconSmelt && isTConstructInstalled){
            smelteryThermalFoundation.addTconstructRecipes();
        }

        // Load the recipes to smelt down thermal foundation metal armors, tools, and weapons
        if(commonProxy.config.thermalTconSmelt && isTConstructInstalled && isThermalFoundation){
            smelteryThermalFoundation.addTconstructThermalRecipes();
        }

        // Vanilla recipe for making clay from dirt and sand
        if(commonProxy.config.vanillaAltClay){
            altClayRecipe.addAltClay();
        }

        // Vanilla smelting recipe for rotten flesh to leather
        if(commonProxy.config.vanillaFleshToLeather){
            fleshToLeatherRecipe.addFleshToLeather();
        }
    }

}
