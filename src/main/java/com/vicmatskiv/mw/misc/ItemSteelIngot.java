package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

	public ItemSteelIngot() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelIngot"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "steelingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}