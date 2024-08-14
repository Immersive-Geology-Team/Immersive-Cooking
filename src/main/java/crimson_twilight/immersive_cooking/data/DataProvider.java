package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.data.provider.ModBlockModelProvider;
import crimson_twilight.immersive_cooking.data.provider.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ImmersiveCooking.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataProvider
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e)
    {
        ExistingFileHelper helper = e.getExistingFileHelper();
        DataGenerator gen = e.getGenerator();
        PackOutput out = gen.getPackOutput();
        gen.addProvider(e.includeClient(), new ModBlockModelProvider(out, helper));
        gen.addProvider(e.includeClient(), new ModItemModelProvider(out, helper));
    }
}
