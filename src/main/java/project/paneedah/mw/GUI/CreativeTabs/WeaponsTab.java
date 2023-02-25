package project.paneedah.mw.GUI.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

//Weapons Tab
public class WeaponsTab extends CreativeTabs  {
    public WeaponsTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon()  {
        return new ItemStack(Items.GOLDEN_SWORD);
    }
}
