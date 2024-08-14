package crimson_twilight.immersive_cooking.block;

import net.minecraft.world.level.block.Block;

public class BasicBlock extends Block
{
    private final String name;
    public BasicBlock(String name, Properties properties)
    {
        super(properties);
        this.name = name;
    }

    public String getRegistryName()
    {
        return this.name;
    }
}
