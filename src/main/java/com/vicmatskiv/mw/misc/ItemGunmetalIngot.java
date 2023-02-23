package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemGunmetalIngot extends Item
{
	public ItemGunmetalIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalIngot"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}