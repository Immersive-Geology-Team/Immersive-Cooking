package crimson_twilight.immersive_cooking.block.helper;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModBlocks;

public enum CabinetMaterial {
    OAK,
    DARK_OAK,
    BIRCH,
    ACACIA,
    WARPED,
    CRIMSON,
    JUNGLE,
    SPRUCE,
    CHERRY,
    BAMBOO,
    MANGROVE;

    public ItemLike getCraftItem() {
        return switch(this)
        {
            case OAK -> ModBlocks.OAK_CABINET.get().asItem();
            case DARK_OAK -> ModBlocks.DARK_OAK_CABINET.get().asItem();
            case BIRCH -> ModBlocks.BIRCH_CABINET.get().asItem();
            case ACACIA -> ModBlocks.ACACIA_CABINET.get().asItem();
            case WARPED -> ModBlocks.WARPED_CABINET.get().asItem();
            case CRIMSON -> ModBlocks.CRIMSON_CABINET.get().asItem();
            case JUNGLE -> ModBlocks.JUNGLE_CABINET.get().asItem();
            case SPRUCE -> ModBlocks.SPRUCE_CABINET.get().asItem();
            case CHERRY -> ModBlocks.CHERRY_CABINET.get().asItem();
            case BAMBOO -> ModBlocks.BAMBOO_CABINET.get().asItem();
            case MANGROVE -> ModBlocks.MANGROVE_CABINET.get().asItem();
        };
    }

    public TagKey<Block> getMineableType()
    {
        return BlockTags.MINEABLE_WITH_AXE;
    }
}
