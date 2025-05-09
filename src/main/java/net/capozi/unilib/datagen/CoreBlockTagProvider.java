package net.capozi.unilib.datagen;

import net.capozi.unilib.CoreTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class CoreBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(CoreTags.Craftable.CRAFTABLE_BLOCKS)
                .forceAddTag(BlockTags.ALL_SIGNS)
                .forceAddTag(BlockTags.ALL_HANGING_SIGNS)
                .forceAddTag(BlockTags.ANVIL)
                .forceAddTag(BlockTags.BAMBOO_BLOCKS)
                .forceAddTag(BlockTags.BANNERS)
                .forceAddTag(BlockTags.BEDS)
                .forceAddTag(BlockTags.BUTTONS)
                .forceAddTag(BlockTags.CANDLES)
                .forceAddTag(BlockTags.DOORS)
                .forceAddTag(BlockTags.FENCES)
                .forceAddTag(BlockTags.FENCE_GATES)
                .forceAddTag(BlockTags.RAILS)
                .forceAddTag(BlockTags.SLABS)
                .forceAddTag(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .forceAddTag(BlockTags.STAIRS)
                .forceAddTag(BlockTags.STONE_BRICKS)
                .forceAddTag(BlockTags.TERRACOTTA)
                .forceAddTag(BlockTags.TRAPDOORS)
                .forceAddTag(BlockTags.WALLS)
                .forceAddTag(BlockTags.WART_BLOCKS)
                .forceAddTag(BlockTags.WOOL)
                .forceAddTag(BlockTags.WOOL_CARPETS)
                .forceAddTag(BlockTags.CAMPFIRES)
                .forceAddTag(BlockTags.CANDLE_CAKES)
                .forceAddTag(BlockTags.CAULDRONS)
                .forceAddTag(BlockTags.FLOWER_POTS)
                .add(Blocks.RESPAWN_ANCHOR)
                .add(Blocks.LADDER)
                .add(Blocks.SCAFFOLDING)
                .add(Blocks.MUD)
                .add(Blocks.MUD_BRICK_SLAB)
                .add(Blocks.MUD_BRICKS)
                .add(Blocks.MUD_BRICK_STAIRS)
                .add(Blocks.MUD_BRICK_WALL)
                .add(Blocks.PACKED_MUD);
        getOrCreateTagBuilder(CoreTags.Breakable.BREAKABLE_BLOCKS)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SWORD_EFFICIENT);
        getOrCreateTagBuilder(CoreTags.Unbreakable.UNBREAKABLE_BLOCKS)
                .forceAddTag(BlockTags.WITHER_IMMUNE)
                .add(Blocks.PETRIFIED_OAK_SLAB);
    }
    public CoreBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
}
