package crimson_twilight.immersive_cooking.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Sink extends Block
{
    public static final IntegerProperty LEVEL = IntegerProperty.create("water_level", 0, 6);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();
    private static final VoxelShape SHAPE = Stream.of(
                Block.box(3, 0, 0, 13, 16, 3),
                Block.box(0, 0, 0, 3, 16, 3),
                Block.box(13, 0, 0, 16, 16, 3),
                Block.box(0, 0, 3, 3, 16, 13),
                Block.box(13, 0, 3, 16, 16, 13),
                Block.box(0, 0, 13, 3, 16, 16),
                Block.box(13, 0, 13, 16, 16, 16),
                Block.box(3, 0, 13, 13, 16, 16),
                Block.box(3, 0, 3, 13, 10, 13)
            ).reduce((v1, v2) -> {return VoxelShapes.join(v1, v2, IBooleanFunction.OR);}).get();


    public Sink(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LEVEL, Integer.valueOf(0)).setValue(FACING, Direction.NORTH));
        runCalc(SHAPE);
    }

    protected static void calcShapes(Direction to, VoxelShape shape)
    {
        VoxelShape[] buffer = new VoxelShape[] { shape, VoxelShapes.empty() };

        int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4)% 4;
        for(int i = 0; i < times; i++)
        {
            buffer[0].forAllBoxes(
                    (minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1],
                            VoxelShapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }
        SHAPES.put(to, buffer[0]);
    }

    protected void runCalc(VoxelShape shape)
    {
        for (Direction direction : Direction.values())
        {
            calcShapes(direction, shape);
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.getValue(FACING));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation((Direction) state.getValue(FACING)));
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(new Property[]{FACING, LEVEL});
    }
}
