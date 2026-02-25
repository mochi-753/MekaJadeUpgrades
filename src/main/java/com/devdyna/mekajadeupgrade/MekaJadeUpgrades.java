package com.devdyna.mekajadeupgrade;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MekaJadeUpgrades.MOD_ID)
public class MekaJadeUpgrades {
    public static final String MOD_ID = "mekajadeupgrade";

    @SuppressWarnings("removal")
    public MekaJadeUpgrades() {
        this(FMLJavaModLoadingContext.get());
    }

    public MekaJadeUpgrades(FMLJavaModLoadingContext context) {
    }
}
