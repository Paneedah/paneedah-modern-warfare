package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemLeadIngot extends Item {

    public ItemLeadIngot() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LeadIngot"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "leadingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}