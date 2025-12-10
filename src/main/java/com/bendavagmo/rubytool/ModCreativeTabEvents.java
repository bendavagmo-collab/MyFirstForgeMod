package com.bendavagmo.rubytool;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RubyTool.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabEvents {

    @SubscribeEvent
    public static void addItemsToTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY);
        }
    }
}
