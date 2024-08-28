package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashSet;
import java.util.Set;

public class ModBlockLootProvider extends BlockLootSubProvider {

    private final Set<Block> generatedLootTables = new HashSet<>();
    public ModBlockLootProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        for(RegistryObject<Block> block : BlockRegistry.BLOCK_MAP.values())
        {
            try{
                dropSelf(block.get());
            } catch (Exception err)
            {
                ImmersiveCooking.LOGGER.error("Exception Occurred for {} see error: {}", block.get(), err.getLocalizedMessage());
            }
        }
    }

    @Override
    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }
}
