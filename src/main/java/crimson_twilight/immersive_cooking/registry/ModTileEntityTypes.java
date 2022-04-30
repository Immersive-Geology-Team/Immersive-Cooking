package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.tile.PantryCounterTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.tile.PantryTileEntity;

public class ModTileEntityTypes
{
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ImmersiveCooking.MODID);

    public static final RegistryObject<TileEntityType<PantryCounterTileEntity>> PANTRY_COUNTER_TILE = TILES.register("pantry_counter",
            () -> TileEntityType.Builder.of(PantryCounterTileEntity::new, new Block[]{
                    ModBlocks.OAK_STONE_PANTRY.get(), ModBlocks.BIRCH_STONE_PANTRY.get(), ModBlocks.SPRUCE_STONE_PANTRY.get(),
                    ModBlocks.JUNGLE_STONE_PANTRY.get(), ModBlocks.ACACIA_STONE_PANTRY.get(), ModBlocks.DARK_OAK_STONE_PANTRY.get(),
                    ModBlocks.CRIMSON_STONE_PANTRY.get(), ModBlocks.WARPED_STONE_PANTRY.get(),
                    ModBlocks.OAK_BLACKSTONE_PANTRY.get(), ModBlocks.BIRCH_BLACKSTONE_PANTRY.get(), ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(),
                    ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get(), ModBlocks.ACACIA_BLACKSTONE_PANTRY.get(), ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get(),
                    ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get(), ModBlocks.WARPED_BLACKSTONE_PANTRY.get(),
                    ModBlocks.OAK_ANDESITE_PANTRY.get(), ModBlocks.BIRCH_ANDESITE_PANTRY.get(), ModBlocks.SPRUCE_ANDESITE_PANTRY.get(),
                    ModBlocks.JUNGLE_ANDESITE_PANTRY.get(), ModBlocks.ACACIA_ANDESITE_PANTRY.get(), ModBlocks.DARK_OAK_ANDESITE_PANTRY.get(),
                    ModBlocks.CRIMSON_ANDESITE_PANTRY.get(), ModBlocks.WARPED_ANDESITE_PANTRY.get(),
                    ModBlocks.OAK_DIORITE_PANTRY.get(), ModBlocks.BIRCH_DIORITE_PANTRY.get(), ModBlocks.SPRUCE_DIORITE_PANTRY.get(),
                    ModBlocks.JUNGLE_DIORITE_PANTRY.get(), ModBlocks.ACACIA_DIORITE_PANTRY.get(), ModBlocks.DARK_OAK_DIORITE_PANTRY.get(),
                    ModBlocks.CRIMSON_DIORITE_PANTRY.get(), ModBlocks.WARPED_DIORITE_PANTRY.get(),
                    ModBlocks.OAK_GRANITE_PANTRY.get(), ModBlocks.BIRCH_GRANITE_PANTRY.get(), ModBlocks.SPRUCE_GRANITE_PANTRY.get(),
                    ModBlocks.JUNGLE_GRANITE_PANTRY.get(), ModBlocks.ACACIA_GRANITE_PANTRY.get(), ModBlocks.DARK_OAK_GRANITE_PANTRY.get(),
                    ModBlocks.CRIMSON_GRANITE_PANTRY.get(), ModBlocks.WARPED_GRANITE_PANTRY.get(),
                    ModBlocks.OAK_QUARTZ_PANTRY.get(), ModBlocks.BIRCH_QUARTZ_PANTRY.get(), ModBlocks.SPRUCE_QUARTZ_PANTRY.get(),
                    ModBlocks.JUNGLE_QUARTZ_PANTRY.get(), ModBlocks.ACACIA_QUARTZ_PANTRY.get(), ModBlocks.DARK_OAK_QUARTZ_PANTRY.get(),
                    ModBlocks.CRIMSON_QUARTZ_PANTRY.get(), ModBlocks.WARPED_QUARTZ_PANTRY.get()}).build(null));
}
