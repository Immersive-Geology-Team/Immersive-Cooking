package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.blocks.PantryCounter;
import crimson_twilight.immersive_cooking.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockStates extends BlockStateProvider
{
    private static final int DEFAULT_ANGLE_OFFSET = 180;
    private static String[] countertops = {"stone", "darkstone", "andesite", "diorite", "granite", "quartz"};
    private static String[] drawerBases = {"oak", "birch", "spruce", "jungle", "acacia", "dark_oak", "crimson", "warped"};
    private static String[] counterBases = {"brick", "nether_brick", "oak", "birch", "spruce", "jungle", "acacia", "dark_oak", "crimson", "warped"};

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
        /*for(String top: countertops)
        {
           for(String base: drawerBases) {
               this.pantryBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ImmersiveCooking.MODID, base + "_" + top + "_pantry")), base, top);
            }
            for(String base: drawerBases)
            {
                this.pantryBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ImmersiveCooking.MODID, base + "_" + top + "_pantry")), base, top);
            }

        }*/
        //Pantries
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

        this.pantryBlock(ModBlocks.OAK_QUARTZ_PANTRY.get(), "oak", "quartz");
        this.pantryBlock(ModBlocks.BIRCH_QUARTZ_PANTRY.get(), "birch", "quartz");
        this.pantryBlock(ModBlocks.SPRUCE_QUARTZ_PANTRY.get(), "spruce", "quartz");
        this.pantryBlock(ModBlocks.JUNGLE_QUARTZ_PANTRY.get(), "jungle", "quartz");
        this.pantryBlock(ModBlocks.ACACIA_QUARTZ_PANTRY.get(), "acacia", "quartz");
        this.pantryBlock(ModBlocks.DARK_OAK_QUARTZ_PANTRY.get(), "dark_oak", "quartz");
        this.pantryBlock(ModBlocks.CRIMSON_QUARTZ_PANTRY.get(), "crimson", "quartz");
        this.pantryBlock(ModBlocks.WARPED_QUARTZ_PANTRY.get(), "warped", "quartz");

        //Counters
        this.counterBlock(ModBlocks.BRICK_STONE_COUNTER.get(), "brick", "stone");
        this.counterBlock(ModBlocks.NETHER_BRICK_STONE_COUNTER.get(), "nether_brick", "stone");
        this.counterBlock(ModBlocks.OAK_STONE_COUNTER.get(), "oak", "stone");
        this.counterBlock(ModBlocks.BIRCH_STONE_COUNTER.get(), "birch", "stone");
        this.counterBlock(ModBlocks.SPRUCE_STONE_COUNTER.get(), "spruce", "stone");
        this.counterBlock(ModBlocks.JUNGLE_STONE_COUNTER.get(), "jungle", "stone");
        this.counterBlock(ModBlocks.ACACIA_STONE_COUNTER.get(), "acacia", "stone");
        this.counterBlock(ModBlocks.DARK_OAK_STONE_COUNTER.get(), "dark_oak", "stone");
        this.counterBlock(ModBlocks.CRIMSON_STONE_COUNTER.get(), "crimson", "stone");
        this.counterBlock(ModBlocks.WARPED_STONE_COUNTER.get(), "warped", "stone");

        this.counterBlock(ModBlocks.BRICK_BLACKSTONE_COUNTER.get(), "brick", "blackstone");
        this.counterBlock(ModBlocks.NETHER_BRICK_BLACKSTONE_COUNTER.get(), "nether_brick", "blackstone");
        this.counterBlock(ModBlocks.OAK_BLACKSTONE_COUNTER.get(), "oak", "blackstone");
        this.counterBlock(ModBlocks.BIRCH_BLACKSTONE_COUNTER.get(), "birch", "blackstone");
        this.counterBlock(ModBlocks.SPRUCE_BLACKSTONE_COUNTER.get(), "spruce", "blackstone");
        this.counterBlock(ModBlocks.JUNGLE_BLACKSTONE_COUNTER.get(), "jungle", "blackstone");
        this.counterBlock(ModBlocks.ACACIA_BLACKSTONE_COUNTER.get(), "acacia", "blackstone");
        this.counterBlock(ModBlocks.DARK_OAK_BLACKSTONE_COUNTER.get(), "dark_oak", "blackstone");
        this.counterBlock(ModBlocks.CRIMSON_BLACKSTONE_COUNTER.get(), "crimson", "blackstone");
        this.counterBlock(ModBlocks.WARPED_BLACKSTONE_COUNTER.get(), "warped", "blackstone");

        this.counterBlock(ModBlocks.BRICK_ANDESITE_COUNTER.get(), "brick", "andesite");
        this.counterBlock(ModBlocks.NETHER_BRICK_ANDESITE_COUNTER.get(), "nether_brick", "andesite");
        this.counterBlock(ModBlocks.OAK_ANDESITE_COUNTER.get(), "oak", "andesite");
        this.counterBlock(ModBlocks.BIRCH_ANDESITE_COUNTER.get(), "birch", "andesite");
        this.counterBlock(ModBlocks.SPRUCE_ANDESITE_COUNTER.get(), "spruce", "andesite");
        this.counterBlock(ModBlocks.JUNGLE_ANDESITE_COUNTER.get(), "jungle", "andesite");
        this.counterBlock(ModBlocks.ACACIA_ANDESITE_COUNTER.get(), "acacia", "andesite");
        this.counterBlock(ModBlocks.DARK_OAK_ANDESITE_COUNTER.get(), "dark_oak", "andesite");
        this.counterBlock(ModBlocks.CRIMSON_ANDESITE_COUNTER.get(), "crimson", "andesite");
        this.counterBlock(ModBlocks.WARPED_ANDESITE_COUNTER.get(), "warped", "andesite");

        this.counterBlock(ModBlocks.BRICK_DIORITE_COUNTER.get(), "brick", "diorite");
        this.counterBlock(ModBlocks.NETHER_BRICK_DIORITE_COUNTER.get(), "nether_brick", "diorite");
        this.counterBlock(ModBlocks.OAK_DIORITE_COUNTER.get(), "oak", "diorite");
        this.counterBlock(ModBlocks.BIRCH_DIORITE_COUNTER.get(), "birch", "diorite");
        this.counterBlock(ModBlocks.SPRUCE_DIORITE_COUNTER.get(), "spruce", "diorite");
        this.counterBlock(ModBlocks.JUNGLE_DIORITE_COUNTER.get(), "jungle", "diorite");
        this.counterBlock(ModBlocks.ACACIA_DIORITE_COUNTER.get(), "acacia", "diorite");
        this.counterBlock(ModBlocks.DARK_OAK_DIORITE_COUNTER.get(), "dark_oak", "diorite");
        this.counterBlock(ModBlocks.CRIMSON_DIORITE_COUNTER.get(), "crimson", "diorite");
        this.counterBlock(ModBlocks.WARPED_DIORITE_COUNTER.get(), "warped", "diorite");

        this.counterBlock(ModBlocks.BRICK_GRANITE_COUNTER.get(), "brick", "granite");
        this.counterBlock(ModBlocks.NETHER_BRICK_GRANITE_COUNTER.get(), "nether_brick", "granite");
        this.counterBlock(ModBlocks.OAK_GRANITE_COUNTER.get(), "oak", "granite");
        this.counterBlock(ModBlocks.BIRCH_GRANITE_COUNTER.get(), "birch", "granite");
        this.counterBlock(ModBlocks.SPRUCE_GRANITE_COUNTER.get(), "spruce", "granite");
        this.counterBlock(ModBlocks.JUNGLE_GRANITE_COUNTER.get(), "jungle", "granite");
        this.counterBlock(ModBlocks.ACACIA_GRANITE_COUNTER.get(), "acacia", "granite");
        this.counterBlock(ModBlocks.DARK_OAK_GRANITE_COUNTER.get(), "dark_oak", "granite");
        this.counterBlock(ModBlocks.CRIMSON_GRANITE_COUNTER.get(), "crimson", "granite");
        this.counterBlock(ModBlocks.WARPED_GRANITE_COUNTER.get(), "warped", "granite");

        this.counterBlock(ModBlocks.BRICK_QUARTZ_COUNTER.get(), "brick", "quartz");
        this.counterBlock(ModBlocks.NETHER_BRICK_QUARTZ_COUNTER.get(), "nether_brick", "quartz");
        this.counterBlock(ModBlocks.OAK_QUARTZ_COUNTER.get(), "oak", "quartz");
        this.counterBlock(ModBlocks.BIRCH_QUARTZ_COUNTER.get(), "birch", "quartz");
        this.counterBlock(ModBlocks.SPRUCE_QUARTZ_COUNTER.get(), "spruce", "quartz");
        this.counterBlock(ModBlocks.JUNGLE_QUARTZ_COUNTER.get(), "jungle", "quartz");
        this.counterBlock(ModBlocks.ACACIA_QUARTZ_COUNTER.get(), "acacia", "quartz");
        this.counterBlock(ModBlocks.DARK_OAK_QUARTZ_COUNTER.get(), "dark_oak", "quartz");
        this.counterBlock(ModBlocks.CRIMSON_QUARTZ_COUNTER.get(), "crimson", "quartz");
        this.counterBlock(ModBlocks.WARPED_QUARTZ_COUNTER.get(), "warped", "quartz");
    }

    public void pantryBlock(Block block, String base, String top) {
        this.horizontalBlock(block, state -> {
            String suffix = state.getValue(PantryCounter.OPEN) ? "_open" : "";
            return models().orientableWithBottom(blockName(block) + suffix,
                    resourceBlock(base + "_" + top + "_counter_side"),
                    resourceBlock(base + "_" + top + "_pantry_front" + suffix),
                    resourceBlock(base + "_counter_bottom"),
                    resourceBlock(top + "_countertop"));
        });
    }

    private void counterBlock(Block block, String base, String top) {
        this.horizontalBlock(block, state -> {
            return models().cubeBottomTop(
                    blockName(block),
                    resourceBlock(base + "_" + top + "_counter_side"),
                    resourceBlock(base + "_counter_bottom"),
                    resourceBlock(top + "_countertop")
            );
        });
    }
}
