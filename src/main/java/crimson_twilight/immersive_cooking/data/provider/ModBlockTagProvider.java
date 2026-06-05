package crimson_twilight.immersive_cooking.data.provider;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.block.BasicBlock;
import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.block.BlockCounterBase;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ImmersiveCooking.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        for(DeferredBlock<Block> block : BlockRegistry.BLOCK_MAP.values())
        {
            if(block.get() instanceof BlockContainerBase cabinetBlock)
            {
                tag(cabinetBlock.getCounterMaterial().getMineableType()).add(cabinetBlock);
                tag(cabinetBlock.getCounterTop().getMineableType()).add(cabinetBlock);
            }

            if(block.get() instanceof BlockCounterBase cabinetBlock)
            {
                tag(cabinetBlock.getCounterMaterial().getMineableType()).add(cabinetBlock);
                tag(cabinetBlock.getCounterTop().getMineableType()).add(cabinetBlock);
            }

            if(block.get() instanceof BasicBlock basicBlock)
            {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(basicBlock);
            }
        }
    }
}
