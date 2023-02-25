package project.paneedah.mw.Items.Resources;

import project.paneedah.mw.ModernWar;
import project.paneedah.mw.Utils.IHasModel;
import project.paneedah.mw.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ModernWar.ResourcesTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        ModernWar.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
