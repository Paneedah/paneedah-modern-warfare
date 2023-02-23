package com.vicmatskiv.mw.creativetab;

import com.vicmatskiv.mw.Electronics;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GadgetsTab extends CreativeTabs
{
	public GadgetsTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Electronics.Tablet);
	}

}
