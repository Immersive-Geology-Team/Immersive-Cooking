package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BasicSlabBlock;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.VariantBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class ModBlockModelProvider extends BlockStateProvider
{
    private static final int DEFAULT_ANGLE_OFFSET = 180;

    public ModBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ImmersiveCooking.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        ImmersiveCooking.LOGGER.info("Starting Block State Model Provider");
        for (DeferredBlock<Block> object: BlockRegistry.BLOCK_MAP.values())
        {
            Block block = object.get();
            switch (block) {
                case BlockContainerBase generic -> generateCounterModel(generic);
                case BlockCounterBase generic -> generateBasicCounterModel(generic);
                case BasicSlabBlock slab -> generateBasicSlabModel(slab);
                case Block ignored ->
                        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(cubeAll(block)).build());
            }
        }
    }

    private void generateCounterModel(BlockContainerBase block)
    {
        ResourceLocation countertop_top_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/top/" + block.getCounterTop().name().toLowerCase() + "_counter");
        ResourceLocation countertop_side_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/side/" + block.getCounterTop().name().toLowerCase() + "_counter");
        ResourceLocation countertop_front_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/front/" + block.getCounterTop().name().toLowerCase() + "_counter");

        ResourceLocation countermaterial_top_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/top/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_side_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/side/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_front_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/front/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_open_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/open/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_bottom_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/bottom/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");

        ResourceLocation counter_model_name = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + block.getRegistryName());
        ResourceLocation counter_parent_name = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/base_countertop");

        BlockModelBuilder cabinetModel;
        BlockModelBuilder openCabinetModel;

        try {
            cabinetModel = models().withExistingParent(counter_model_name.getPath(), counter_parent_name)
                    .texture("top_countertop", countertop_top_tex)
                    .texture("side_countertop", countertop_side_tex)
                    .texture("front_countertop", countertop_front_tex)
                    .texture("top_countermaterial", countermaterial_top_tex)
                    .texture("side_countermaterial", countermaterial_side_tex)
                    .texture("front_countermaterial", countermaterial_front_tex)
                    .texture("bottom_countermaterial", countermaterial_bottom_tex);

            openCabinetModel = models().withExistingParent(counter_model_name.getPath() + "_open", counter_parent_name)
                    .texture("top_countertop", countertop_top_tex)
                    .texture("side_countertop", countertop_side_tex)
                    .texture("front_countertop", countertop_front_tex)
                    .texture("top_countermaterial", countermaterial_top_tex)
                    .texture("side_countermaterial", countermaterial_side_tex)
                    .texture("front_countermaterial", countermaterial_open_tex)
                    .texture("bottom_countermaterial", countermaterial_bottom_tex);

            getVariantBuilder(block).forAllStates((state) ->
            {
                boolean isOpen = state.getValue(CabinetBlock.OPEN);
                return ConfiguredModel.builder().rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + DEFAULT_ANGLE_OFFSET) % 360).modelFile(isOpen ? openCabinetModel : cabinetModel).build();
            });
        }
        catch (Exception e)
        {
            ImmersiveCooking.LOGGER.error("Attempting to register block: {}, but encountered {}", block.getRegistryName(), e.getLocalizedMessage());
        }
    }
    private void generateBasicCounterModel(BlockCounterBase block)
    {
        ResourceLocation countertop_top_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/top/" + block.getCounterTop().name().toLowerCase() + "_counter");
        ResourceLocation countertop_side_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/side/" + block.getCounterTop().name().toLowerCase() + "_counter");
        ResourceLocation countertop_front_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/counter/front/" + block.getCounterTop().name().toLowerCase() + "_counter");

        ResourceLocation countermaterial_top_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/top/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_side_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/side/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_bottom_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/bottom/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");
        ResourceLocation countermaterial_front_tex = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/cabinet/side/" + block.getCounterMaterial().name().toLowerCase() + "_pantry");


        ResourceLocation counter_model_name = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/"+block.getRegistryName());
        ResourceLocation counter_parent_name = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/base_countertop");

        BlockModelBuilder counterModel;

        try {
            counterModel = models().withExistingParent(counter_model_name.getPath(), counter_parent_name)
                    .texture("top_countertop", countertop_top_tex)
                    .texture("side_countertop", countertop_side_tex)
                    .texture("front_countertop", countertop_front_tex)
                    .texture("top_countermaterial", countermaterial_top_tex)
                    .texture("side_countermaterial", countermaterial_side_tex)
                    .texture("front_countermaterial", countermaterial_front_tex)
                    .texture("bottom_countermaterial", countermaterial_bottom_tex);

            getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + DEFAULT_ANGLE_OFFSET) % 360).modelFile(counterModel).build());
        }
        catch (Exception e)
        {
            ImmersiveCooking.LOGGER.error("Attempting to register block: {}, but encountered {}", block.getRegistryName(), e.getLocalizedMessage());
        }
    }

    private void generateBasicSlabModel(BasicSlabBlock slab)
    {
        VariantBlockStateBuilder builder = getVariantBuilder(slab);
        BlockModelBuilder baseModel = models().withExistingParent(ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + slab.getRegistryName().toLowerCase()).getPath(),
                ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/slab/slab_base"));

        BlockModelBuilder topModel = models().withExistingParent(ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + slab.getRegistryName().toLowerCase() + "_top").getPath(),
                ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/slab/slab_base_top"));

        BlockModelBuilder doubleModel = models().withExistingParent(ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + slab.getRegistryName().toLowerCase() + "_double").getPath(),
                ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/slab/slab_base_double"));

        ResourceLocation rTextureLocBase = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + slab.getRegistryName().toLowerCase().replace("_slab", ""));
        ResourceLocation rTextureLocSide = ResourceLocation.fromNamespaceAndPath(ImmersiveCooking.MODID, "block/" + slab.getRegistryName().toLowerCase().replace("_slab", ""));

        baseModel.texture("particle", rTextureLocBase);
        topModel.texture("particle", rTextureLocBase);
        doubleModel.texture("particle", rTextureLocBase);

        doubleModel.texture("all", rTextureLocBase);
        topModel.texture("all", rTextureLocBase);
        baseModel.texture("all", rTextureLocBase);

        doubleModel.texture("side", rTextureLocSide);
        doubleModel.texture("cover", rTextureLocBase);

        topModel.texture("side", rTextureLocSide);
        topModel.texture("cover", rTextureLocBase);

        baseModel.texture("side", rTextureLocSide);
        baseModel.texture("cover", rTextureLocBase);

        builder.forAllStates(blockState ->
                blockState.getValue(SlabBlock.TYPE) == SlabType.BOTTOM ?
                        (ConfiguredModel.builder().modelFile(baseModel).uvLock(true).build()):
                        blockState.getValue(SlabBlock.TYPE) == SlabType.TOP ?
                                (ConfiguredModel.builder().modelFile(topModel).uvLock(true).build()):
                                (ConfiguredModel.builder().modelFile(doubleModel).uvLock(true).build()));
    }
}
