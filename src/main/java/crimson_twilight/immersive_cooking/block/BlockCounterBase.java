package crimson_twilight.immersive_cooking.block;

import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.client.ModRenderHandler;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class BlockCounterBase extends BasicBlock {
    private final CounterMaterial body_material;
    private final CounterTop top_material;

    public BlockCounterBase(String name, Properties properties, CounterMaterial material, CounterTop top) {
        super(name, properties);
        this.body_material = material;
        this.top_material = top;
        ModRenderHandler.setRenderType(this, ModRenderHandler.RenderTypeSkeleton.CUTOUT_MIPPED);
    }

    public CounterMaterial getCounterMaterial()
    {
        return this.body_material;
    }

    public CounterTop getCounterTop()
    {
        return this.top_material;
    }
}
