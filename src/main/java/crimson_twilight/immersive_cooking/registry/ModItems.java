package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.items.Foods;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
    public static final RegistryObject<Item> QUARTZ_COUNTERTOP = ITEMS.register("quartz_countertop",
            () -> new BlockItem(ModBlocks.QUARTZ_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

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

    public static final RegistryObject<Item> OAK_QUARTZ_PANTRY = ITEMS.register("oak_quartz_pantry",
            () -> new BlockItem(ModBlocks.OAK_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_QUARTZ_PANTRY = ITEMS.register("birch_quartz_pantry",
            () -> new BlockItem(ModBlocks.BIRCH_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_QUARTZ_PANTRY = ITEMS.register("spruce_quartz_pantry",
            () -> new BlockItem(ModBlocks.SPRUCE_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_QUARTZ_PANTRY = ITEMS.register("jungle_quartz_pantry",
            () -> new BlockItem(ModBlocks.JUNGLE_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_QUARTZ_PANTRY = ITEMS.register("acacia_quartz_pantry",
            () -> new BlockItem(ModBlocks.ACACIA_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_QUARTZ_PANTRY = ITEMS.register("dark_oak_quartz_pantry",
            () -> new BlockItem(ModBlocks.DARK_OAK_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_QUARTZ_PANTRY = ITEMS.register("crimson_quartz_pantry",
            () -> new BlockItem(ModBlocks.CRIMSON_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_QUARTZ_PANTRY = ITEMS.register("warped_quartz_pantry",
            () -> new BlockItem(ModBlocks.WARPED_QUARTZ_PANTRY.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_STONE_COUNTER = ITEMS.register("brick_stone_counter",
            () -> new BlockItem(ModBlocks.BRICK_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_STONE_COUNTER = ITEMS.register("nether_brick_stone_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_STONE_COUNTER = ITEMS.register("oak_stone_counter",
            () -> new BlockItem(ModBlocks.OAK_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_STONE_COUNTER = ITEMS.register("birch_stone_counter",
            () -> new BlockItem(ModBlocks.BIRCH_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_STONE_COUNTER = ITEMS.register("spruce_stone_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_STONE_COUNTER = ITEMS.register("jungle_stone_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_STONE_COUNTER = ITEMS.register("acacia_stone_counter",
            () -> new BlockItem(ModBlocks.ACACIA_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_STONE_COUNTER = ITEMS.register("dark_oak_stone_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_STONE_COUNTER = ITEMS.register("crimson_stone_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_STONE_COUNTER = ITEMS.register("warped_stone_counter",
            () -> new BlockItem(ModBlocks.WARPED_STONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_BLACKSTONE_COUNTER = ITEMS.register("brick_blackstone_counter",
            () -> new BlockItem(ModBlocks.BRICK_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_BLACKSTONE_COUNTER = ITEMS.register("nether_brick_blackstone_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_BLACKSTONE_COUNTER = ITEMS.register("oak_blackstone_counter",
            () -> new BlockItem(ModBlocks.OAK_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_BLACKSTONE_COUNTER = ITEMS.register("birch_blackstone_counter",
            () -> new BlockItem(ModBlocks.BIRCH_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_BLACKSTONE_COUNTER = ITEMS.register("spruce_blackstone_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_BLACKSTONE_COUNTER = ITEMS.register("jungle_blackstone_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_BLACKSTONE_COUNTER = ITEMS.register("acacia_blackstone_counter",
            () -> new BlockItem(ModBlocks.ACACIA_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_BLACKSTONE_COUNTER = ITEMS.register("dark_oak_blackstone_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_BLACKSTONE_COUNTER = ITEMS.register("crimson_blackstone_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_BLACKSTONE_COUNTER = ITEMS.register("warped_blackstone_counter",
            () -> new BlockItem(ModBlocks.WARPED_BLACKSTONE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_ANDESITE_COUNTER = ITEMS.register("brick_andesite_counter",
            () -> new BlockItem(ModBlocks.BRICK_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_ANDESITE_COUNTER = ITEMS.register("nether_brick_andesite_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_ANDESITE_COUNTER = ITEMS.register("oak_andesite_counter",
            () -> new BlockItem(ModBlocks.OAK_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_ANDESITE_COUNTER = ITEMS.register("birch_andesite_counter",
            () -> new BlockItem(ModBlocks.BIRCH_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_ANDESITE_COUNTER = ITEMS.register("spruce_andesite_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_ANDESITE_COUNTER = ITEMS.register("jungle_andesite_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_ANDESITE_COUNTER = ITEMS.register("acacia_andesite_counter",
            () -> new BlockItem(ModBlocks.ACACIA_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_ANDESITE_COUNTER = ITEMS.register("dark_oak_andesite_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_ANDESITE_COUNTER = ITEMS.register("crimson_andesite_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_ANDESITE_COUNTER = ITEMS.register("warped_andesite_counter",
            () -> new BlockItem(ModBlocks.WARPED_ANDESITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_DIORITE_COUNTER = ITEMS.register("brick_diorite_counter",
            () -> new BlockItem(ModBlocks.BRICK_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_DIORITE_COUNTER = ITEMS.register("nether_brick_diorite_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_DIORITE_COUNTER = ITEMS.register("oak_diorite_counter",
            () -> new BlockItem(ModBlocks.OAK_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_DIORITE_COUNTER = ITEMS.register("birch_diorite_counter",
            () -> new BlockItem(ModBlocks.BIRCH_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_DIORITE_COUNTER = ITEMS.register("spruce_diorite_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_DIORITE_COUNTER = ITEMS.register("jungle_diorite_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_DIORITE_COUNTER = ITEMS.register("acacia_diorite_counter",
            () -> new BlockItem(ModBlocks.ACACIA_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_DIORITE_COUNTER = ITEMS.register("dark_oak_diorite_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_DIORITE_COUNTER = ITEMS.register("crimson_diorite_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_DIORITE_COUNTER = ITEMS.register("warped_diorite_counter",
            () -> new BlockItem(ModBlocks.WARPED_DIORITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_GRANITE_COUNTER = ITEMS.register("brick_granite_counter",
            () -> new BlockItem(ModBlocks.BRICK_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_GRANITE_COUNTER = ITEMS.register("nether_brick_granite_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_GRANITE_COUNTER = ITEMS.register("oak_granite_counter",
            () -> new BlockItem(ModBlocks.OAK_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_GRANITE_COUNTER = ITEMS.register("birch_granite_counter",
            () -> new BlockItem(ModBlocks.BIRCH_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_GRANITE_COUNTER = ITEMS.register("spruce_granite_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_GRANITE_COUNTER = ITEMS.register("jungle_granite_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_GRANITE_COUNTER = ITEMS.register("acacia_granite_counter",
            () -> new BlockItem(ModBlocks.ACACIA_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_GRANITE_COUNTER = ITEMS.register("dark_oak_granite_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_GRANITE_COUNTER = ITEMS.register("crimson_granite_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_GRANITE_COUNTER = ITEMS.register("warped_granite_counter",
            () -> new BlockItem(ModBlocks.WARPED_GRANITE_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

    public static final RegistryObject<Item> BRICK_QUARTZ_COUNTER = ITEMS.register("brick_quartz_counter",
            () -> new BlockItem(ModBlocks.BRICK_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHER_BRICK_QUARTZ_COUNTER = ITEMS.register("nether_brick_quartz_counter",
            () -> new BlockItem(ModBlocks.NETHER_BRICK_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> OAK_QUARTZ_COUNTER = ITEMS.register("oak_quartz_counter",
            () -> new BlockItem(ModBlocks.OAK_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BIRCH_QUARTZ_COUNTER = ITEMS.register("birch_quartz_counter",
            () -> new BlockItem(ModBlocks.BIRCH_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> SPRUCE_QUARTZ_COUNTER = ITEMS.register("spruce_quartz_counter",
            () -> new BlockItem(ModBlocks.SPRUCE_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> JUNGLE_QUARTZ_COUNTER = ITEMS.register("jungle_quartz_counter",
            () -> new BlockItem(ModBlocks.JUNGLE_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> ACACIA_QUARTZ_COUNTER = ITEMS.register("acacia_quartz_counter",
            () -> new BlockItem(ModBlocks.ACACIA_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DARK_OAK_QUARTZ_COUNTER = ITEMS.register("dark_oak_quartz_counter",
            () -> new BlockItem(ModBlocks.DARK_OAK_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CRIMSON_QUARTZ_COUNTER = ITEMS.register("crimson_quartz_counter",
            () -> new BlockItem(ModBlocks.CRIMSON_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> WARPED_QUARTZ_COUNTER = ITEMS.register("warped_quartz_counter",
            () -> new BlockItem(ModBlocks.WARPED_QUARTZ_COUNTER.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));


    // Items
    public static final RegistryObject<Item> RAW_SPIDER_SHANK = ITEMS.register("raw_spider_shank",
            () -> new Item(new Item.Properties().food(Foods.RAW_SPIDER_SHANK).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> CLEAN_SPIDER_SHANK = ITEMS.register("clean_spider_shank",
            () -> new Item(new Item.Properties().food(Foods.CLEAN_SPIDER_SHANK).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> DICED_ONION = ITEMS.register("diced_onion",
            () -> new Item(new Item.Properties().food(Foods.DICED_ONION).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> POTATO_SLICE = ITEMS.register("potato_slice",
            () -> new Item(new Item.Properties().food(Foods.POTATO_SLICE).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> POTATO_CUBES = ITEMS.register("potato_cubes",
            () -> new Item(new Item.Properties().food(Foods.POTATO_CUBES).tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BAMBOO_SLICE = ITEMS.register("bamboo_slice",
            () -> new Item(new Item.Properties().food(Foods.BAMBOO_SLICE).tab(ImmersiveCooking.ITEM_GROUP)));
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

    public static final RegistryObject<Item> MONSTER_TUFT = ITEMS.register("monster_tuft",
            () -> new Item(new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

}
