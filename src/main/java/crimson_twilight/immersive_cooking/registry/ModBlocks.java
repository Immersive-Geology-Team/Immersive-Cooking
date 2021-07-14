package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.blocks.CounterTop;
import crimson_twilight.immersive_cooking.blocks.PantryCounter;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmersiveCooking.MODID);

    public static final RegistryObject<Block> STONE_COUNTERTOP = BLOCKS.register("stone_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.SMOOTH_STONE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BLACKSTONE_COUNTERTOP = BLOCKS.register("blackstone_countertop",
            () -> new CounterTop(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE).strength(0.8f, 0.2f).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> OAK_STONE_PANTRY = BLOCKS.register("oak_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_STONE_PANTRY = BLOCKS.register("birch_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_STONE_PANTRY = BLOCKS.register("spruce_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_STONE_PANTRY = BLOCKS.register("jungle_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_STONE_PANTRY = BLOCKS.register("acacia_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_STONE_PANTRY = BLOCKS.register("dark_oak_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_STONE_PANTRY = BLOCKS.register("crimson_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_STONE_PANTRY = BLOCKS.register("warped_stone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_BLACKSTONE_PANTRY = BLOCKS.register("oak_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_BLACKSTONE_PANTRY = BLOCKS.register("birch_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_BLACKSTONE_PANTRY = BLOCKS.register("spruce_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_BLACKSTONE_PANTRY = BLOCKS.register("jungle_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_BLACKSTONE_PANTRY = BLOCKS.register("acacia_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_BLACKSTONE_PANTRY = BLOCKS.register("dark_oak_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_BLACKSTONE_PANTRY = BLOCKS.register("crimson_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_BLACKSTONE_PANTRY = BLOCKS.register("warped_blackstone_pantry",
            () -> new PantryCounter(Block.Properties.copy(Blocks.BARREL)));
}
