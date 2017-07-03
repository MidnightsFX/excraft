package com.midnightsfx.exacompat.items;


import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import com.midnightsfx.exacompat.items.helpers.itemOreHelper;
import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemRegister {

    // Register Thermal foundation based ingots
    public static itemOreHelper ingotCopper;
    public static itemOreHelper ingotSilver;
    public static itemOreHelper ingotTin;
    public static itemOreHelper ingotLead;
    public static itemOreHelper ingotNickel;

    // Register cotton stuffs
    public static itemOreHelper cotton;
    public static itemCottonSeed cottonseed;
    public static itemEclair eclair;

    public static void init() {
        // Register Thermal Foundation oredict metals
        ingotCopper = register(new itemOreHelper("ingotCopper", "ingotCopper"));
        ingotSilver = register(new itemOreHelper("ingotSilver", "ingotSilver"));
        ingotTin = register(new itemOreHelper("ingotTin", "ingotTin"));
        ingotLead = register(new itemOreHelper("ingotLead", "ingotLead"));
        ingotNickel = register(new itemOreHelper("ingotNickel", "ingotNickel"));

        // Register Cotton
        cotton = register(new itemOreHelper("cotton", "cotton"));
        cottonseed = register(new itemCottonSeed());
        if(commonProxy.config.exaCottonSeedDrop > 0){ // Add cotton to grass drop, if its not set to a zero rate
            MinecraftForge.addGrassSeed(new ItemStack(itemRegister.cottonseed), commonProxy.config.exaCottonSeedDrop);
        }
        eclair = register(new itemEclair());
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof itemModelRegister) {
            ((itemModelRegister)item).registerItemModel(item);
        }
        if (item instanceof itemOreDictInterface) {
            ((itemOreDictInterface)item).initOreDict();
        }

        return item;
    }
}
