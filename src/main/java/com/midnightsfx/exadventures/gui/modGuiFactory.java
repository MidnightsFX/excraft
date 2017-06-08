package com.midnightsfx.exadventures.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

/**
 * Created by MidnightsFX on 6/7/17.
 */

public class modGuiFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft mc) {
    }

//    @Override
//    public boolean hasConfigGui() {
//        return true;
//    }
//
//    @Override
//    public GuiScreen createConfigGui(GuiScreen parentScreen) {
//        return new modGuiConfig(parentScreen);
//    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return modGuiConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }

}
