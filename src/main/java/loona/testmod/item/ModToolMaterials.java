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

}
