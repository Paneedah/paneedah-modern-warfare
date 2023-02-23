package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {

    public ItemCopperIngot() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CopperIngot"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "copperingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
