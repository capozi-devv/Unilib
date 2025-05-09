package net.capozi.unilib.natural;

import net.capozi.unilib.Unilib;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class StoneTags {
    public static class Stones {
        private static TagKey<Block> createStoneBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Unilib.MOD_ID, name));
        }
        public static final TagKey<Block> STONE =
                createStoneBlockTag("stone");
    }
}
