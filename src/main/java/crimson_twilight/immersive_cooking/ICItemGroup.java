package crimson_twilight.immersive_cooking;

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
        return new ItemStack(Items.BAKED_POTATO);
    }
}
