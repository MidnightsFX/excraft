package com.midnightsfx.exadventures;

import com.midnightsfx.exadventures.init.genericRecipes;
import com.midnightsfx.exadventures.init.modRecipes;
import com.midnightsfx.exadventures.item.ItemRegistar;
import com.midnightsfx.exadventures.util.exConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = exadventures.MODID, version = exadventures.VERSION, name = exadventures.MODNAME)
public class exadventures
{
    public static final String MODID = "exadventures";
    public static final String MODNAME = "Excellent Adventures Mod";
    public static final String VERSION = "0.1";

    @Mod.Instance
    public static exadventures INSTANCE;

    public exConfig config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        ItemRegistar.callRegistry(e); //Register items
        config = new exConfig(e.getSuggestedConfigurationFile()); // Create/intake config

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if(config.genericRecipes){
            genericRecipes.addRecipes(); // Adds generic recipes - these are all vanilla recipes
        }

        if(config.modTConstructRecipes){
            modRecipes.addTConstructRecipes(); // Adds Modded Tinkers Construct Recipes
        }

        if(config.modThermalTConstructRecipes){
            modRecipes.addTconstructThermalRecipes(); // Adds Modded Thermal Foundation to Tinkers Construct Recipes
        }

        if(config.addEclair){
            genericRecipes.addEclair();
        }

    }

}
