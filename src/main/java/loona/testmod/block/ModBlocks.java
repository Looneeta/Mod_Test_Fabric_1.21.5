package loona.testmod.block;

import loona.testmod.TestMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore",
           AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE));

    public static final Block HIGH_IRON_ORE = registerBlock("high_iron_ore",
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE));


    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {

        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TestMod.MOD_ID, name));

        Block block = new Block(blockSettings.registryKey(key));

        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, key, block);

    }



    private static void registerBlockItem(String name, Block block) {

        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TestMod.MOD_ID, name));

        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));

        Registry.register(Registries.ITEM, key, item);

    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registrando Mod Blocks para: " + TestMod.MOD_ID);
    }
}
