package net.capozi.unilib;

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
                createCraftableBLockTag("craftable_blocks");
        public static final TagKey<Item> SPECIAL_CRAFTABLE =
                createSpecialCraftingItemsTag("special_crafting");
        private static TagKey<Item> createCraftableItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Block> createCraftableBLockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
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

        private static TagKey<Item> createUncraftableItemsTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Block> createUncraftableBlocksTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Breakable{
        public static final TagKey<Block> BREAKABLE_BLOCKS =
                createBreakableTag("breakable_blocks");
        private static TagKey<Block> createBreakableTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Unbreakable {
        public static final TagKey<Block> UNBREAKABLE_BLOCKS =
                createUnbreakableTag("unbreakable_blocks");
        private static TagKey<Block> createUnbreakableTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
}
