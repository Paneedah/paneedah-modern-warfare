package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSteelPlate extends Item {

	public ItemSteelPlate() {
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelPlate"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "SteelPlate");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}