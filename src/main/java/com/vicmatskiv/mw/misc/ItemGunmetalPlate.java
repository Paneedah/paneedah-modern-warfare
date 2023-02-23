package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemGunmetalPlate extends Item {

    public ItemGunmetalPlate() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalPlate"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}