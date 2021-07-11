package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeSerializers
{
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ImmersiveCooking.MODID);
}
