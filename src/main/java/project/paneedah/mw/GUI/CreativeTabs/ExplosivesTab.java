package project.paneedah.mw.GUI.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;


//Explosives Tab
public class ExplosivesTab extends CreativeTabs  {
    public ExplosivesTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon()  {
        return new ItemStack(Blocks.TNT);
    }
}
