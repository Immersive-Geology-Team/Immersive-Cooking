package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;

public interface ICItem {
    default CounterTop getTopMaterial(){
        return CounterTop.ANDESITE;
    }
    default CounterMaterial getBodyMaterial()
    {
        return CounterMaterial.ACACIA;
    }
}
