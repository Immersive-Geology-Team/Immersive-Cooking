package crimson_twilight.immersive_cooking.event;


import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public class CommonEventHandler
{
    public static void init(final FMLCommonSetupEvent e)
    {
        e.enqueueWork(()->{});
    }
}
