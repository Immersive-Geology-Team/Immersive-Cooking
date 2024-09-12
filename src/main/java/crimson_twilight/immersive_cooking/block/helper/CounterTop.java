package crimson_twilight.immersive_cooking.block.helper;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum CounterTop {
    ANDESITE,
    GRANITE,
    STONE,
    BLACKSTONE,
    DIORITE,
    QUARTZ,
    DEEPSLATE,
    BASALT,
    CALCITE;

    public Item getCraftItem() {
        return switch(this)
        {
            case ANDESITE -> Blocks.POLISHED_ANDESITE.asItem();
            case GRANITE -> Blocks.POLISHED_GRANITE.asItem();
            case STONE -> Blocks.STONE.asItem();
            case BLACKSTONE -> Blocks.POLISHED_BLACKSTONE.asItem();
            case DIORITE -> Blocks.POLISHED_DIORITE.asItem();
            case QUARTZ -> Blocks.QUARTZ_BLOCK.asItem();
            case DEEPSLATE -> Blocks.DEEPSLATE_TILES.asItem();
            case BASALT -> Blocks.POLISHED_BASALT.asItem();
            case CALCITE -> Blocks.CALCITE.asItem();
        };
    }

    public TagKey<Block> getMineableType()
    {
        return BlockTags.MINEABLE_WITH_PICKAXE;
    }
}
