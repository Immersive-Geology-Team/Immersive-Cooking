package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.PantryMaterial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;

public class ItemBlockGeneric extends BlockItem implements ICItem {
    private PantryMaterial body_material;
    private CounterMaterial counter_material;
    private final CounterTop top_material;

    public ItemBlockGeneric(Block p_40565_, Properties p_40566_, CounterTop top_material, @Nullable PantryMaterial body_material, @Nullable CounterMaterial counterMaterial) {
        super(p_40565_, p_40566_);
        this.top_material = top_material;
        this.body_material = body_material;
        this.counter_material = counterMaterial;
    }

    public CounterTop getTopMaterial()
    {
        return this.top_material;
    }

    public PantryMaterial getBodyMaterial()
    {
        return this.body_material;
    }

    public CounterMaterial getCounterBodyMaterial()
    {
        return this.counter_material;
    }

}
