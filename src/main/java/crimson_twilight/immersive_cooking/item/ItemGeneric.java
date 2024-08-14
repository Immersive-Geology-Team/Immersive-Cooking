package crimson_twilight.immersive_cooking.item;

import net.minecraft.world.item.Item;

public class ItemGeneric extends Item implements ICItem
{
    private String name;
    public ItemGeneric(Properties properties) {
        super(properties);
    }
    public ItemGeneric(String name) {
        this(new Properties());
        this.name = name;
    }
    public String getRegistryName()
    {
        return name;
    }
}
