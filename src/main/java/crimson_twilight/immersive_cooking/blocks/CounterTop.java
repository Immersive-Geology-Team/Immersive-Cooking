package crimson_twilight.immersive_cooking.blocks;

import net.minecraft.block.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class CounterTop extends HorizontalBlock
{
    protected static final VoxelShape SHAPE = Block.box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public CounterTop(Properties properties)
    {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos.north()).isFaceSturdy(worldIn, pos.north(), Direction.SOUTH) || worldIn.getBlockState(pos.west()).isFaceSturdy(worldIn, pos.west(), Direction.EAST) || worldIn.getBlockState(pos.south()).isFaceSturdy(worldIn, pos.south(), Direction.NORTH) || worldIn.getBlockState(pos.east()).isFaceSturdy(worldIn, pos.east(), Direction.WEST);
    }

    @Override
    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        return !p_196271_1_.canSurvive(p_196271_4_, p_196271_5_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockState lvt_7_1_ = this.defaultBlockState();
        if (lvt_7_1_.canSurvive(p_196258_1_.getLevel(), p_196258_1_.getClickedPos())) {
            return lvt_7_1_;
        }
        return null;
    }
}
