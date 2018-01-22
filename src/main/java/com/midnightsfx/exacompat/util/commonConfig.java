package com.midnightsfx.exacompat.util;

import com.midnightsfx.exacompat.exacompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by MidnightsFX on 6/18/2017.
 */
public class commonConfig {

    private Configuration config;
    //region Categories
    private static final String TCON = "TConstructRecipes";
    private static final String VANILLA = "AltVanillaRecipes";
    private static final String EXARecipe = "EXARecipes";
    private static final String EXANV = "EXANetherVanillaWorldGen";
    private static final String EXANT = "EXANetherThermalWorldGen";

    //region Recipes - Config Values
    // Tcon smelting Configs
    public boolean vanillaTconSmelt;
    public boolean thermalTconSmelt;
    // Alt vanilla recipe configs
    public boolean vanillaAltClay;
    public boolean vanillaFleshToLeather;
    // Cotton Recipe configs
    public boolean exaCottonString;
    public boolean exaCottonWool;
    public int exaCottonSeedDrop;
    // Vanilla Nether Ores configs
    public boolean exaNetherVanillaOres;
    public boolean exaNetherVanillaOreGen;
    public int exaNetherVanillaOreGenAmount;
    public int exaNetherVanillaClustersCoal;
    public int exaNetherVanillaClustersIron;
    public int exaNetherVanillaClustersGold;
    public int exaNetherVanillaClustersLapis;
    public int exaNetherVanillaClustersRedstone;
    public int exaNetherVanillaClustersDiamond;
    public int exaNetherVanillaClustersEmerald;
    // Thermal Expansion Nether ores configs
    public boolean exaNetherThermalOres;
    public boolean exaNetherThermalOreGen;
    public int exaNetherThermalOreGenAmount;
    public int exaNetherThermalClustersCopper;
    public int exaNetherThermalClustersNickel;
    public int exaNetherThermalClustersTin;
    public int exaNetherThermalClustersSilver;
    public int exaNetherThermalClustersLead;



    public commonConfig(File configFile) {
        config = new Configuration(configFile);
        MinecraftForge.EVENT_BUS.register(this);
        loadConfig();
    }

    public Configuration getConfig() {
        return config;
    }

    private void loadConfig() {
        //region TinkersConstructRecipes
        vanillaTconSmelt = config.getBoolean("enableVanillaTconMeltdown", TCON, true, "Enables Melting down of VANILLA armor, weapons and tools.");
        thermalTconSmelt = config.getBoolean("enableThermalTconMeltdown", TCON, true, "Enables Melting down of THERMAL FOUNDATION armor, weapons and tools.");

        //region AltVanillaRecipes
        vanillaAltClay = config.getBoolean("enableAltClay", VANILLA, true, "Enable a simple recipe to make clay from dirt, wheat and water.");
        vanillaFleshToLeather = config.getBoolean("enableFleshToLeather", VANILLA, false, "Enable smelting Rotten Flesh to leather.");

        //region EXARecipes
        exaCottonString = config.getBoolean("enableCottonToString", EXARecipe, true, "Enable making string from cotton.");
        exaCottonWool = config.getBoolean("enableCottonToWool", EXARecipe, true, "Enable making wool from cotton.");
        exaCottonSeedDrop = config.getInt("cottonSeedDropRate", EXARecipe, 3, 0, 5, "Drop rate for cotton Seeds. set to zero to disable.");

        //region EXAWorldgen
        exaNetherVanillaOres = config.getBoolean("enableNetherVanillaOres", EXANV, true, "Enable recipes for Vanilla Nether ores.");
        exaNetherThermalOres = config.getBoolean("enableNetherThermalOres", EXANV, true, "Enables Recipes for Thermal Foundation Nether ores.");
        // Vanilla Nether Worldgen
        exaNetherVanillaOreGen = config.getBoolean("enableNetherVanillaOres", EXANV, true, "Enable Generating Vanilla (re-textured) Ores in the Nether.");
        exaNetherVanillaOreGenAmount = config.getInt("vanillaNetherVeinsize", EXANV,5,1,20,"Amount of ores per cluster multiplier. (veinsize * this value).");
        exaNetherVanillaClustersCoal = config.getInt("ClustersCoal", EXANV,7,1,20,"The number of clusters of coal that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersIron = config.getInt("ClustersIron", EXANV,5,1,20,"The number of clusters of Iron that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersGold = config.getInt("ClustersGold", EXANV,3,1,20,"The number of clusters of Gold that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersLapis = config.getInt("ClustersLapis", EXANV,3,1,20,"The number of clusters of Lapis that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersRedstone = config.getInt("ClustersRedstone", EXANV,5,1,20,"The number of clusters of Redstone that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersDiamond = config.getInt("ClustersDiamond", EXANV,2,1,20,"The number of clusters of Diamond that will attempt to be generated in a chunk.");
        exaNetherVanillaClustersEmerald = config.getInt("ClustersEmerald", EXANV,2,1,20,"The number of clusters of Emerald that will attempt to be generated in a chunk.");
        // Thermal Expansion Nether Worldgen
        exaNetherThermalOreGen = config.getBoolean("enableNetherThermalOres", EXANT, true, "Enable Generating Vanilla (re-textured) Ores in the Nether.");
        exaNetherThermalOreGenAmount = config.getInt("thermalNetherVeinsize", EXANT,4,1,20,"Amount of ores per cluster multiplier. (veinsize * this value).");
        exaNetherThermalClustersCopper = config.getInt("ClustersCopper", EXANT,5,1,20,"The number of clusters of Copper that will attempt to be generated in a chunk.");
        exaNetherThermalClustersNickel = config.getInt("ClustersNickel", EXANT,3,1,20,"The number of clusters of Nickel that will attempt to be generated in a chunk.");
        exaNetherThermalClustersTin = config.getInt("ClustersTin", EXANT,3,1,20,"The number of clusters of Tin that will attempt to be generated in a chunk.");
        exaNetherThermalClustersSilver = config.getInt("ClustersSilver", EXANT,2,1,20,"The number of clusters of Silver that will attempt to be generated in a chunk.");
        exaNetherThermalClustersLead = config.getInt("ClustersLead", EXANT,2,1,20,"The number of clusters of Lead that will attempt to be generated in a chunk.");


        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(exacompat.MODID)) {
            loadConfig();
        }
    }
}
