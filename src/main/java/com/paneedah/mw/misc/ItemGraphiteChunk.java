package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemGraphiteChunk extends Item 
{
    public ItemGraphiteChunk()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GraphiteChunk"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "graphitechunk");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}
