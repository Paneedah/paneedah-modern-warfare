package project.paneedah.mw.GUI.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

//All 4 Vehicles
public class VehiclesTab extends CreativeTabs  {
    public VehiclesTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon()  {
        return new ItemStack(Blocks.RAIL);
    }
}
