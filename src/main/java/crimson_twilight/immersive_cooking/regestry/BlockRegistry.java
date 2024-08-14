package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.PantryMaterial;
import crimson_twilight.immersive_cooking.item.ItemGeneric;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import java.util.HashMap;
import java.util.function.Supplier;

import static crimson_twilight.immersive_cooking.regestry.ItemRegistry.ITEMS;
import static crimson_twilight.immersive_cooking.regestry.ItemRegistry.ITEM_MAP;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmersiveCooking.MODID);

    public static final HashMap<String, RegistryObject<Block>> BLOCK_MAP = new HashMap<>();

    public static void registerBlockItem(String name, Supplier<? extends BlockItem> supply)
    {
        ITEM_MAP.put(name, ITEMS.register(name, supply));
    }

    public static void registerBlock(String name, Supplier<? extends Block> supply)
    {
        BLOCK_MAP.put(name, BLOCKS.register(name, supply));
    }

    public static void init()
    {
        // Register the different types of Pantry Counter Tops available
        for(PantryMaterial material : PantryMaterial.values())
        {
            // This section is the main material of the counter
            for(CounterTop top : CounterTop.values())
            {
                String counter_name = top.name().toLowerCase() + "_" + material.name().toLowerCase() + "_pantry";
                registerBlock(counter_name, () -> new BlockContainerBase(counter_name, BlockBehaviour.Properties.copy(Blocks.BARREL), material, top));
                registerBlockItem(counter_name, () -> new BlockItem(BLOCK_MAP.get(counter_name).get(), new Item.Properties()));
            }
        }
        // Register the different types of Pantry Counter Tops available
        for(CounterMaterial material : CounterMaterial.values())
        {
            // This section is the main material of the counter
            for(CounterTop top : CounterTop.values())
            {
                String counter_name = top.name().toLowerCase() + "_" + material.name().toLowerCase() + "_counter";
                registerBlock(counter_name, () -> new BlockCounterBase(counter_name, BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS), material, top));
                registerBlockItem(counter_name, () -> new BlockItem(BLOCK_MAP.get(counter_name).get(), new Item.Properties()));
            }
        }
    }
}
