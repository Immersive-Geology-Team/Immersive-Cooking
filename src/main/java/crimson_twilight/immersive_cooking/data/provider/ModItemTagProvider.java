package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.item.util.FoodStuff;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (FoodStuff food : FoodStuff.values()) {
            if (food.getOptionHolder().get().hasOption(FoodStuff.FoodOptions.MEAT)) {
                tag(ItemTags.MEAT).add(BuiltInRegistries.ITEM.get(
                        ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, food.getRegistryName())
                ));
            }
        }
    }
}
