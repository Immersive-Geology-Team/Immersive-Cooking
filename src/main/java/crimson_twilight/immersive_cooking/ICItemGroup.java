package crimson_twilight.immersive_cooking;

import crimson_twilight.immersive_cooking.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public class ICItemGroup extends ItemGroup
{
    public ICItemGroup(String label) {
        super(label);
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.SMOKED_SPIDER_SHANK.get());
    }
}
