package com.midnightsfx.exacompat.worldgen;

import com.midnightsfx.exacompat.blocks.blockRegister;
import com.midnightsfx.exacompat.proxy.commonProxy;
import com.midnightsfx.exacompat.worldgen.helper.genOreHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

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

        // Enable/Disable worldgen for Nether Vanilla in configs
        if(commonProxy.config.exaNetherVanillaOreGen){
            // Gen ore, inWorld, RandomSeed, PosXtoGen(Chunksize * 16), PosZtoGen(Chunksize * 16), MinY, MaxY, oreClusterSize, TimesXChunk
            genOreHelper.generateOre(blockRegister.oreNetherCoal.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherVanillaClustersCoal);
            genOreHelper.generateOre(blockRegister.oreNetherIron.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherVanillaClustersIron);
            genOreHelper.generateOre(blockRegister.oreNetherGold.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherVanillaClustersGold);
            genOreHelper.generateOre(blockRegister.oreNetherLapis.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherVanillaClustersLapis);
            genOreHelper.generateOre(blockRegister.oreNetherRedstone.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherVanillaClustersRedstone);
            genOreHelper.generateOre(blockRegister.oreNetherDiamond.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(2), commonProxy.config.exaNetherVanillaClustersDiamond);
            genOreHelper.generateOre(blockRegister.oreNetherEmerald.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherVanillaOreGenAmount + random.nextInt(2), commonProxy.config.exaNetherVanillaClustersEmerald);
        }
        // Enable/Disable worldgen for Nether Thermal in configs
        if(commonProxy.config.exaNetherThermalOreGen){
            genOreHelper.generateOre(blockRegister.oreNetherCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherThermalOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherThermalClustersCopper);
            genOreHelper.generateOre(blockRegister.oreNetherLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherThermalOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherThermalClustersLead);
            genOreHelper.generateOre(blockRegister.oreNetherSilver.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherThermalOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherThermalClustersSilver);
            genOreHelper.generateOre(blockRegister.oreNetherTin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherThermalOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherThermalClustersTin);
            genOreHelper.generateOre(blockRegister.oreNetherLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, commonProxy.config.exaNetherThermalOreGenAmount + random.nextInt(4), commonProxy.config.exaNetherThermalClustersLead);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    }
}
