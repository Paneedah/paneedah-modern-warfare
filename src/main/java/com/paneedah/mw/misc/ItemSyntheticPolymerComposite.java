package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSyntheticPolymerComposite extends Item {

    public ItemSyntheticPolymerComposite() {
        setMaxStackSize(64);
        setUnlocalizedName(ModReference.MWC_ID + "_" + "SyntheticPolymerComposite");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticpolymercomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
