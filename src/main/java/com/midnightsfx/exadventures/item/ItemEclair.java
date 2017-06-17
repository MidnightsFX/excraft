package com.midnightsfx.exadventures.item;

import com.midnightsfx.exadventures.exadventures;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by MidnightsFX on 6/16/17.
 */
public class ItemEclair extends ItemFood {

    private String name;
    public String texture;
    private PotionEffect potionid1;
    private PotionEffect potionid2;
    private float potionEffectProbability;


    public ItemEclair(int healAmount, float saturationModifier) {
        super(healAmount, saturationModifier, false);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setAlwaysEdible();
        this.setRegistryName("eclair");
        this.setUnlocalizedName(exadventures.MODID + "." + this.getRegistryName().getResourcePath());
        //this.setUnlocalizedName(unlocalizedName);
        //this.setTextureName(exadventures.MODID + ":" + unlocalizedName);
        //this.effects = effects;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);

        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(this.potionid1));
            player.addPotionEffect(new PotionEffect(this.potionid2));
        }
    }



}
