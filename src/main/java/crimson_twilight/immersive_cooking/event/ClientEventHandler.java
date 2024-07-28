package crimson_twilight.immersive_cooking.event;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientEventHandler
{
    public static void init(final FMLClientSetupEvent e)
    {
        e.enqueueWork(()->{});
    }
}
