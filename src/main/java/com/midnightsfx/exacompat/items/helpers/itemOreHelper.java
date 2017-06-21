package com.midnightsfx.exacompat.items.helpers;

import com.midnightsfx.exacompat.items.helpers.itemBaseHelper;
import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemOreHelper extends itemBaseHelper implements itemOreDictInterface {

    private String oreName;

    public itemOreHelper(String name, String oreName) {
        super(name);

        this.oreName = oreName;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
