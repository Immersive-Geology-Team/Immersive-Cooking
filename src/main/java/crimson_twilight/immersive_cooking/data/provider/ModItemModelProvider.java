package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.item.ItemGeneric;
import crimson_twilight.immersive_cooking.regestry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ImmersiveCooking.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        ImmersiveCooking.LOGGER.info("Starting Item Model Provider");
        for (RegistryObject<Item> object: ItemRegistry.ITEM_MAP.values())
        {
            Item item = object.get();
            if (item instanceof ItemGeneric generic) generateGenericItemModel(generic);
        }
    }
    private void generateGenericItemModel(ItemGeneric item)
    {
        ResourceLocation location = new ResourceLocation(ImmersiveCooking.MODID, "item/"+item.getRegistryName());
        try {
            withExistingParent(location.getPath(), new ResourceLocation("item/generated")).texture("layer0", location);
        }
        catch (Exception e)
        {
            ImmersiveCooking.LOGGER.error("Attempting to register item: "+item.getRegistryName()+", but encountered "+e.getLocalizedMessage());
        }
    }
}
