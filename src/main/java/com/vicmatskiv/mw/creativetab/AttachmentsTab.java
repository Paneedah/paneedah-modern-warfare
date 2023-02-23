package com.paneedah.mw.creativetab;

import com.paneedah.mw.weapons.Attachments;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AttachmentsTab extends CreativeTabs
{
	public AttachmentsTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Attachments.ACOG);
	}

}
