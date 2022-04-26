package com.rrstudio.mods.datagen;

import com.rrstudio.mods.CrystalQuarry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CrystalQuarry.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {

        }

        if (event.includeClient()) {
            generator.addProvider(new ModLanguageProvider(generator, "en_us"));
        }

    }
}
