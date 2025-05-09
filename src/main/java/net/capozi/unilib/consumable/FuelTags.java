package net.capozi.unilib.consumable;

import net.capozi.unilib.Unilib;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class FuelTags {
    public static class FurnaceFuels {
        public static final TagKey<Item> FURNACE_FUELS =
                createFurnaceFuelItemTag("furnace_fuels");
        private static TagKey<Item> createFurnaceFuelItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }
    public static class EnchantingFuels {
        public static final TagKey<Item> ENCHANTING_FUELS =
                createEnchantingFuelItemTag("enchanting_fuels");
        private static TagKey<Item> createEnchantingFuelItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Unilib.MOD_ID, name));
        }
    }

}
