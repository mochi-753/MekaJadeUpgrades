package com.devdyna.modname_id.datagen.server;

import java.util.concurrent.CompletableFuture;
import com.devdyna.modname_id.Main;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("null")

public class DataItemTag extends ItemTagsProvider {

    public DataItemTag(PackOutput o, CompletableFuture<Provider> p, CompletableFuture<TagLookup<Block>> b,ExistingFileHelper f) {
        super(o, p, b,Main.MODID,f);
    }

    @Override
    protected void addTags(Provider p) {
        // tag(ItemTag.IT)
        //         .add(Items.ACACIA_BOAT);
    }

}