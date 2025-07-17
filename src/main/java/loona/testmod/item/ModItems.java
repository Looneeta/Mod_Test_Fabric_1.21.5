package loona.testmod.item;

import loona.testmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    // Acá se añaden los items.

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_ingot")))));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"raw_tin")))));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"tin_ingot")))));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_ingot")))));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new Item(new Item.Settings().pickaxe(ModToolMaterials.STEEL_TOOL_MATERIAL, 1.0f, -2.8f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_pickaxe")))));
    public static final Item STEEL_SWORD = registerItem("steel_sword", new Item(new Item.Settings().sword(ModToolMaterials.STEEL_TOOL_MATERIAL, 3.0f, -2.4f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_sword")))));
    public static final Item STEEL_AXE = registerItem("steel_axe", new Item(new Item.Settings().axe(ModToolMaterials.STEEL_TOOL_MATERIAL, 6.0f, -3.1f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_axe")))));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new Item(new Item.Settings().shovel(ModToolMaterials.STEEL_TOOL_MATERIAL, 1.5f, -3.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_shovel")))));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new Item(new Item.Settings().hoe(ModToolMaterials.STEEL_TOOL_MATERIAL, -2.0f, -1.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"steel_hoe")))));

    public static final Item RAW_HIGH_IRON = registerItem("raw_high_iron", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"raw_high_iron")))));
    public static final Item HIGH_STEEL_INGOT = registerItem("high_steel_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_ingot")))));
    public static final Item HIGH_STEEL_PICKAXE = registerItem("high_steel_pickaxe", new Item(new Item.Settings().pickaxe(ModToolMaterials.HIGH_STEEL_TOOL_MATERIAL, 1.0f, -2.8f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_pickaxe")))));
    public static final Item HIGH_STEEL_SWORD = registerItem("high_steel_sword", new Item(new Item.Settings().sword(ModToolMaterials.HIGH_STEEL_TOOL_MATERIAL, 3.0f, -2.4f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_sword")))));
    public static final Item HIGH_STEEL_AXE = registerItem("high_steel_axe", new Item(new Item.Settings().axe(ModToolMaterials.HIGH_STEEL_TOOL_MATERIAL, 6.0f, -3.1f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_axe")))));
    public static final Item HIGH_STEEL_SHOVEL = registerItem("high_steel_shovel", new Item(new Item.Settings().shovel(ModToolMaterials.HIGH_STEEL_TOOL_MATERIAL, 1.5f, -3.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_shovel")))));
    public static final Item HIGH_STEEL_HOE = registerItem("high_steel_hoe", new Item(new Item.Settings().hoe(ModToolMaterials.HIGH_STEEL_TOOL_MATERIAL, -2.0f, -1.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"high_steel_hoe")))));

    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new Item(new Item.Settings().pickaxe(ModToolMaterials.BRONZE_TOOL_MATERIAL, 0.0f, -2.8f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_pickaxe")))));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new Item(new Item.Settings().sword(ModToolMaterials.BRONZE_TOOL_MATERIAL, 2.0f, -2.4f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_sword")))));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new Item(new Item.Settings().axe(ModToolMaterials.BRONZE_TOOL_MATERIAL, 5.0f, -3.1f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_axe")))));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new Item(new Item.Settings().shovel(ModToolMaterials.BRONZE_TOOL_MATERIAL, 0.5f, -3.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_shovel")))));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new Item(new Item.Settings().hoe(ModToolMaterials.BRONZE_TOOL_MATERIAL, -3.0f, -1.0f).registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TestMod.MOD_ID,"bronze_hoe")))));

    //NO TOCAR. Creación del Registro de Items.

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    // Registro de la clase.
    public static void registerModItems() {
        TestMod.LOGGER.info("Registrando items para: " + TestMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BRONZE_INGOT);
        });
    }

}
