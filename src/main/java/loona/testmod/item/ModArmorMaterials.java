package loona.testmod.item;

import loona.testmod.TestMod;
import loona.testmod.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final int BASE_DURABILITY_BRONZE = 10;
    public static final int BASE_DURABILITY_STEEL = 30;
    public static final int BASE_DURABILITY_HIGH_IRON = 40;

    public static final ArmorMaterial BRONZE_ARMOR_MATERIAL = new ArmorMaterial(BASE_DURABILITY_BRONZE, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0, ModTags.Items.BRONZE_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(TestMod.MOD_ID, "bronze")));

    public static final ArmorMaterial STEEL_ARMOR_MATERIAL = new ArmorMaterial(BASE_DURABILITY_STEEL, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 0F, ModTags.Items.STEEL_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(TestMod.MOD_ID, "steel")));

    public static final ArmorMaterial HIGH_IRON_ARMOR_MATERIAL = new ArmorMaterial(BASE_DURABILITY_HIGH_IRON, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, ModTags.Items.HIGH_IRON_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(TestMod.MOD_ID, "high_iron")));
    }
