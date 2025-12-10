package com.bendavagmo.rubytool;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

// Main mod class
@Mod(RubyTool.MODID)
public final class RubyTool {
    public static final String MODID = "rubytool"; // this is your mod ID
    private static final Logger LOGGER = LogUtils.getLogger();

    public RubyTool(FMLJavaModLoadingContext context) {
        // Register common setup
        context.getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("RubyTool has loaded successfully!");
    }
}
