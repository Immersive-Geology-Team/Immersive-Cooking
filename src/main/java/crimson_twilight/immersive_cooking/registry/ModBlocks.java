package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.blocks.CounterTop;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
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
}
