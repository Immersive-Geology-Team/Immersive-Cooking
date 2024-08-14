package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class ItemBlockGeneric extends BlockItem implements ICItem {
    private final CounterMaterial body_material;
    private final CounterTop top_material;

    public ItemBlockGeneric(Block p_40565_, Properties p_40566_, CounterTop top_material, CounterMaterial body_material) {
        super(p_40565_, p_40566_);
        this.top_material = top_material;
        this.body_material = body_material;
    }

    public CounterTop getTopMaterial()
    {
        return this.top_material;
    }

    public CounterMaterial getBodyMaterial()
    {
        return this.body_material;
    }

}
