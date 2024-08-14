package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;

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
}
