package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemVestRender extends Item {

    public ItemVestRender() {
        setMaxStackSize(1);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "vestrender"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "syntheticplastic");
//        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}