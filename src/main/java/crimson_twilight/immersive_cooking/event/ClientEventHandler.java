package crimson_twilight.immersive_cooking.event;

import crimson_twilight.immersive_cooking.client.ModRenderHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientEventHandler
{
    public static void init(final FMLClientSetupEvent e)
    {
        e.enqueueWork(()->{
            ModRenderHandler.register();
            ModRenderHandler.init(e);
        });
    }
}
