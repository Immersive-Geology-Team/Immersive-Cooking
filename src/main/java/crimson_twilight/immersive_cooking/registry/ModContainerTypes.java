package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes
{
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, ImmersiveCooking.MODID);
}
