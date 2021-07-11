package crimson_twilight.immersive_cooking;

import crimson_twilight.immersive_cooking.registry.*;
import crimson_twilight.immersive_cooking.setup.ClientEventHandler;
import crimson_twilight.immersive_cooking.setup.CommonEventHandler;
import crimson_twilight.immersive_cooking.setup.Configuration;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.GenericEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ImmersiveCooking.MODID)
@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ImmersiveCooking
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "immersivecooking";

    public static final ICItemGroup ITEM_GROUP = new ICItemGroup(ImmersiveCooking.MODID);

    public ImmersiveCooking() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(CommonEventHandler::init);
        modEventBus.addListener(ClientEventHandler::init);
        modEventBus.addGenericListener(IRecipeSerializer.class, this::registerRecipeSerializers);

        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_CONFIG);
        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Configuration.CLIENT_CONFIG);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTileEntityTypes.TILES.register(modEventBus);
        ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
        ModRecipeSerializers.RECIPE_SERIALIZERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void registerRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event)
    {
    }
}