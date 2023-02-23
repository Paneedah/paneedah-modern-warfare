package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemSyntheticPolymerComposite extends Item {

    public ItemSyntheticPolymerComposite() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SyntheticPolymerComposite"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "syntheticpolymercomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}