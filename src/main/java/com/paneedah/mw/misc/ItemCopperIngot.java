package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item 
{
    public ItemCopperIngot()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CopperIngot"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "copperingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}
