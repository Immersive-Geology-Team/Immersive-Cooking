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
                    (Block)ModBlocks.OAK_STONE_PANTRY.get(), (Block)ModBlocks.BIRCH_STONE_PANTRY.get(), (Block)ModBlocks.SPRUCE_STONE_PANTRY.get(),
                    (Block)ModBlocks.JUNGLE_STONE_PANTRY.get(), (Block)ModBlocks.ACACIA_STONE_PANTRY.get(), (Block)ModBlocks.DARK_OAK_STONE_PANTRY.get(),
                    (Block)ModBlocks.SPRUCE_STONE_PANTRY.get(), (Block)ModBlocks.CRIMSON_STONE_PANTRY.get(), (Block)ModBlocks.WARPED_STONE_PANTRY.get(),
                    (Block)ModBlocks.OAK_BLACKSTONE_PANTRY.get(), (Block)ModBlocks.BIRCH_BLACKSTONE_PANTRY.get(), ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(),
                    ModBlocks.JUNGLE_BLACKSTONE_PANTRY.get(), ModBlocks.ACACIA_BLACKSTONE_PANTRY.get(), ModBlocks.DARK_OAK_BLACKSTONE_PANTRY.get(),
                    ModBlocks.SPRUCE_BLACKSTONE_PANTRY.get(), ModBlocks.CRIMSON_BLACKSTONE_PANTRY.get(), ModBlocks.WARPED_BLACKSTONE_PANTRY.get()}).build(null));
}
