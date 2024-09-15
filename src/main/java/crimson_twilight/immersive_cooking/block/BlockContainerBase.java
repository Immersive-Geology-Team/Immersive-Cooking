package crimson_twilight.immersive_cooking.block;

import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.client.ModRenderHandler;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraftforge.fml.loading.FMLEnvironment;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class BlockContainerBase extends CabinetBlock {
    private final CabinetMaterial body_material;
    private final CounterTop top_material;
    private final String name;

    public BlockContainerBase(String name, Properties properties, CabinetMaterial material, CounterTop top) {
        super(properties);
        this.body_material = material;
        this.top_material = top;
        this.name = name;
    }

    public CabinetMaterial getCounterMaterial()
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
