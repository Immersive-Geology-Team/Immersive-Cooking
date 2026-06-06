package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;

public interface ICItem {
    default CounterTop getTopMaterial(){
        return CounterTop.ANDESITE;
    }
    default CabinetMaterial getBodyMaterial()
    {
        return CabinetMaterial.ACACIA;
    }

    default CounterMaterial getCounterBodyMaterial()
    {
        return CounterMaterial.ACACIA;
    }

    String getRegistryName();
}
