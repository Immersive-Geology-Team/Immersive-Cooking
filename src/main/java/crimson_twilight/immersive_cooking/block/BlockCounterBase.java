package crimson_twilight.immersive_cooking.block;

import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.client.ModRenderHandler;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class BlockCounterBase extends BasicBlock {
    private final CounterMaterial body_material;
    private final CounterTop top_material;

    public static final DirectionProperty FACING;

    public BlockCounterBase(String name, Properties properties, CounterMaterial material, CounterTop top) {
        super(name, properties);
        this.body_material = material;
        this.top_material = top;
        ModRenderHandler.setRenderType(this, ModRenderHandler.RenderTypeSkeleton.CUTOUT_MIPPED);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public CounterMaterial getCounterMaterial()
    {
        return this.body_material;
    }

    public CounterTop getCounterTop()
    {
        return this.top_material;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(new Property[]{FACING});
    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
    }
}
