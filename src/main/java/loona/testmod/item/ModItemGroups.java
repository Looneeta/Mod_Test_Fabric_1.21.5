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
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModItems.RAW_TIN);
                    })

                    .build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registrando Item Groups para: " + TestMod.MOD_ID);
    }

}
