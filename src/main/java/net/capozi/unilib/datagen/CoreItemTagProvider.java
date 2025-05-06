package net.capozi.unilib.datagen;

import net.capozi.unilib.CoreTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CoreItemTagProvider extends FabricTagProvider.ItemTagProvider {
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(CoreTags.Craftable.CRAFTABLE_ITEMS)
                .add(Items.ACACIA_BOAT)
                .add(Items.ARROW)
                .add(Items.ARMOR_STAND)
                .add(Items.BLACK_DYE)
                .add(Items.BLUE_DYE)
                .add(Items.BONE_MEAL)
                .add(Items.BOOK)
                .add(Items.BEETROOT_SOUP)
                .add(Items.BLAZE_POWDER)
                .add(Items.BOW)
                .add(Items.BOWL)
                .add(Items.BREAD)
                .add(Items.BRICK)
                .add(Items.BROWN_DYE)
                .add(Items.BUCKET)
                .add(Items.BUNDLE);
    }
    public CoreItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
}
