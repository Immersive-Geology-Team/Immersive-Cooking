package crimson_twilight.immersive_cooking;

import crimson_twilight.immersive_cooking.event.ClientEventHandler;
import crimson_twilight.immersive_cooking.event.CommonEventHandler;
import crimson_twilight.immersive_cooking.registry.BlockRegistry;
import crimson_twilight.immersive_cooking.registry.ItemRegistry;
import crimson_twilight.immersive_cooking.registry.MenuTabRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ImmersiveCooking.MODID)
public class ImmersiveCooking {
    public static final String MODID = "immersive_cooking";
    public static final Logger LOGGER = LogManager.getLogger();

    // NeoForge automatically injects the Mod Event Bus directly into your constructor
    public ImmersiveCooking(IEventBus eventBus)
    {
        eventBus.addListener(CommonEventHandler::init);

        if (FMLEnvironment.dist.isClient()) {
            eventBus.addListener(ClientEventHandler::init);
        }

        init();
        register(eventBus);
    }

    private void init()
    {
        ItemRegistry.init();
        BlockRegistry.init();
    }

    private void register(IEventBus eventBus)
    {
        ItemRegistry.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
        MenuTabRegistry.TAB_REGISTER.register(eventBus);
    }
}