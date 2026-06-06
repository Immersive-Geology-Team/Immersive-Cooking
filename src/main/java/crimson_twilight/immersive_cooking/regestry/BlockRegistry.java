package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BasicBlock;
import crimson_twilight.immersive_cooking.block.BasicSlabBlock;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.item.ItemBlockCabinet;
import crimson_twilight.immersive_cooking.item.ItemBlockCounter;
import crimson_twilight.immersive_cooking.item.ItemBlockGeneric;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.function.Supplier;

import static crimson_twilight.immersive_cooking.regestry.ItemRegistry.ITEMS;
import static crimson_twilight.immersive_cooking.regestry.ItemRegistry.ITEM_MAP;

public class BlockRegistry
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ImmersiveCooking.MODID);

    public static final HashMap<String, DeferredBlock<Block>> BLOCK_MAP = new HashMap<>();

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
                registerBlock(cabinet_name, () -> new BlockContainerBase(cabinet_name, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3, 3),cabinetMaterial, top));
                registerBlockItem(cabinet_name, () -> new ItemBlockCabinet(BLOCK_MAP.get(cabinet_name).get(), new Item.Properties(), cabinet_name, top, cabinetMaterial));
            }
            for (CounterMaterial counterMaterial : CounterMaterial.values()) {
                String counter_name = top.name().toLowerCase() + "_" + counterMaterial.name().toLowerCase() + "_counter";
                registerBlock(counter_name, () -> new BlockCounterBase(counter_name, Block.Properties.of().sound(SoundType.WOOD).strength(3,3).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE), counterMaterial, top));
                registerBlockItem(counter_name, () -> new ItemBlockCounter(BLOCK_MAP.get(counter_name).get(), new Item.Properties(), counter_name, top, counterMaterial));
            }
        }

        manualBlockRegistration("glazed_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3,3).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).requiresCorrectToolForDrops());
        manualBlockRegistration("checkered_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3,3).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).requiresCorrectToolForDrops());
        manualBlockRegistration("glazed_checkered_tiles", BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3,3).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).requiresCorrectToolForDrops());
    }


    private static void manualBlockRegistration(String registry_name, BlockBehaviour.Properties properties)
    {
        if(BLOCK_MAP.containsKey(registry_name))
        {
            ImmersiveCooking.LOGGER.warn("Registry Name for Block already Exists [{}]", registry_name);
            return;
        }
        registerBlock(registry_name, () -> new BasicBlock(registry_name, properties));
        registerBlockItem(registry_name, () -> new ItemBlockGeneric(BLOCK_MAP.get(registry_name).get(), new Item.Properties(), registry_name));

        registerBlock(registry_name + "_slab", () -> new BasicSlabBlock(registry_name + "_slab", properties));
        registerBlockItem(registry_name + "_slab", () -> new ItemBlockGeneric(BLOCK_MAP.get(registry_name + "_slab").get(), new Item.Properties(), registry_name+ "_slab"));
    }
}
