package crimson_twilight.immersive_cooking.client;

import crimson_twilight.immersive_cooking.block.BlockContainerBase;
import crimson_twilight.immersive_cooking.regestry.BlockRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ModRenderHandler implements BlockColor, ItemColor {

    @OnlyIn(Dist.CLIENT)
    private static Map<RenderTypeSkeleton, RenderType> renderTypes;

    private static final Map<Block, RenderTypeSkeleton> mapping = new HashMap<>();

    public static final ModRenderHandler INSTANCE = new ModRenderHandler();

    public static void register(){
        for (DeferredBlock<Block> holder : BlockRegistry.BLOCK_MAP.values()) {
            Block b = holder.get();
            if(b instanceof BlockContainerBase){
                Minecraft.getInstance().getBlockColors().register(INSTANCE, b);
            }
            setRenderType(b, ModRenderHandler.RenderTypeSkeleton.CUTOUT_MIPPED);
        }
    }

    // Initialize the keys and mappings for render layers
    @OnlyIn(Dist.CLIENT)
    public static void init(FMLClientSetupEvent event) {
        for(Block b : mapping.keySet()) {
            ItemBlockRenderTypes.setRenderLayer(b, renderTypes.get(mapping.get(b)));
        }
    }

    @Override
    public int getColor(BlockState blockState, @Nullable BlockAndTintGetter blockAndTintGetter, @Nullable BlockPos blockPos, int i) {
        return 0xffffff;
    }

    @Override
    public int getColor(ItemStack itemStack, int i) {
        return 0xffffff;
    }

    public static void setRenderType(Block block, RenderTypeSkeleton skeleton) {
        setRenderTypeClient(block, skeleton);
    }

    @OnlyIn(Dist.CLIENT)
    private static void setRenderTypeClient(Block block, RenderTypeSkeleton skeleton) {
        resolveRenderTypes();
        mapping.put(block, skeleton);
    }

    @OnlyIn(Dist.CLIENT)
    private static void resolveRenderTypes() {
        if(renderTypes == null) {
            renderTypes = new HashMap<>();

            renderTypes.put(RenderTypeSkeleton.SOLID, RenderType.solid());
            renderTypes.put(RenderTypeSkeleton.CUTOUT, RenderType.cutout());
            renderTypes.put(RenderTypeSkeleton.CUTOUT_MIPPED, RenderType.cutoutMipped());
            renderTypes.put(RenderTypeSkeleton.TRANSLUCENT, RenderType.translucent());
        }
    }

    public enum RenderTypeSkeleton {
        SOLID,
        CUTOUT,
        CUTOUT_MIPPED,
        TRANSLUCENT;
    }
}
