package project.paneedah.mw.GUI.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class DecorationsTab extends CreativeTabs  {
    public DecorationsTab(int par1, String label) {
        super(par1, label);
    }

    //Props
    @Override
    public ItemStack createIcon()  {
        return new ItemStack(Blocks.STONE);
    }
}
