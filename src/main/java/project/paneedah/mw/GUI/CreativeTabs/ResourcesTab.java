package project.paneedah.mw.GUI.CreativeTabs;

import project.paneedah.mw.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

//resources shit
public class ResourcesTab extends CreativeTabs  {
    public ResourcesTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon()  {
        return new ItemStack(ModItems.STEEL_INGOT);
    }
}
