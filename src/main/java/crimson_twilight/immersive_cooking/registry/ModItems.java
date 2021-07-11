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

    // Items
}
