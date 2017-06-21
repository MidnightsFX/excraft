package com.midnightsfx.exacompat.worldgen;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.worldgen.helper.genOreHelper;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import java.util.Random;

/**
 * Created by MidnightsFX on 6/21/17.
 */
public class worldgenRegister implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) { // the overworld
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        if (world.provider.getDimension() == -1) { // the nether
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        if (world.provider.getDimension() == 1) { // the end
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        // Enable/Disable worldgen for Darkore in configs
        if(commonProxy.config.exaDarkOreGen){
            // Gen darkOre, inWorld, RandomSeed, PosXtoGen(Chunksize * 16), PosZtoGen(Chunksize * 16), MinY, MaxY, oreClusterSize, TimesXChunk
            genOreHelper.generateOre(blockRegister.oreDark.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
        }

    }
}
