package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalIngot extends Item {

	public ItemGunmetalIngot() {
		setMaxStackSize(64);
		setUnlocalizedName(ModReference.MWC_ID + "_" + "GunmetalIngot");
//		setTextureName(ModReference.MWC_ID + ":" + "gunmetalingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
