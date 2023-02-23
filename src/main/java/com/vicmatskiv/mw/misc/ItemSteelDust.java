package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSteelDust extends Item {

	public ItemSteelDust() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelDust"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "steeldust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}