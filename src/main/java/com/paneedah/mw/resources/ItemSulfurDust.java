package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSulfurDust extends Item {

	public ItemSulfurDust() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SulfurDust"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "SulfurDust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}