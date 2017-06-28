package com.midnightsfx.exacompat.worldgen.helper;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by MidnightsFX on 6/21/17.
 */
public class genOreHelper {

    // Generator an ore block
    // repeats CHANCE number of times
    public static void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        if (world.provider.getDimension() == 0) { // the overworld
            generation(ore, world, random, x, z, minY, deltaY, size, chances, Blocks.STONE);
        }
        if (world.provider.getDimension() == -1) { // the nether
            generation(ore, world, random, x, z, minY, deltaY, size, chances, Blocks.NETHERRACK);
        }
        if (world.provider.getDimension() == 1) { // the end
            generation(ore, world, random, x, z, minY, deltaY, size, chances, Blocks.END_STONE);
        }
    }

    private static void generation(IBlockState ore, World world, Random random, int x, int z, int minY, int deltaY, int size, int chances, Block block) {
        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
            generator.generate(world, random, pos);
        }
    }

}
