package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.item.ItemGeneric;
import crimson_twilight.immersive_cooking.item.util.FoodStuff;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.function.Supplier;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveCooking.MODID);

    public static final HashMap<String, RegistryObject<Item>> ITEM_MAP = new HashMap<>();

    public static void registerItem(String name, Supplier<? extends ItemGeneric> supply)
    {
        ITEM_MAP.put(name, ITEMS.register(name, supply));
    }
    // Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static void init()
    {
        for (FoodStuff food: FoodStuff.values())
        {
            food.registerEntry();
        }
    }
}