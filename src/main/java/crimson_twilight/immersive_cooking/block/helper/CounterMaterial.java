package crimson_twilight.immersive_cooking.block.helper;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum CounterMaterial {
    OAK,
    DARK_OAK,
    BIRCH,
    ACACIA,
    WARPED,
    CRIMSON,
    JUNGLE,
    SPRUCE,
    BRICK,
    NETHER_BRICK,
    CHERRY,
    BAMBOO,
    MANGROVE;

    public ItemLike getCraftItem() {
        return switch(this)
        {
            case OAK -> Blocks.OAK_PLANKS.asItem();
            case DARK_OAK -> Blocks.DARK_OAK_PLANKS.asItem();
            case BIRCH -> Blocks.BIRCH_PLANKS.asItem();
            case ACACIA -> Blocks.ACACIA_PLANKS.asItem();
            case WARPED -> Blocks.WARPED_PLANKS.asItem();
            case CRIMSON -> Blocks.CRIMSON_PLANKS.asItem();
            case JUNGLE -> Blocks.JUNGLE_PLANKS.asItem();
            case SPRUCE -> Blocks.SPRUCE_PLANKS.asItem();
            case BRICK -> Blocks.BRICKS.asItem();
            case NETHER_BRICK -> Blocks.NETHER_BRICKS.asItem();
            case CHERRY -> Blocks.CHERRY_PLANKS.asItem();
            case BAMBOO -> Blocks.BAMBOO_PLANKS.asItem();
            case MANGROVE -> Blocks.MANGROVE_PLANKS.asItem();
        };
    }

    public TagKey<Block> getMineableType()
    {
        return BlockTags.MINEABLE_WITH_AXE;
    }
}
