package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBauxiteOre extends Block {
	
	public BlockBauxiteOre()
	{
		super(Material.ROCK);
		//setRegistryName(ModernWarfareMod.MODID + "_" + "BauxiteOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "BauxiteOre");
		setHardness(6F);
		setResistance(600000F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.BauxiteOre;
		}
		
	}