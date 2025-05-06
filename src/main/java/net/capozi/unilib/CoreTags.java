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
        private static TagKey<Item> createCraftableItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
        private static TagKey<Block> createCraftableBLockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Uncraftable {
        public static final TagKey<Item> UNCRAFTABLE_ITEMS =
                createTag("uncrafable_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Breakable{
        public static final TagKey<Block> BREAKABLE_BLOCKS =
                createTag("breakable_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class Unbreakable {
        public static final TagKey<Block> UNBREAKABLE_BLOCKS =
                createTag("unbreakable_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
    }
}
