package crimson_twilight.immersive_cooking.setup;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.loot.modifiers.AddItemModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LootModifierHandler
{
    @SubscribeEvent
    public static void registerModifiers(RegistryEvent.Register<GlobalLootModifierSerializer<?>> ev)
    {
        ev.getRegistry().register(
                new AddItemModifier.Serializer().setRegistryName(ImmersiveCooking.MODID, "add_item")
        );
    }
}
