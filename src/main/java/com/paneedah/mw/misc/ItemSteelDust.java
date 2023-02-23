package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSteelDust extends Item
{
	public ItemSteelDust()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelDust"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "steeldust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}