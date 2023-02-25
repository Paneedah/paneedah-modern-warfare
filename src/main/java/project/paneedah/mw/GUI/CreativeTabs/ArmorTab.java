package project.paneedah.mw.GUI.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

// Obvious what this is
public class ArmorTab extends CreativeTabs  {
    public ArmorTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon()  {
        return new ItemStack(Items.DIAMOND_CHESTPLATE);
    }
}
