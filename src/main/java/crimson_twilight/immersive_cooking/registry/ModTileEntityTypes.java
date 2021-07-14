package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.tile.PantryCounterTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.tile.PantryTileEntity;

public class ModTileEntityTypes
{
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ImmersiveCooking.MODID);

    public static final RegistryObject<TileEntityType<PantryCounterTileEntity>> PANTRY_TILE = TILES.register("pantry_counter",
            () -> TileEntityType.Builder.of(PantryCounterTileEntity::new,
                    ModBlocks.OAK_STONE_PANTRY.get(), ModBlocks.BIRCH_STONE_PANTRY.get(), ModBlocks.SPRUCE_STONE_PANTRY.get(),
                    ModBlocks.JUNGLE_STONE_PANTRY.get(), ModBlocks.ACACIA_STONE_PANTRY.get(), ModBlocks.DARK_OAK_STONE_PANTRY.get(),
                    ModBlocks.SPRUCE_STONE_PANTRY.get(), ModBlocks.CRIMSON_STONE_PANTRY.get(), ModBlocks.WARPED_STONE_PANTRY.get(),
                    ModBlocks.OAK_BLACKSTONE_PANTRY.get(), ModBlocks.BIRCH_BLACKSTONE_PANTRY.get(), ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(),
                    ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get(), ModBlocks.ACACIA_BLACKSTONE_PANTRY.get(), ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get(),
                    ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(), ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get(), ModBlocks.WARPED_BLACKSTONE_PANTRY.get()).build(null));
}
