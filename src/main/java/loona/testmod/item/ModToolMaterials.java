package loona.testmod.item;

import loona.testmod.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    public static final ToolMaterial BRONZE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            180,
            6.0F,
            3.0f,
            10,
            ModTags.Items.BRONZE_REPAIR);

    public static final ToolMaterial STEEL_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            800,
            8.0f,
            3.0f,
            10,
            ModTags.Items.STEEL_REPAIR);

    public static final ToolMaterial HIGH_STEEL_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2500,
            9.0f,
            4.0f,
            15,
            ModTags.Items.HIGH_STEEL_REPAIR);
}
