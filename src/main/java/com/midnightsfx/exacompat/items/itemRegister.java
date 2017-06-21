package com.midnightsfx.exacompat.items;


import com.midnightsfx.exacompat.items.helpers.itemBaseHelper;
import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import com.midnightsfx.exacompat.items.helpers.itemOreHelper;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemRegister {

    public static itemOreHelper cotton;
    public static itemCottonSeed cottonseed;
    public static itemEclair eclair;

    public static void init() {
        cotton = register(new itemOreHelper("cotton", "oreCotton"));
        cottonseed = register(new itemCottonSeed());
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
