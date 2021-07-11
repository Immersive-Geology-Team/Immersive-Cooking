package crimson_twilight.immersive_cooking.registry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes
{
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ImmersiveCooking.MODID);
}
