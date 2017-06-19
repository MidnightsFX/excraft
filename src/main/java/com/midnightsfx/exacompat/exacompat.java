package com.midnightsfx.exacompat;

import com.midnightsfx.exacompat.proxy.commonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by MidnightsFX on 6/18/2017.
 */

@Mod(modid = exacompat.MODID, name = exacompat.MODNAME, version = exacompat.VERSION, dependencies = "required-after:Forge", useMetadata = true)
public class exacompat {

    public static final String MODID = "exadventures";
    public static final String MODNAME = "Excellent Adventures Mod";
    public static final String VERSION = "0.1.1";

    // I kid, not proxying yet, just laying it down.
    //@SidedProxy(clientSide = "midnightsfx.exacompat.proxy.clientProxy", serverSide = "midnightsfx.exacompat.proxy.commonProxy")
    //public static commonProxy proxy;
    public static commonProxy proxy = new commonProxy();

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
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
