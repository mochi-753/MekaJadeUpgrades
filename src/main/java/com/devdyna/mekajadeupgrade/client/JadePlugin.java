package com.devdyna.mekajadeupgrade.client;

import com.devdyna.mekajadeupgrade.client.provider.UpgradeProvider;
import mekanism.common.block.prefab.BlockTile;
import mekanism.common.tile.base.TileEntityMekanism;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class JadePlugin implements IWailaPlugin {
    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(UpgradeProvider.INSTANCE, BlockTile.class);
    }

    @Override
    public void register(IWailaCommonRegistration registration) {
        registration.registerBlockDataProvider(UpgradeProvider.INSTANCE, TileEntityMekanism.class);
    }
}