package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemGraphiteChunk extends Item {

    public ItemGraphiteChunk() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GraphiteChunk"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "graphitechunk");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
