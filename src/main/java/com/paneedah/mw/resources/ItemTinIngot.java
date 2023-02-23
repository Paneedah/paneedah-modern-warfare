package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {

	public ItemTinIngot() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TinIngot"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "TinIngot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}