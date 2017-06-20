package com.midnightsfx.exacompat.items;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemOreHelper extends itemBaseHelper implements itemOreDictInterface{

    private String oreName;

    public itemOreHelper(String name, String oreDictName) {
        super(name);

        this.oreName = oreDictName;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
