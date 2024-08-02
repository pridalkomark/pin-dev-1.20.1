package net.pin.dev.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;

public class ModTags {

    public static class Block {
        public static final TagKey<net.minecraft.block.Block> STEEL =
                createTag("steel");

        private static TagKey<net.minecraft.block.Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(PinDev.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(PinDev.MOD_ID, name));
        }
    }
}
