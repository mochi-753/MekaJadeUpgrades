package com.devdyna.mekajadeupgrade.datagen;

import com.devdyna.mekajadeupgrade.MekaJadeUpgrades;
import com.devdyna.mekajadeupgrade.datagen.client.DataLang;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings({"null"})
@Mod.EventBusSubscriber(modid = MekaJadeUpgrades.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Controller {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        providerGen(event, generator, new DataLang(packOutput));
    }

    private static <T extends DataProvider> void providerGen(GatherDataEvent event, DataGenerator generator, T f) {
        generator.addProvider(event.includeClient(), f);
    }
}
