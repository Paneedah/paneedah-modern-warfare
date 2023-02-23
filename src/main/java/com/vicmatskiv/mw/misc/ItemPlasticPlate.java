package com.vicmatskiv.mw.misc;

import com.vicmatskiv.mw.ModernWarfareMod;
import net.minecraft.item.Item;

public class ItemPlasticPlate extends Item {

    public ItemPlasticPlate() {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "PlasticPlate"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "plasticplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}