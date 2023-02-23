package com.vicmatskiv.mw;

import com.vicmatskiv.mw.ores.Ores;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldGenerator;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.Random;

public class WorldGeneratorEventHandler extends CompatibleWorldGenerator {

    private ConfigurationManager configurationManager;

    public WorldGeneratorEventHandler(ConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch(world.provider.getDimension()) {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {}

    private void generateSurface(World world, Random random, int x, int z) {

        addOreSpawn(Ores.CopperOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("CopperOre").getSpawnsPerChunk(),
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 110);

        addOreSpawn(Ores.SulfurOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("SulfurOre").getSpawnsPerChunk(),
                random, x, z, 13, 13, 6 + random.nextInt(7), 5, 90);

//        addOreSpawn(Ores.LeadOre, CompatibleBlocks.STONE, world,
//                configurationManager.getOre("LeadOre").getSpawnsPerChunk(),
//                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
        
        addOreSpawn(Ores.TinOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("TinOre").getSpawnsPerChunk(),
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
        
//        addOreSpawn(Ores.GraphiteOre, CompatibleBlocks.STONE, world,
//                configurationManager.getOre("GraphiteOre").getSpawnsPerChunk(),
//                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);

    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    public void addOreSpawn(Block block, CompatibleBlocks target, World world, int chancesToSpawn,
            Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
            int minY, int maxY) {

        int diffBetweenMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBetweenMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);

            generate(block, maxVeinSize, target, world, random, posX, posY, posZ);
        }
    }
}
