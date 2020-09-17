package voronoiaoc.byg.common.world.feature.features.overworld.mushrooms;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import voronoiaoc.byg.common.world.feature.config.BYGMushroomFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.mushrooms.util.BYGAbstractMushroomFeature;

import java.util.Random;

public class WarpedFungus1 extends BYGAbstractMushroomFeature<BYGMushroomFeatureConfig> {

    public WarpedFungus1(Codec<BYGMushroomFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(ISeedReader worldIn, Random rand, BlockPos pos, boolean isMushroom, BYGMushroomFeatureConfig config) {
        BlockState STEM = config.getStemProvider().getBlockState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getBlockState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getBlockState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getBlockState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getBlockState(rand, pos);int randTreeHeight = 10 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().setPos(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeStem(STEM, worldIn, mainmutable.add(-1, 0, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 0, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 0, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 0, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 1, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 1, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 1, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 1, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 2, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 2, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 2, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 2, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 3, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 3, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 3, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 3, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 4, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 4, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 4, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 4, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 5, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 5, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 5, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 5, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 6, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 6, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 6, 0));
                placeStem(STEM, worldIn, mainmutable.add(0, 6, 1));
                placeStem(STEM, worldIn, mainmutable.add(-1, 7, 0));
                placeStem(STEM, worldIn, mainmutable.add(-1, 7, 1));
                placeStem(STEM, worldIn, mainmutable.add(0, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 5, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 5, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 6, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 6, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 6, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 6, 1));
                this.shroomLight(worldIn, mainmutable.add(-6, 7, 1));
                this.shroomLight(worldIn, mainmutable.add(-6, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 7, 4));
                this.shroomLight(worldIn, mainmutable.add(-3, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 7, 4));
                this.shroomLight(worldIn, mainmutable.add(-2, 7, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 7, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 7, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 7, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 7, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 7, 5));
                this.shroomLight(worldIn, mainmutable.add(1, 7, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 7, 4));
                this.shroomLight(worldIn, mainmutable.add(2, 7, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 7, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 7, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 7, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 7, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 7, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 7, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 7, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 7, 2));
                this.shroomLight(worldIn, mainmutable.add(5, 7, -1));
                this.shroomLight(worldIn, mainmutable.add(5, 7, 0));
                this.shroomLight(worldIn, mainmutable.add(-6, 8, 1));
                this.shroomLight(worldIn, mainmutable.add(-6, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 8, 4));
                this.shroomLight(worldIn, mainmutable.add(-3, 8, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 8, 5));
                this.shroomLight(worldIn, mainmutable.add(-2, 8, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 8, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 8, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 8, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 8, 5));
                this.shroomLight(worldIn, mainmutable.add(1, 8, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 8, 5));
                this.shroomLight(worldIn, mainmutable.add(2, 8, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 8, 3));
                this.shroomLight(worldIn, mainmutable.add(5, 8, -1));
                this.shroomLight(worldIn, mainmutable.add(5, 8, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-5, 9, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 9, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-4, 9, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-3, 9, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-2, 9, 5));
                this.shroomLight(worldIn, mainmutable.add(-2, 9, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(-1, 9, 5));
                this.shroomLight(worldIn, mainmutable.add(-1, 9, 6));
                this.shroomLight(worldIn, mainmutable.add(0, 9, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(0, 9, 5));
                this.shroomLight(worldIn, mainmutable.add(1, 9, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(1, 9, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(2, 9, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 9, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(3, 9, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.add(4, 9, 4));
                this.shroomLight(worldIn, mainmutable.add(-2, 10, 5));
                this.shroomLight(worldIn, mainmutable.add(-1, 10, 6));
                this.shroomLight(worldIn, mainmutable.add(0, 10, -4));
                this.shroomLight(worldIn, mainmutable.add(1, 10, -5));
            }
        }
        return true;
    }

    private void shroomLight(ISeedReader reader, BlockPos pos) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, Blocks.SHROOMLIGHT.getDefaultState());
        }
    }
}