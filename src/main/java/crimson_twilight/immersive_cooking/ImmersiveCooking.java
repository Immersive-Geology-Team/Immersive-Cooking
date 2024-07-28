package crimson_twilight.immersive_cooking;

import crimson_twilight.immersive_cooking.event.ClientEventHandler;
import crimson_twilight.immersive_cooking.event.CommonEventHandler;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import crimson_twilight.immersive_cooking.regestry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ImmersiveCooking.MODID)
@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ImmersiveCooking
{
    public static final String MODID = "immersive_cooking";
    public static final Logger LOGGER = LogManager.getLogger();

    public ImmersiveCooking()
    {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(CommonEventHandler::init);
        eventBus.addListener(ClientEventHandler::init);
        init();
        register();

        //THE END
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void init()
    {
        ItemRegistry.init();
        //BlockRegistry.init()
    }
    private void register()
    {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
    }
}
