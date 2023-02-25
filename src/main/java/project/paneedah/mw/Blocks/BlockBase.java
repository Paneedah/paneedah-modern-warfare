package project.paneedah.mw.Blocks;

import project.paneedah.mw.ModernWar;
import project.paneedah.mw.Utils.IHasModel;
import project.paneedah.mw.init.ModBlocks;
import project.paneedah.mw.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ModernWar.ResourcesTab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ModernWar.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}