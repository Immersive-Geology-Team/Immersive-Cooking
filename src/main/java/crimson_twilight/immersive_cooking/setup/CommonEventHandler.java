package crimson_twilight.immersive_cooking.setup;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID)
@ParametersAreNonnullByDefault
public class CommonEventHandler
{
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}
