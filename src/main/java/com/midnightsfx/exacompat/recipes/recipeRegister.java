package com.midnightsfx.exacompat.recipes;

import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.recipes.exa.cottonRecipes;
import com.midnightsfx.exacompat.recipes.tinkers.smelteryThermalFoundation;
import com.midnightsfx.exacompat.recipes.vanilla.altClayRecipe;
import com.midnightsfx.exacompat.recipes.vanilla.fleshToLeatherRecipe;
import net.minecraftforge.fml.common.Loader;


/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class recipeRegister {

    public static boolean isTConstructInstalled = Loader.isModLoaded("tinkersconstruct");
    public static boolean isThermalFoundation = Loader.isModLoaded("thermalfoundation");

    public static void init(){

        // Load the recipes to smelt down vanilla metal armors, tools and weapons
        if(commonProxy.config.vanillaTconSmelt && isTConstructInstalled){
            smelteryThermalFoundation.addTconstructRecipes();
        }
        // Load the recipes to smelt down thermal foundation metal armors, tools, and weapons
        if(commonProxy.config.thermalTconSmelt && isTConstructInstalled && isThermalFoundation){
            smelteryThermalFoundation.addTconstructThermalRecipes();
        }

        // Vanilla recipe for making clay from dirt and sand
        if(commonProxy.config.vanillaAltClay){altClayRecipe.addAltClay();}
        // Vanilla smelting recipe for rotten flesh to leather
        if(commonProxy.config.vanillaFleshToLeather){fleshToLeatherRecipe.addFleshToLeather();}

        // EXA Cotton to string
        if(commonProxy.config.exaCottonString){cottonRecipes.addToString();}
        // EXA Cotton to wool
        if(commonProxy.config.exaCottonString){cottonRecipes.addToWool();}
    }

}
