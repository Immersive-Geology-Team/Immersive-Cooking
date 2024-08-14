package crimson_twilight.immersive_cooking.block;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.PantryMaterial;
import crimson_twilight.immersive_cooking.client.ModRenderHandler;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class BlockContainerBase extends CabinetBlock {
    private final PantryMaterial body_material;
    private final CounterTop top_material;
    private final String name;

    public BlockContainerBase(String name,Properties properties, PantryMaterial material, CounterTop top) {
        super(properties);
        this.body_material = material;
        this.top_material = top;
        this.name = name;
        ModRenderHandler.setRenderType(this, ModRenderHandler.RenderTypeSkeleton.CUTOUT_MIPPED);
    }

    public PantryMaterial getCounterMaterial()
    {
        return this.body_material;
    }

    public CounterTop getCounterTop()
    {
        return this.top_material;
    }

    public String getRegistryName()
    {
        return this.name;
    }


}
