package com.devdyna.mekajadeupgrade;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MekanismJadeUpgrades.MOD_ID)
public class MekanismJadeUpgrades {
    public static final String MOD_ID = "mekajadeupgrade";

    @SuppressWarnings("removal")
    public MekanismJadeUpgrades() {
        this(FMLJavaModLoadingContext.get());
    }

    public MekanismJadeUpgrades(FMLJavaModLoadingContext context) {
    }
}
