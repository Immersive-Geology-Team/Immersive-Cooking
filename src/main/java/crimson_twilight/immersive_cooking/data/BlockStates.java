package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.blocks.PantryCounter;
import crimson_twilight.immersive_cooking.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider
{
    private static final int DEFAULT_ANGLE_OFFSET = 180;

    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ImmersiveCooking.MODID, exFileHelper);
    }

    private String blockName(Block block) {
        return block.getRegistryName().getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(ImmersiveCooking.MODID, "block/" + path);
    }

    @Override
    protected void registerStatesAndModels()
    {
        this.pantryBlock(ModBlocks.OAK_STONE_PANTRY.get(), "oak", "stone");
        this.pantryBlock(ModBlocks.BIRCH_STONE_PANTRY.get(), "birch", "stone");
        this.pantryBlock(ModBlocks.SPRUCE_STONE_PANTRY.get(), "spruce", "stone");
        this.pantryBlock(ModBlocks.JUNGLE_STONE_PANTRY.get(), "jungle", "stone");
        this.pantryBlock(ModBlocks.ACACIA_STONE_PANTRY.get(), "acacia", "stone");
        this.pantryBlock(ModBlocks.DARK_OAK_STONE_PANTRY.get(), "dark_oak", "stone");
        this.pantryBlock(ModBlocks.CRIMSON_STONE_PANTRY.get(), "crimson", "stone");
        this.pantryBlock(ModBlocks.WARPED_STONE_PANTRY.get(), "warped", "stone");
        this.pantryBlock(ModBlocks.OAK_BLACKSTONE_PANTRY.get(), "oak", "blackstone");
        this.pantryBlock(ModBlocks.BIRCH_BLACKSTONE_PANTRY.get(), "birch", "blackstone");
        this.pantryBlock(ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(), "spruce", "blackstone");
        this.pantryBlock(ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get(), "jungle", "blackstone");
        this.pantryBlock(ModBlocks.ACACIA_BLACKSTONE_PANTRY.get(), "acacia", "blackstone");
        this.pantryBlock(ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get(), "dark_oak", "blackstone");
        this.pantryBlock(ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get(), "crimson", "blackstone");
        this.pantryBlock(ModBlocks.WARPED_BLACKSTONE_PANTRY.get(), "warped", "blackstone");
        this.pantryBlock(ModBlocks.OAK_ANDESITE_PANTRY.get(), "oak", "andesite");
        this.pantryBlock(ModBlocks.BIRCH_ANDESITE_PANTRY.get(), "birch", "andesite");
        this.pantryBlock(ModBlocks.SPRUCE_ANDESITE_PANTRY.get(), "spruce", "andesite");
        this.pantryBlock(ModBlocks.JUNGLE_ANDESITE_PANTRY.get(), "jungle", "andesite");
        this.pantryBlock(ModBlocks.ACACIA_ANDESITE_PANTRY.get(), "acacia", "andesite");
        this.pantryBlock(ModBlocks.DARK_OAK_ANDESITE_PANTRY.get(), "dark_oak", "andesite");
        this.pantryBlock(ModBlocks.CRIMSON_ANDESITE_PANTRY.get(), "crimson", "andesite");
        this.pantryBlock(ModBlocks.WARPED_ANDESITE_PANTRY.get(), "warped", "andesite");
        this.pantryBlock(ModBlocks.OAK_DIORITE_PANTRY.get(), "oak", "diorite");
        this.pantryBlock(ModBlocks.BIRCH_DIORITE_PANTRY.get(), "birch", "diorite");
        this.pantryBlock(ModBlocks.SPRUCE_DIORITE_PANTRY.get(), "spruce", "diorite");
        this.pantryBlock(ModBlocks.JUNGLE_DIORITE_PANTRY.get(), "jungle", "diorite");
        this.pantryBlock(ModBlocks.ACACIA_DIORITE_PANTRY.get(), "acacia", "diorite");
        this.pantryBlock(ModBlocks.DARK_OAK_DIORITE_PANTRY.get(), "dark_oak", "diorite");
        this.pantryBlock(ModBlocks.CRIMSON_DIORITE_PANTRY.get(), "crimson", "diorite");
        this.pantryBlock(ModBlocks.WARPED_DIORITE_PANTRY.get(), "warped", "diorite");
        this.pantryBlock(ModBlocks.OAK_GRANITE_PANTRY.get(), "oak", "granite");
        this.pantryBlock(ModBlocks.BIRCH_GRANITE_PANTRY.get(), "birch", "granite");
        this.pantryBlock(ModBlocks.SPRUCE_GRANITE_PANTRY.get(), "spruce", "granite");
        this.pantryBlock(ModBlocks.JUNGLE_GRANITE_PANTRY.get(), "jungle", "granite");
        this.pantryBlock(ModBlocks.ACACIA_GRANITE_PANTRY.get(), "acacia", "granite");
        this.pantryBlock(ModBlocks.DARK_OAK_GRANITE_PANTRY.get(), "dark_oak", "granite");
        this.pantryBlock(ModBlocks.CRIMSON_GRANITE_PANTRY.get(), "crimson", "granite");
        this.pantryBlock(ModBlocks.WARPED_GRANITE_PANTRY.get(), "warped", "granite");
    }

    public void pantryBlock(Block block, String woodType, String stoneType) {
        this.horizontalBlock(block, state -> {
            String suffix = state.getValue(PantryCounter.OPEN) ? "_open" : "";
            return models().orientableWithBottom(blockName(block) + suffix,
                    resourceBlock(woodType + "_" + stoneType + "_pantry_side"),
                    resourceBlock(woodType + "_" + stoneType + "_pantry_front" + suffix),
                    resourceBlock(woodType + "_pantry_bottom"),
                    resourceBlock(stoneType + "_countertop"));
        });
    }
}
