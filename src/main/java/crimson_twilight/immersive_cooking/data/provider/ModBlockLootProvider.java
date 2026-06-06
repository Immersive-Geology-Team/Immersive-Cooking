package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BasicBlock;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ModBlockLootProvider extends BlockLootSubProvider {

    private final Set<Block> generatedLootTables = new HashSet<>();

    public ModBlockLootProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        for(DeferredBlock<Block> block : BlockRegistry.BLOCK_MAP.values())
        {
            try{
                if(block.get() instanceof BasicBlock basicBlock && !(block.get() instanceof BlockContainerBase || block.get() instanceof BlockCounterBase) )
                {
                    LootTable.Builder ret = LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                            .add(LootItem.lootTableItem(basicBlock).when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.PICKAXES)))));
                    this.generatedLootTables.add(basicBlock);
                    this.map.put(basicBlock.getLootTable(), ret);
                    continue;
                }
                dropSelf(block.get());
            } catch (Exception err)
            {
                ImmersiveCooking.LOGGER.error("Exception Occurred for {} see error: {}", block.get(), err.getLocalizedMessage());
            }
        }
    }

    @Override
    protected void add(@NotNull Block block, LootTable.@NotNull Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }
}
