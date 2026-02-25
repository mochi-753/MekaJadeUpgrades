package com.devdyna.mekajadeupgrade.datagen.client;


import com.devdyna.mekajadeupgrade.MekaJadeUpgrades;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class DataLang extends LanguageProvider {
    public DataLang(PackOutput output) {
        super(output, MekaJadeUpgrades.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("config.jade.plugin_" + MekaJadeUpgrades.MOD_ID + ".upgrades", "MekaJadeUpgrades Info");
    }
}
