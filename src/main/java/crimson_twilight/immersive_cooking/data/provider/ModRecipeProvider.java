package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.item.util.FoodStuff;
import crimson_twilight.immersive_cooking.registry.BlockRegistry;
import crimson_twilight.immersive_cooking.registry.ItemRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends net.minecraft.data.recipes.RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ImmersiveCooking.LOGGER.info("Starting Recipe Provider");
        registerCraftingRecipes(output);
        registerFarmersRecipes(output);
    }

    //TODO
    public static void registerFarmersRecipes(RecipeOutput output) {
        initializeFoodData();

        for (CuttingRecipeRecord record : cuttingRecipes) {
            CuttingBoardRecipeBuilder builder = CuttingBoardRecipeBuilder.cuttingRecipe(record.input, record.cuttingTool, record.result, record.resultAmount);

            if (record.extra != null) {
                builder.addResult(record.extra, record.count_extra);
            }

            builder.save(output);
        }

        for(CookingPotRecord record : potRecipes) {
            CookingPotRecipeBuilder builder = CookingPotRecipeBuilder.cookingPotRecipe(record.result, record.result_amount, record.cook_time, record.xp, record.bowl_item);

            for (SizedIngredient ingredient_record : record.ingredients) {
                builder.addIngredient(ingredient_record.ingredient, ingredient_record.size);
            }

            builder.unlockedByAnyIngredient(ItemRegistry.ITEM_MAP.get(FoodStuff.DICED_ONION.getRegistryName()).get())
                    .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                    .save(output);
        }

        grillRecipe("potato_slice_to_fried_potato_slice", ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_SLICE.getRegistryName()).get().asItem(), ItemRegistry.ITEM_MAP.get(FoodStuff.FRIED_POTATO_SLICE.getRegistryName()).get().asItem(), .35f, 600, output);
        grillRecipe("potato_cube_to_fried_potato_cube", ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_CUBES.getRegistryName()).get().asItem(), ItemRegistry.ITEM_MAP.get(FoodStuff.FRIED_POTATO_CUBES.getRegistryName()).get().asItem(), .35f, 600, output);
        foodSmeltingRecipes("cooked_spider_cutlet", ItemRegistry.ITEM_MAP.get(FoodStuff.RAW_SPIDER_CUTLET.getRegistryName()).get().asItem(), ItemRegistry.ITEM_MAP.get(FoodStuff.COOKED_SPIDER_CUTLET.getRegistryName()).get().asItem(), .35f, output);
        smokeRecipe("smoked_shank", ItemRegistry.ITEM_MAP.get(FoodStuff.CLEAN_SPIDER_SHANK.getRegistryName()).get().asItem(), ItemRegistry.ITEM_MAP.get(FoodStuff.SMOKED_SPIDER_SHANK.getRegistryName()).get().asItem(), .35f, output);

    }

    private static void initializeFoodData() {
        // CLEAN_SPIDER_SHANK
        new CuttingRecipeRecord(Ingredient.of(Items.SHEARS),
                                Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.RAW_SPIDER_SHANK.getRegistryName()).get()),
                                ItemRegistry.ITEM_MAP.get(FoodStuff.CLEAN_SPIDER_SHANK.getRegistryName()).get(), 1, null, 0);

        // SPIDER_CUTLET
        new CuttingRecipeRecord(Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
                Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.CLEAN_SPIDER_SHANK.getRegistryName()).get()),
                ItemRegistry.ITEM_MAP.get(FoodStuff.RAW_SPIDER_CUTLET.getRegistryName()).get(), 2, Items.BONE, 1);

        // DICED ONION
        new CuttingRecipeRecord(Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
                Ingredient.of(ModItems.ONION.get()),
                ItemRegistry.ITEM_MAP.get(FoodStuff.DICED_ONION.getRegistryName()).get(), 1, null,0);

        new CuttingRecipeRecord(Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
                Ingredient.of(Items.POTATO),
                ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_SLICE.getRegistryName()).get(), 3, null,0);

        new CuttingRecipeRecord(Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
                Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_SLICE.getRegistryName()).get()),
                ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_CUBES.getRegistryName()).get(), 1, null,0);

        new CuttingRecipeRecord(Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
                Ingredient.of(Items.BAMBOO),
                ItemRegistry.ITEM_MAP.get(FoodStuff.BAMBOO_SLICE.getRegistryName()).get(), 4, null, 0);

        // Cooking Pots
        // PYTTIPANNA
        new CookingPotRecord(ItemRegistry.ITEM_MAP.get(FoodStuff.PYTTIPANNA.getRegistryName()).get(), 2, 100, 0.35f, new SizedIngredient[]{
                new SizedIngredient(Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.DICED_ONION.getRegistryName()).get()), 1),
                new SizedIngredient(Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.POTATO_CUBES.getRegistryName()).get()),2),
                new SizedIngredient(Ingredient.of(CommonTags.Items.FOODS_RAW_BEEF), 1),
                new SizedIngredient(Ingredient.of(CommonTags.Items.FOODS_RAW_BACON), 1),
                new SizedIngredient(Ingredient.of(CommonTags.Items.FOODS_RAW_PORK), 1),
        }, Items.BOWL);

        new CookingPotRecord(ItemRegistry.ITEM_MAP.get(FoodStuff.CURRY_BASE.getRegistryName()).get(), 4, 200, 0.35f, new SizedIngredient[]{
                new SizedIngredient(Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.DICED_ONION.getRegistryName()).get()), 1),
                new SizedIngredient(Ingredient.of(ItemRegistry.ITEM_MAP.get(FoodStuff.BAMBOO_SLICE.getRegistryName()).get()),2),
                new SizedIngredient(Ingredient.of(CommonTags.Items.CROPS_TOMATO), 2),
                new SizedIngredient(Ingredient.of(Items.SUGAR), 1),
        }, Items.BOWL);
    }

    private static final List<CuttingRecipeRecord> cuttingRecipes = new ArrayList<>();
    private static final List<CookingPotRecord> potRecipes = new ArrayList<>();

    public record CuttingRecipeRecord(
            Ingredient cuttingTool,
            Ingredient input,
            ItemLike result,
            int resultAmount,
            @Nullable ItemLike extra,
            int count_extra
    )
    {
        public CuttingRecipeRecord {
            cuttingRecipes.add(this);
        }
    }

    public record CookingPotRecord(
            ItemLike result,
            int result_amount,
            int cook_time,
            float xp,
            SizedIngredient[] ingredients,
            ItemLike bowl_item
    )
    {
        public CookingPotRecord {
            potRecipes.add(this);
        }
    }

    public record SizedIngredient(Ingredient ingredient, int size){};

    private static void foodSmeltingRecipes(String name, ItemLike ingredient, ItemLike result, float experience, RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output);

        grillRecipe(name, ingredient, result, experience, 600, output);
        smokeRecipe(name, ingredient, result, experience, output);
    }

    private static void smokeRecipe(String name, ItemLike ingredient, ItemLike result, float experience, RecipeOutput output) {
        String namePrefix = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, name).toString();
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 100)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output, namePrefix + "_from_smoking");
    }

    private static void grillRecipe(String name, ItemLike ingredient, ItemLike result, float experience, int timer, RecipeOutput output) {
        String namePrefix = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, name).toString();
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, timer)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output, namePrefix + "_from_campfire_cooking");
    }

    //TODO
    private static void registerFoodSmeltingRecipe()
    {

    }

    public static void registerCraftingRecipes(RecipeOutput output)
    {
        // Manual Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem(), 4)
                .pattern("BC")
                .pattern("CB")
                .define('C', Blocks.CALCITE.asItem())
                .define('B', Blocks.BLACKSTONE.asItem())
                .unlockedBy("has_blackstone_and_calcite", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.CALCITE.asItem(), Blocks.BLACKSTONE.asItem()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem(), 8)
                .pattern("CCC")
                .pattern("CHC")
                .pattern("CCC")
                .define('C', BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem())
                .define('H', Items.HONEYCOMB)
                .unlockedBy("has_checkered_tiles_and_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem(), Items.HONEYCOMB))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem(), 8)
                .pattern("CCC")
                .pattern("CHC")
                .pattern("CCC")
                .define('C', Blocks.TERRACOTTA)
                .define('H', Items.HONEYCOMB)
                .unlockedBy("has_terracotta_and_honeycomb", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.TERRACOTTA.asItem(), Items.HONEYCOMB))
                .save(output);

        //SLABS
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("checkered_tiles_slab").get().asItem(), 6)
                .pattern("BBB")
                .define('B', BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem())
                .unlockedBy("has_checkered_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles_slab").get().asItem(), 6)
                .pattern("BBB")
                .define('B', BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem())
                .unlockedBy("has_glazed_checkered_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_tiles_slab").get().asItem(), 6)
                .pattern("BBB")
                .define('B', BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem())
                .unlockedBy("has_glazed_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem()))
                .save(output);

        // Stone Cutter
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem()), RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_tiles_slab").get().asItem(), 2).unlockedBy("has_glazed_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("glazed_tiles").get().asItem())).save(output, "glazed_tiles_slab_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem()), RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles_slab").get().asItem(), 2).unlockedBy("has_glazed_checkered_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("glazed_checkered_tiles").get().asItem())).save(output, "glazed_checkered_tiles_slab_from_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem()), RecipeCategory.DECORATIONS, BlockRegistry.BLOCK_MAP.get("checkered_tiles_slab").get().asItem(), 2).unlockedBy("has_checkered_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(BlockRegistry.BLOCK_MAP.get("checkered_tiles").get().asItem())).save(output, "checkered_tiles_slab_from_stonecutting");

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
                        .save(output);
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
                        .save(output);
            }
        }

    }


}
