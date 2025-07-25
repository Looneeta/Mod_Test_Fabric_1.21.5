package loona.testmod.util;

import loona.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TestMod.MOD_ID, name));
        }

        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_HIGH_STEEL_TOOL = createTag("needs_high_steel_tool");


    }
    public static class Items{
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TestMod.MOD_ID, name));
        }
        public static final TagKey<Item> BRONZE_REPAIR = createTag("bronze_repair");
        public static final TagKey<Item> STEEL_REPAIR = createTag("steel_repair");
        public static final TagKey<Item> HIGH_IRON_REPAIR = createTag("high_iron_repair");
        public static final TagKey<Item> HIGH_STEEL_REPAIR = createTag("high_steel_repair");


    }
}
