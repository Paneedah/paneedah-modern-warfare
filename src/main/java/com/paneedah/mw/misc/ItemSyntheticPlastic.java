package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSyntheticPlastic extends Item
{
    public ItemSyntheticPlastic()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SyntheticPlastic"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "syntheticplastic");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}