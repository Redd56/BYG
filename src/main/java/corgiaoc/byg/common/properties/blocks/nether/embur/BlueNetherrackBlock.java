package corgiaoc.byg.common.properties.blocks.nether.embur;

import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

import net.minecraft.block.AbstractBlock.Properties;

public class BlueNetherrackBlock extends Block implements IGrowable {
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D);

    protected BlueNetherrackBlock(Properties builder) {
        super(builder);

    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        if (worldIn.getBlockState(pos.up()).propagatesSkylightDown(worldIn, pos)) {
            for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
                if (worldIn.getBlockState(blockpos).isIn(BlockTags.NYLIUM)) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        boolean flag = false;
        boolean flag1 = false;

        for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockstate = worldIn.getBlockState(blockpos);
            if (blockstate.isIn(BYGBlocks.EMBUR_NYLIUM)) {
                flag1 = true;
            }

            if (flag1 && flag) {
                break;
            }
        }

        if (flag1 && flag) {
            worldIn.setBlockState(pos, rand.nextBoolean() ? BYGBlocks.EMBUR_NYLIUM.getDefaultState() : BYGBlocks.EMBUR_NYLIUM.getDefaultState(), 3);
        } else if (flag1) {
            worldIn.setBlockState(pos, BYGBlocks.EMBUR_NYLIUM.getDefaultState(), 3);
        } else if (flag) {
            worldIn.setBlockState(pos, BYGBlocks.EMBUR_NYLIUM.getDefaultState(), 3);
        }

    }
}

