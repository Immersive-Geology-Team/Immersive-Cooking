package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.item.util.FoodStuff;

public class ItemFood extends ItemGeneric
{
    private final FoodStuff food;
    public ItemFood(FoodStuff foodStuff)
    {
        super(foodStuff.getProp());
        this.food=foodStuff;
        this.hasCraftingRemainingItem();
    }

    @Override
    public String getRegistryName() {
        return food.getRegistryName();
    }
}
