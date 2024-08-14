package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.PantryMaterial;

public interface ICItem {
    default CounterTop getTopMaterial(){
        return CounterTop.ANDESITE;
    }
    default PantryMaterial getBodyMaterial()
    {
        return PantryMaterial.ACACIA;
    }

    default CounterMaterial getCounterBodyMaterial()
    {
        return CounterMaterial.ACACIA;
    }
}
