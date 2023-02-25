package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemCarbonFiber extends Item {

    public ItemCarbonFiber() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CarbonFiber"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "carbonfiber");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
