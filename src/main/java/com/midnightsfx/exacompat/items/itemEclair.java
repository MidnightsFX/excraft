package com.midnightsfx.exacompat.items;

import com.midnightsfx.exacompat.exacompat;
import com.midnightsfx.exacompat.items.helpers.itemOreDictInterface;
import com.midnightsfx.exacompat.util.itemModelRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by MidnightsFX on 6/20/17.
 */
public class itemEclair extends ItemFood implements itemModelRegister, itemOreDictInterface {

    public itemEclair() {
        super(2, 0.6f, false);
        this.setUnlocalizedName("eclair");
        this.setRegistryName("eclair");
        this.setCreativeTab(exacompat.creativeTab);
        this.setAlwaysEdible();
        this.maxStackSize = 16;
    }

    @Override
    public void registerItemModel(Item item) {
        exacompat.proxy.registerItemRenderer(this, 0, "eclair");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("eclair", this);
    }

    // Give potion effects on eating eclairs
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3000, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 3000, 1));
        }
    }


}
