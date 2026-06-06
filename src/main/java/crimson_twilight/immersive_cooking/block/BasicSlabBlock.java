package crimson_twilight.immersive_cooking.block;

import net.minecraft.world.level.block.SlabBlock;

public class BasicSlabBlock extends SlabBlock
{
    private final String name;
    public BasicSlabBlock(String name, Properties properties)
    {
        super(properties);
        this.name = name;
    }

    public String getRegistryName()
    {
        return this.name;
    }
}
