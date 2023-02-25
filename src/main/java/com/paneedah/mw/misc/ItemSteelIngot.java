package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

	public ItemSteelIngot() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelIngot"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "steelingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}