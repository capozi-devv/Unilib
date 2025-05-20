package net.capozi.unilib.datagen;

import net.capozi.unilib.foundation.CoreTags;
import net.capozi.unilib.foundation.blocks.natural.NaturalStoneTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class UnilibBlockTagProvider extends FabricTagProvider.BlockTagProvider {
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
                .add(Blocks.GRAY_GLAZED_TERRACOTTA)
                .add(Blocks.WHITE_GLAZED_TERRACOTTA)
                .add(Blocks.BLACK_GLAZED_TERRACOTTA)
                .add(Blocks.RED_GLAZED_TERRACOTTA)
                .add(Blocks.ORANGE_GLAZED_TERRACOTTA)
                .add(Blocks.YELLOW_GLAZED_TERRACOTTA)
                .add(Blocks.GREEN_GLAZED_TERRACOTTA)
                .add(Blocks.BLUE_GLAZED_TERRACOTTA)
                .add(Blocks.PURPLE_GLAZED_TERRACOTTA)
                .add(Blocks.PINK_GLAZED_TERRACOTTA)
                .add(Blocks.CYAN_GLAZED_TERRACOTTA)
                .add(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)
                .add(Blocks.MAGENTA_GLAZED_TERRACOTTA)
                .add(Blocks.LIME_GLAZED_TERRACOTTA)
                .add(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)
                .add(Blocks.BROWN_GLAZED_TERRACOTTA)
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
        getOrCreateTagBuilder(NaturalStoneTags.StoneBlocksTags.STONE_BLOCKS)
                .forceAddTag(BlockTags.TERRACOTTA)
                .forceAddTag(NaturalStoneTags.OreBlocksTags.ORE_BLOCKS)
                .add(Blocks.STONE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.DEEPSLATE)
                .add(Blocks.COBBLED_DEEPSLATE)
                .add(Blocks.BLACKSTONE)
                .add(Blocks.TUFF)
                .add(Blocks.CALCITE)
                .add(Blocks.BASALT)
                .add(Blocks.END_STONE)
                .add(Blocks.DRIPSTONE_BLOCK)
                .add(Blocks.SANDSTONE);
        getOrCreateTagBuilder(NaturalStoneTags.OreBlocksTags.ORE_BLOCKS)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES);
        getOrCreateTagBuilder(CoreTags.Uncraftable.UNCRAFTABLE_BLOCKS)
                .forceAddTag(NaturalStoneTags.StoneBlocksTags.STONE_BLOCKS)
                .forceAddTag(CoreTags.Unbreakable.UNBREAKABLE_BLOCKS)
                .forceAddTag(BlockTags.SAND)
                .forceAddTag(BlockTags.DIRT)
                .forceAddTag(BlockTags.LOGS)
                .forceAddTag(BlockTags.LEAVES)
                .forceAddTag(BlockTags.FLOWERS)
                .forceAddTag(BlockTags.ICE)
                .forceAddTag(BlockTags.CORALS)
                .forceAddTag(BlockTags.CAVE_VINES)
                .forceAddTag(BlockTags.NYLIUM)
                .add(Blocks.BAMBOO)
                .add(Blocks.GILDED_BLACKSTONE);
    }
    public UnilibBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
}