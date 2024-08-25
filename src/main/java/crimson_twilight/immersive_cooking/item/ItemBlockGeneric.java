package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

//TODO extend out this class into specifics for counters and cabinets
public class ItemBlockGeneric extends BlockItem implements ICItem {
    private CabinetMaterial body_material;
    private CounterMaterial counter_material;
    private CounterTop top_material;

    public ItemBlockGeneric(Block p_40565_, Properties p_40566_, @Nullable CounterTop top_material, @Nullable CabinetMaterial body_material, @Nullable CounterMaterial counterMaterial) {
        super(p_40565_, p_40566_);
        this.top_material = top_material;
        this.body_material = body_material;
        this.counter_material = counterMaterial;
    }

    public CounterTop getTopMaterial()
    {
        return this.top_material;
    }

    public CabinetMaterial getBodyMaterial()
    {
        return this.body_material;
    }

    @Override
    public Component getName(ItemStack stack) {

        boolean isCounter = (top_material != null);
        if (isCounter)
        {
            List<Component> descriptionList = new ArrayList<>();
            descriptionList.add(Component.translatable("material.immersive_cooking." + top_material.name().toLowerCase()));
            if(counter_material != null) {
                descriptionList.add(Component.translatable("material.immersive_cooking." + counter_material.name().toLowerCase()));
            } else {
                descriptionList.add(Component.translatable("material.immersive_cooking." + body_material.name().toLowerCase()));
            }
            return Component.translatable("block.immersive_cooking." + (counter_material != null ? "counter" : "cabinet"), descriptionList.toArray());
        }

        return super.getName(stack);
    }


    public CounterMaterial getCounterBodyMaterial()
    {
        return this.counter_material;
    }

}
