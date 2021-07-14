package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.registry.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider
{
    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> p_200404_0_) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.STONE_COUNTERTOP.get(), 4).unlocks("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_, "stone_countertop_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.STONE_COUNTERTOP.get(), 2).unlocks("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_, "stone_countertop_from_smooth_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.BLACKSTONE_COUNTERTOP.get(), 4).unlocks("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_, "blackstone_countertop_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.BLACKSTONE_COUNTERTOP.get(), 2).unlocks("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_, "blackstone_countertop_from_polished_blackstone_slab_stonecutting");
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
    }
}
