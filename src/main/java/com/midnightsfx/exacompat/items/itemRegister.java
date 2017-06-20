package com.midnightsfx.exacompat.items;


import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemRegister {

    public static itemBaseHelper eclair;
    public static itemBaseHelper cotton;
    public static cottonSeed cottonseed;

    public static void init() {
        cotton = register(new itemBaseHelper("cotton"));
        cottonseed = register(new cottonSeed());
        eclair = register(new itemBaseHelper("eclair").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof itemModelRegister) {
            ((itemModelRegister)item).registerItemModel(item);
        }

        return item;
    }
}
