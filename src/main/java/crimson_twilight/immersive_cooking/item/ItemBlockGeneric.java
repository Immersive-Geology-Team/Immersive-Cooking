package crimson_twilight.immersive_cooking.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

//TODO extend out this class into specifics for counters and cabinets
public class ItemBlockGeneric extends BlockItem implements ICItem {

    protected String registry_name;
    public ItemBlockGeneric(Block block, Properties props, String registry_name) {
        super(block, props);
        this.registry_name = registry_name;
    }

    @Override
    public String getRegistryName() {
        return this.registry_name;
    }
}
