package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemGunmetalComposite extends Item {

    public ItemGunmetalComposite() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalComposite"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalcomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}