package loona.testmod.item;

import loona.testmod.TestMod;
import loona.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BRONZE_INGOT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "bronze_ingot_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BRONZE_INGOT))
                    .displayName(Text.translatable("itemgroup.testmod.bronze_ingot_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);
                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModBlocks.HIGH_IRON_ORE);
                        entries.add(ModItems.RAW_HIGH_IRON);
                        entries.add(ModItems.HIGH_IRON_INGOT);
                        entries.add(ModItems.HIGH_IRON_HELMET);
                        entries.add(ModItems.HIGH_IRON_CHESTPLATE);
                        entries.add(ModItems.HIGH_IRON_LEGGINGS);
                        entries.add(ModItems.HIGH_IRON_BOOTS);
                        entries.add(ModItems.HIGH_STEEL_INGOT);
                        entries.add(ModItems.HIGH_STEEL_SWORD);
                        entries.add(ModItems.HIGH_STEEL_PICKAXE);
                        entries.add(ModItems.HIGH_STEEL_AXE);
                        entries.add(ModItems.HIGH_STEEL_SHOVEL);
                        entries.add(ModItems.HIGH_STEEL_HOE);

                    })

                    .build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registrando Item Groups para: " + TestMod.MOD_ID);
    }

}
