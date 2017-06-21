package com.midnightsfx.exacompat;

import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.recipes.recipeRegister;
import com.midnightsfx.exacompat.util.creativeTabEXA;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by MidnightsFX on 6/18/2017.
 */

@Mod(modid = exacompat.MODID, name = exacompat.MODNAME, version = exacompat.VERSION, dependencies = "required-after:Forge", useMetadata = true)
public class exacompat {

    public static final String MODID = "exacompat";
    public static final String MODNAME = "Excellent Adventures Compatability Layer";
    public static final String VERSION = "0.1.1";
    public static final creativeTabEXA creativeTab = new creativeTabEXA();

    @SidedProxy(clientSide = "com.midnightsfx.exacompat.proxy.clientProxy", serverSide = "com.midnightsfx.exacompat.proxy.commonProxy")
    public static commonProxy proxy;

    @Mod.Instance
    public static exacompat INSTANCE;

    //public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        //logger = event.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        recipeRegister.init(); // Initialize recipes, regardless of client or server
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
