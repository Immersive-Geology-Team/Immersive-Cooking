package crimson_twilight.immersive_cooking.block.helper;

import net.minecraft.world.item.Item;
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
            case ANDESITE -> Blocks.ANDESITE.asItem();
            case GRANITE -> Blocks.GRANITE.asItem();
            case STONE -> Blocks.STONE.asItem();
            case BLACKSTONE -> Blocks.BLACKSTONE.asItem();
            case DIORITE -> Blocks.DIORITE.asItem();
            case QUARTZ -> Blocks.QUARTZ_BLOCK.asItem();
            case DEEPSLATE -> Blocks.DEEPSLATE.asItem();
            case BASALT -> Blocks.BASALT.asItem();
            case CALCITE -> Blocks.CALCITE.asItem();
        };
    }
}
