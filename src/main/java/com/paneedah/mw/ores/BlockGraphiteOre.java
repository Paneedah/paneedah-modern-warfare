package com.paneedah.mw.ores;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGraphiteOre extends Block {
    
    public BlockGraphiteOre() {
        super(Material.ROCK);

        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GraphiteOre");
        //setBlockTextureName(ModernWarfareMod.MODID + ":" + "graphiteore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Ores.GraphiteChunk;
    }
}
