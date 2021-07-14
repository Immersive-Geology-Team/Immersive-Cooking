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
