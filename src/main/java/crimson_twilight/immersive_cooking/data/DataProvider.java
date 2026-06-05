package crimson_twilight.immersive_cooking.data;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.data.provider.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ImmersiveCooking.MODID)
public class DataProvider
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e)
    {
        ExistingFileHelper helper = e.getExistingFileHelper();
        DataGenerator gen = e.getGenerator();
        PackOutput out = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookup = e.getLookupProvider();

        // Client Providers
        gen.addProvider(e.includeClient(), new ModBlockModelProvider(out, helper));
        gen.addProvider(e.includeClient(), new ModItemModelProvider(out, helper));
        gen.addProvider(e.includeClient(), new ModRecipeProvider(out, lookup));

        // Server Providers
        gen.addProvider(e.includeServer(), new ModBlockTagProvider(out, lookup, helper));

        // Updated LootTableProvider for 1.21.1
        gen.addProvider(e.includeServer(), new LootTableProvider(
                out,
                Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootProvider::new, LootContextParamSets.BLOCK)),
                lookup // 1.21.1 requires passing the registry lookup directly to the LootTableProvider constructor
        ));
    }
}
