package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.item.ItemBlockCabinet;
import crimson_twilight.immersive_cooking.item.ItemBlockCounter;
import crimson_twilight.immersive_cooking.item.ItemBlockGeneric;
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
            generateGenericBlockItem(item);
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

    private void generateGenericBlockItem(Item item){

        if(item instanceof ItemBlockCabinet cabinetItem)
        {

            CounterTop top = cabinetItem.getTopMaterial();
            CabinetMaterial cabinetMaterial = cabinetItem.getBodyMaterial();

            String counter_name = top.name().toLowerCase() + "_" + cabinetMaterial.name().toLowerCase() + "_cabinet";
            String itemLocation = new ResourceLocation(ImmersiveCooking.MODID, "item/" + counter_name).getPath();
            ResourceLocation counter_model_name = new ResourceLocation(ImmersiveCooking.MODID, "block/"+counter_name);
            withExistingParent(itemLocation, counter_model_name);
            return;
        }

        if(item instanceof ItemBlockCounter counterItem)
        {
            CounterTop top = counterItem.getTopMaterial();
            CounterMaterial counterMaterial = counterItem.getCounterBodyMaterial();

            String counter_name = top.name().toLowerCase() + "_" + counterMaterial.name().toLowerCase() + "_counter";
            String itemLocation = new ResourceLocation(ImmersiveCooking.MODID, "item/" + counter_name).getPath();
            ResourceLocation counter_model_name = new ResourceLocation(ImmersiveCooking.MODID, "block/"+counter_name);
            withExistingParent(itemLocation, counter_model_name);
            return;
        }

        if(item instanceof ItemBlockGeneric blockItem) {
            withExistingParent(blockItem.getRegistryName(), new ResourceLocation(ImmersiveCooking.MODID, "block/" + blockItem.getRegistryName()));
        }
    }
}
