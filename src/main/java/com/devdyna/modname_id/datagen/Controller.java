package com.devdyna.modname_id.datagen;

import static com.devdyna.modname_id.Main.MODID;

import java.util.concurrent.CompletableFuture;

import java.util.List;
import java.util.Set;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import com.devdyna.modname_id.datagen.client.DataBlockModelState;
import com.devdyna.modname_id.datagen.client.DataItemModel;
import com.devdyna.modname_id.datagen.client.DataLang;
import com.devdyna.modname_id.datagen.server.DataBlockTag;
import com.devdyna.modname_id.datagen.server.DataItemTag;
import com.devdyna.modname_id.datagen.server.DataLoot;
import com.devdyna.modname_id.datagen.server.DataRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = MODID)
public class Controller {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator g = e.getGenerator();
        PackOutput po = g.getPackOutput();
        ExistingFileHelper f = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> pr = e.getLookupProvider();

        // client

        providerGen(e, g, new DataBlockModelState(po, f));
        providerGen(e, g, new DataItemModel(po, f));
        providerGen(e, g, new DataLang(po));

        // server
        DataBlockTag blocktag = new DataBlockTag(po, pr, f);
        providerGen(e, g, blocktag);
        providerGen(e, g, new DataItemTag(po, pr, blocktag.contentsGetter(),f));
        providerGen(e, g, new LootTableProvider(po, Set.of(),
                List.of(
                        // list of any loot table entries inside ./server/tables/
                        new LootTableProvider.SubProviderEntry(DataLoot::new, LootContextParamSets.BLOCK)),
                pr));
        providerGen(e, g, new DataRecipe(po, pr));

    }

    private static <T extends DataProvider> void providerGen(GatherDataEvent e, DataGenerator g, T f) {
        g.addProvider(e.includeClient(), f);
    }

}
