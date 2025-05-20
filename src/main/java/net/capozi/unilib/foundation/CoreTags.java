package net.capozi.unilib.foundation;

import net.capozi.unilib.Unilib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CoreTags {
    public static class Craftable {
        public static final TagKey<Item> CRAFTABLE_ITEMS =
                createCraftableItemTag("craftable_items");
        public static final TagKey<Block> CRAFTABLE_BLOCKS =
                createCraftableBlockTag("craftable_blocks");
        public static final TagKey<Item> CRAFTABLE_BLOCK_ITEMS =
                createCraftableBlockItemsTag("craftable_blocks");
        public static final TagKey<Item> SPECIAL_CRAFTABLE =
                createSpecialCraftingItemsTag("special_crafting");
        private static TagKey<Item> createCraftableItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Block> createCraftableBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Item> createCraftableBlockItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Item> createSpecialCraftingItemsTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Uncraftable {
        public static final TagKey<Item> UNCRAFTABLE_ITEMS =
                createUncraftableItemsTag("uncraftable_items");
        public static final TagKey<Block> UNCRAFTABLE_BLOCKS =
                createUncraftableBlocksTag("uncraftable_blocks");
        public static final TagKey<Item> UNCRAFTABLE_BLOCK_ITEMS =
                createUncraftableBlockItemsTag("uncraftable_block_items");
        private static TagKey<Item> createUncraftableItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Block> createUncraftableBlocksTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Item> createUncraftableBlockItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Breakable{
        public static final TagKey<Block> BREAKABLE_BLOCKS =
                createBreakableBlockTag("breakable_blocks");
        private static TagKey<Block> createBreakableBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Item> BREAKABLE_BLOCK_ITEMS =
                createBreakableBlockItemTag("breakable_block_items");
        private static TagKey<Item> createBreakableBlockItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Unbreakable {
        public static final TagKey<Block> UNBREAKABLE_BLOCKS =
                createUnbreakableBlockTag("unbreakable_blocks");
        private static TagKey<Block> createUnbreakableBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Item> UNBREAKABLE_BLOCK_ITEMS =
                createUnbreakableBlockItemsTag("unbreakable_block_items");
        private static TagKey<Item> createUnbreakableBlockItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
}
