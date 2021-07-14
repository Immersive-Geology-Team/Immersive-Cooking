package crimson_twilight.immersive_cooking.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import vectorwing.farmersdelight.blocks.PantryBlock;

public class PantryCounter extends PantryBlock
{
    public PantryCounter(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(hit.getDirection() == state.getValue(FACING)) return super.use(state, worldIn, pos, player, handIn, hit);
        return ActionResultType.PASS;
    }
}
