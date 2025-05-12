package net.capozi.unilib.natural;

import net.capozi.unilib.Unilib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class NaturalBlockTags {
    public static class StoneBlocks {
        private static TagKey<Block> createStoneBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Block> STONE_BLOCKS =
                createStoneBlockTag("stone_blocks");
    }
    public static class StoneItems {
        private static TagKey<Item> createStoneBlockItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Item> STONE_ITEMS =
                createStoneBlockItemsTag("stone_items");
    }
}

