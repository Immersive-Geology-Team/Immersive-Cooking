package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends net.minecraft.data.recipes.RecipeProvider {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ImmersiveCooking.LOGGER.info("Starting Recipe Provider");
        registerCraftingRecipes(consumer);
    }

    //TODO
    public static void registerFarmersRecipes(Consumer<FinishedRecipe> consumer)
    {

    }

    //TODO
    private static void registerFoodSmeltingRecipe()
    {

    }

    public static void registerCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        // Manual Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem(), 4)
                .pattern("BC")
                .pattern("CB")
                .define('C', Blocks.CALCITE.asItem())
                .define('B', Blocks.BLACKSTONE.asItem())
                .unlockedBy("has_blackstone_and_calcite", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.CALCITE.asItem(), Blocks.BLACKSTONE.asItem()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem(), 8)
                .pattern("CCC")
                .pattern("CHC")
                .pattern("CCC")
                .define('C', BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem())
                .define('H', Items.HONEYCOMB)
                .unlockedBy("has_checkered_tiles_and_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem(), Items.HONEYCOMB))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem(), 8)
                .pattern("CCC")
                .pattern("CHC")
                .pattern("CCC")
                .define('C', Blocks.TERRACOTTA)
                .define('H', Items.HONEYCOMB)
                .unlockedBy("has_terracotta_and_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.TERRACOTTA.asItem(), Items.HONEYCOMB))
                .save(consumer);

        for(CounterTop top_material : CounterTop.values())
        {
            // Counters
            for(CounterMaterial counter_material : CounterMaterial.values())
            {
                String counter_name = top_material.name().toLowerCase() + "_" + counter_material.name().toLowerCase() + "_counter";
                ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get(counter_name).get().asItem(), 1)
                        .pattern("T")
                        .pattern("B")
                        .define('T', top_material.getCraftItem())
                        .define('B', counter_material.getCraftItem())
                        .unlockedBy("has_counter_material_" + counter_material.name().toLowerCase(), InventoryChangeTrigger.TriggerInstance.hasItems(counter_material.getCraftItem()))
                        .save(consumer);
            }

            // Cabinets
            for(CabinetMaterial cabinet_material : CabinetMaterial.values())
            {
                String cabinet_name = top_material.name().toLowerCase() + "_" + cabinet_material.name().toLowerCase() + "_cabinet";
                ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get(cabinet_name).get().asItem(), 1)
                        .pattern("T")
                        .pattern("B")
                        .define('T', top_material.getCraftItem())
                        .define('B', cabinet_material.getCraftItem())
                        .unlockedBy("has_counter_material_" + cabinet_material.name().toLowerCase(), InventoryChangeTrigger.TriggerInstance.hasItems(cabinet_material.getCraftItem()))
                        .save(consumer);
            }
        }

    }


}
