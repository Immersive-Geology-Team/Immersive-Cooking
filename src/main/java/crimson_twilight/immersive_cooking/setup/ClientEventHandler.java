package crimson_twilight.immersive_cooking.setup;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler
{
    public static void init(final FMLClientSetupEvent event) {

    }
}
