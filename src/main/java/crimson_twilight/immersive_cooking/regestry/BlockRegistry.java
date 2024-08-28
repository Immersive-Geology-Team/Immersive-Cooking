package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.item.ItemBlockCabinet;
import crimson_twilight.immersive_cooking.item.ItemBlockCounter;
import crimson_twilight.immersive_cooking.item.ItemBlockGeneric;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
        for(CounterTop top : CounterTop.values()) {
            for (CabinetMaterial cabinetMaterial : CabinetMaterial.values()) {
                String cabinet_name = top.name().toLowerCase() + "_" + cabinetMaterial.name().toLowerCase() + "_cabinet";
                registerBlock(cabinet_name, () -> new BlockContainerBase(cabinet_name, BlockBehaviour.Properties.of().sound(SoundType.WOOD).destroyTime(0.5f).strength(0.3F), cabinetMaterial, top));
                registerBlockItem(cabinet_name, () -> new ItemBlockCabinet(BLOCK_MAP.get(cabinet_name).get(), new Item.Properties(), cabinet_name, top, cabinetMaterial));
            }
            for (CounterMaterial counterMaterial : CounterMaterial.values()) {
                String counter_name = top.name().toLowerCase() + "_" + counterMaterial.name().toLowerCase() + "_counter";
                registerBlock(counter_name, () -> new BlockCounterBase(counter_name, Block.Properties.of().sound(SoundType.WOOD).destroyTime(0.5f).strength(0.3F), counterMaterial, top));
                registerBlockItem(counter_name, () -> new ItemBlockCounter(BLOCK_MAP.get(counter_name).get(), new Item.Properties(), counter_name, top, counterMaterial));
            }
        }

        manualBlockRegistration("glazed_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE));
        manualBlockRegistration("checkered_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE));
        manualBlockRegistration("glazed_checkered_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE));
    }


    private static void manualBlockRegistration(String registry_name, BlockBehaviour.Properties properties)
    {
        if(BLOCK_MAP.containsKey(registry_name))
        {
            ImmersiveCooking.LOGGER.warn("Registry Name for Block already Exists [{}]", registry_name);
            return;
        }
        registerBlock(registry_name, () -> new Block(properties.destroyTime(0.5f).strength(0.3F)));
        registerBlockItem(registry_name, () -> new ItemBlockGeneric(BLOCK_MAP.get(registry_name).get(), new Item.Properties(), registry_name));
    }
}
