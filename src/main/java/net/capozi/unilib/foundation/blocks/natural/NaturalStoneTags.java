package net.capozi.unilib.foundation.blocks.natural;

import net.capozi.unilib.Unilib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class NaturalStoneTags {
    public static class StoneBlocksTags {
        private static TagKey<Block> createStoneBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Block> STONE_BLOCKS =
                createStoneBlockTag("stone_blocks");
    }
    public static class StoneItemsTags {
        private static TagKey<Item> createStoneBlockItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Item> STONE_ITEMS =
                createStoneBlockItemsTag("stone_items");
    }
    public static class OreBlocksTags {
        private static TagKey<Block> createOreBlockTags(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Block> ORE_BLOCKS =
                createOreBlockTags("ore_blocks");
    }
    public static class OreItemsTags {
        private static TagKey<Item> createOreBlockItemTags(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Item> ORE_ITEMS =
                createOreBlockItemTags("ore_items");
    }
}