package com.devdyna.mekajadeupgrade.datagen.client;


import com.devdyna.mekajadeupgrade.MekanismJadeUpgrades;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class DataLang extends LanguageProvider {
    public DataLang(PackOutput output) {
        super(output, MekanismJadeUpgrades.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("config.jade.plugin_" + MekanismJadeUpgrades.MOD_ID + ".upgrades", "MekaJadeUpgrades Info");
    }
}
