package com.midnightsfx.exadventures.gui;

import com.midnightsfx.exadventures.exadventures;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;

/** Created by MidnightsFX on 6/7/17. */
public class modGuiConfig extends GuiConfig {
    public modGuiConfig(GuiScreen guiScreen) {
        super(
                guiScreen,
                exadventures.INSTANCE.config.getConfigElements(),
                exadventures.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(exadventures.INSTANCE.config.getConfig().toString())
        );
    }

    @Override
    public void initGui()
    {
        // You can add buttons and initialize fields here
        super.initGui();
    }
}
