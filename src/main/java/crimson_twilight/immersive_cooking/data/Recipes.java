package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.registry.ModBlocks;
import crimson_twilight.immersive_cooking.registry.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.utils.tags.ForgeTags;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider
{
    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> p_200404_0_) {
        initCoocking(p_200404_0_);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), ModBlocks.STONE_COUNTERTOP.get(), 4).unlocks("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_, "stone_countertop_from_smooth_stone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE_SLAB), ModBlocks.STONE_COUNTERTOP.get(), 2).unlocks("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_, "stone_countertop_from_smooth_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE), ModBlocks.BLACKSTONE_COUNTERTOP.get(), 4).unlocks("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_, "blackstone_countertop_from_polished_blackstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_BLACKSTONE_SLAB), ModBlocks.BLACKSTONE_COUNTERTOP.get(), 2).unlocks("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_, "blackstone_countertop_from_polished_blackstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE), ModBlocks.ANDESITE_COUNTERTOP.get(), 4).unlocks("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_, "andesite_countertop_from_polished_andesite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_ANDESITE_SLAB), ModBlocks.ANDESITE_COUNTERTOP.get(), 2).unlocks("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_, "andesite_countertop_from_polished_andesite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE), ModBlocks.DIORITE_COUNTERTOP.get(), 4).unlocks("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_, "diorite_countertop_from_polished_diorite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_DIORITE_SLAB), ModBlocks.DIORITE_COUNTERTOP.get(), 2).unlocks("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_, "diorite_countertop_from_polished_diorite_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), ModBlocks.GRANITE_COUNTERTOP.get(), 4).unlocks("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_, "granite_countertop_from_polished_granite_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE_SLAB), ModBlocks.GRANITE_COUNTERTOP.get(), 2).unlocks("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_, "granite_countertop_from_polished_granite_slab_stonecutting");

        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.ACACIA_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.ACACIA_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.BIRCH_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.BIRCH_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.CRIMSON_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.CRIMSON_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_OAK_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.DARK_OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.JUNGLE_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.JUNGLE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.OAK_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.OAK_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.SPRUCE_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.SPRUCE_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_STONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.STONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_BLACKSTONE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.BLACKSTONE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_blackstone", has(Blocks.POLISHED_BLACKSTONE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_ANDESITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.ANDESITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_DIORITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.DIORITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.WARPED_GRANITE_PANTRY.get()).define('C', Ingredient.of(ModBlocks.GRANITE_COUNTERTOP.get())).define('P', Ingredient.of(vectorwing.farmersdelight.registry.ModBlocks.WARPED_PANTRY.get())).pattern("C").pattern("P").unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE)).save(p_200404_0_);

        ShapedRecipeBuilder.shaped(ModBlocks.GLAZED_TILES.get(), 8).define('T', Ingredient.of(Blocks.TERRACOTTA)).define('H', Ingredient.of(Items.HONEYCOMB)).pattern("TTT").pattern("THT").pattern("TTT").unlockedBy("has_clay", has(Items.CLAY_BALL)).save(p_200404_0_);
        ShapedRecipeBuilder.shaped(ModBlocks.STOVE_HOOD.get()).define('I', Ingredient.of(Tags.Items.INGOTS_IRON)).define('G', Items.GLOWSTONE_DUST).define('B', Ingredient.of(Blocks.IRON_BARS)).pattern(" I ").pattern(" G ").pattern("IBI").unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON)).save(p_200404_0_);
    }

    protected static void initCoocking(Consumer<IFinishedRecipe> consumer)
    {
        //Chopping
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(vectorwing.farmersdelight.registry.ModItems.ONION.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.DICED_ONION.get(), 4).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.POTATO), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.POTATO_SLICE.get(), 6).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.POTATO_SLICE.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.POTATO_CUBES.get()).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.RAW_SPIDER_SHANK.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.RAW_SPIDER_CUTLET.get(), 4).addResult(Items.BONE).build(consumer);

        //Grilling
        CookingRecipeBuilder.cooking(Ingredient.of(ModItems.POTATO_SLICE.get()),
                ModItems.FRIED_POTATO_SLICE.get(), 0.35f, 600, IRecipeSerializer.CAMPFIRE_COOKING_RECIPE).
                unlockedBy("has_potato", has(Items.POTATO)).save(consumer);
        CookingRecipeBuilder.cooking(Ingredient.of(ModItems.POTATO_SLICE.get()),
                ModItems.FRIED_POTATO_CUBES.get(), 0.35f, 600, IRecipeSerializer.CAMPFIRE_COOKING_RECIPE).
                unlockedBy("has_potato", has(Items.POTATO)).save(consumer);

        //Smelting
        foodSmeltingRecipes("cooked_spider_cutlet", ModItems.RAW_SPIDER_CUTLET.get(), ModItems.COOKED_SPIDER_CUTLET.get(), 0.35f, consumer);

        //Smoked
        CookingRecipeBuilder.cooking(Ingredient.of(ModItems.RAW_SPIDER_SHANK.get()),
                ModItems.SMOKED_SPIDER_SHANK.get(), 0.35f, 200, IRecipeSerializer.SMOKING_RECIPE)
                .unlockedBy("has_monster_meat", has(ModItems.RAW_SPIDER_SHANK.get())).save(consumer);

        //Cooking Pot
        CookingPotRecipeBuilder.cookingRecipe(ModItems.PYTTIPANNA.get(), 2)
                .addIngredient(ModItems.DICED_ONION.get())
                .addIngredient(ModItems.POTATO_CUBES.get(), 3)
                .addIngredient(ForgeTags.RAW_BEEF)
                .addIngredient(ForgeTags.RAW_PORK)
                .build(consumer);
    }

    private static void foodSmeltingRecipes(String name, IItemProvider ingredient, IItemProvider result, float experience, Consumer<IFinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(ImmersiveCooking.MODID, name).toString();
        CookingRecipeBuilder.smelting(Ingredient.of(ingredient),
                result, experience, 200)
                .unlockedBy(name, has(ingredient))
                .save(consumer);
        CookingRecipeBuilder.cooking(Ingredient.of(ingredient),
                result, experience, 600, IRecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(name, has(ingredient))
                .save(consumer, namePrefix + "_from_campfire_cooking");
        CookingRecipeBuilder.cooking(Ingredient.of(ingredient),
                result, experience, 100, IRecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(name, has(ingredient))
                .save(consumer, namePrefix + "_from_smoking");
    }
}
