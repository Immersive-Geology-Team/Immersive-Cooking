package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.items.Foods;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.items.ConsumableItem;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveCooking.MODID);

    // Blocks
    public static final RegistryObject<Item> GLAZED_TILES = ITEMS.register("glazed_tiles",
            () -> new BlockItem(ModBlocks.GLAZED_TILES.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> STOVE_HOOD = ITEMS.register("stove_hood",
            () -> new BlockItem(ModBlocks.STOVE_HOOD.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> STONE_COUNTERTOP = ITEMS.register("stone_countertop",
            () -> new BlockItem(ModBlocks.STONE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BLACKSTONE_COUNTERTOP = ITEMS.register("blackstone_countertop",
            () -> new BlockItem(ModBlocks.BLACKSTONE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ANDESITE_COUNTERTOP = ITEMS.register("andesite_countertop",
            () -> new BlockItem(ModBlocks.ANDESITE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DIORITE_COUNTERTOP = ITEMS.register("diorite_countertop",
            () -> new BlockItem(ModBlocks.DIORITE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> GRANITE_COUNTERTOP = ITEMS.register("granite_countertop",
            () -> new BlockItem(ModBlocks.GRANITE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> OAK_STONE_PANTRY = ITEMS.register("oak_stone_pantry",
            () -> new BlockItem(ModBlocks.OAK_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_STONE_PANTRY = ITEMS.register("birch_stone_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_STONE_PANTRY = ITEMS.register("spruce_stone_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_STONE_PANTRY = ITEMS.register("jungle_stone_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_STONE_PANTRY = ITEMS.register("acacia_stone_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_STONE_PANTRY = ITEMS.register("dark_oak_stone_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_STONE_PANTRY = ITEMS.register("crimson_stone_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_STONE_PANTRY = ITEMS.register("warped_stone_pantry",
            () -> new BlockItem(ModBlocks.WARPED_STONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_BLACKSTONE_PANTRY = ITEMS.register("oak_blackstone_pantry",
            () -> new BlockItem(ModBlocks.OAK_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_BLACKSTONE_PANTRY = ITEMS.register("birch_blackstone_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_BLACKSTONE_PANTRY = ITEMS.register("spruce_blackstone_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_BLACKSTONE_PANTRY = ITEMS.register("jungle_blackstone_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_BLACKSTONE_PANTRY = ITEMS.register("acacia_blackstone_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_BLACKSTONE_PANTRY = ITEMS.register("dark_oak_blackstone_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_BLACKSTONE_PANTRY = ITEMS.register("crimson_blackstone_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_BLACKSTONE_PANTRY = ITEMS.register("warped_blackstone_pantry",
            () -> new BlockItem(ModBlocks.WARPED_BLACKSTONE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_ANDESITE_PANTRY = ITEMS.register("oak_andesite_pantry",
            () -> new BlockItem(ModBlocks.OAK_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_ANDESITE_PANTRY = ITEMS.register("birch_andesite_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_ANDESITE_PANTRY = ITEMS.register("spruce_andesite_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_ANDESITE_PANTRY = ITEMS.register("jungle_andesite_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_ANDESITE_PANTRY = ITEMS.register("acacia_andesite_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_ANDESITE_PANTRY = ITEMS.register("dark_oak_andesite_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_ANDESITE_PANTRY = ITEMS.register("crimson_andesite_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_ANDESITE_PANTRY = ITEMS.register("warped_andesite_pantry",
            () -> new BlockItem(ModBlocks.WARPED_ANDESITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_DIORITE_PANTRY = ITEMS.register("oak_diorite_pantry",
            () -> new BlockItem(ModBlocks.OAK_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_DIORITE_PANTRY = ITEMS.register("birch_diorite_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_DIORITE_PANTRY = ITEMS.register("spruce_diorite_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_DIORITE_PANTRY = ITEMS.register("jungle_diorite_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_DIORITE_PANTRY = ITEMS.register("acacia_diorite_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_DIORITE_PANTRY = ITEMS.register("dark_oak_diorite_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_DIORITE_PANTRY = ITEMS.register("crimson_diorite_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_DIORITE_PANTRY = ITEMS.register("warped_diorite_pantry",
            () -> new BlockItem(ModBlocks.WARPED_DIORITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_GRANITE_PANTRY = ITEMS.register("oak_granite_pantry",
            () -> new BlockItem(ModBlocks.OAK_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_GRANITE_PANTRY = ITEMS.register("birch_granite_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_GRANITE_PANTRY = ITEMS.register("spruce_granite_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_GRANITE_PANTRY = ITEMS.register("jungle_granite_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_GRANITE_PANTRY = ITEMS.register("acacia_granite_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_GRANITE_PANTRY = ITEMS.register("dark_oak_granite_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_GRANITE_PANTRY = ITEMS.register("crimson_granite_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_GRANITE_PANTRY = ITEMS.register("warped_granite_pantry",
            () -> new BlockItem(ModBlocks.WARPED_GRANITE_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));


    // Items
    public static final RegistryObject<Item> RAW_SPIDER_SHANK = ITEMS.register("raw_spider_shank",
            () -> new Item(new Item.Properties().food(Foods.RAW_SPIDER_SHANK).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DICED_ONION = ITEMS.register("diced_onion",
            () -> new Item(new Item.Properties().food(Foods.DICED_ONION).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> POTATO_SLICE = ITEMS.register("potato_slice",
            () -> new Item(new Item.Properties().food(Foods.POTATO_SLICE).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> POTATO_CUBES = ITEMS.register("potato_cubes",
            () -> new Item(new Item.Properties().food(Foods.POTATO_CUBES).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BAMBOO_SLICES = ITEMS.register("bamboo_slices",
            () -> new Item(new Item.Properties().food(Foods.BAMBOO_SLICES).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> RAW_SPIDER_CUTLET = ITEMS.register("raw_spider_cutlet",
            () -> new Item(new Item.Properties().food(Foods.RAW_SPIDER_CUTLET).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> FRIED_POTATO_SLICE = ITEMS.register("fried_potato_slice",
            () -> new Item(new Item.Properties().food(Foods.FRIED_POTATO_SLICE).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> FRIED_POTATO_CUBES = ITEMS.register("fried_potato_cubes",
            () -> new Item(new Item.Properties().food(Foods.FRIED_POTATO_CUBES).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> COOKED_SPIDER_CUTLET = ITEMS.register("cooked_spider_cutlet",
            () -> new Item(new Item.Properties().food(Foods.COOKED_SPIDER_CUTLET).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SMOKED_SPIDER_SHANK = ITEMS.register("smoked_spider_shank",
            () -> new Item(new Item.Properties().food(Foods.SMOKED_SPIDER_SHANK).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> PYTTIPANNA = ITEMS.register("pyttipanna",
            () -> new ConsumableItem(new Item.Properties().food(Foods.PYTTIPANNA).craftRemainder(Items.BOWL).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CURRY_BASE = ITEMS.register("curry_base",
            () -> new ConsumableItem(new Item.Properties().food(Foods.CURRY_BASE).craftRemainder(Items.BOWL).tab(ImmersiveCooking.ITEM_GROUP)));

}
