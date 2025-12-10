package com.bendavagmo.rubytool;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

@Mod(RubyTool.MODID)
public final class RubyTool {
    public static final String MODID = "rubytool";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RubyTool(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();

        // Register items
        ModItems.ITEMS.register(modBusGroup);

        // Setup event
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("RubyTool mod has loaded!");
    }
}
