package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

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
