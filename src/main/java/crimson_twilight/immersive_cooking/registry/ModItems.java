package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveCooking.MODID);

    // Blocks
    public static final RegistryObject<Item> STONE_COUNTERTOP = ITEMS.register("stone_countertop",
            () -> new BlockItem(ModBlocks.STONE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));
    public static final RegistryObject<Item> BLACKSTONE_COUNTERTOP = ITEMS.register("blackstone_countertop",
            () -> new BlockItem(ModBlocks.BLACKSTONE_COUNTERTOP.get(), new Item.Properties().tab(ImmersiveCooking.ITEM_GROUP)));

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


    // Items
}
