package com.vicmatskiv.mw.ores;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.misc.*;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.items.CraftingItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Ores {

    public static final String DUST_SULFUR = "dustSulfur";
    public static final String INGOT_STEEL = "ingotSteel";
    public static final String INGOT_COPPER = "ingotCopper";
    public static final String INGOT_TIN = "ingotTin";
    public static final String INGOT_LEAD = "ingotLead";

//    public static Block LeadOre;
//    public static Item LeadIngot;
    
    public static Block CopperOre;
    public static Item CopperIngot;

//    public static Block GraphiteOre;
    public static Item GraphiteChunk;
    
    public static Block TinOre;
    public static Item TinIngot;
    
    public static Block SulfurOre;
    public static Item SulfurDust;
    
    public static Item GunmetalComposite;
    public static Item GunmetalIngot;
    public static Item GunmetalPlate;
    
    public static Item SteelDust;
    public static CraftingItem SteelIngot;
    
    public static Item CarbonComposite;
    public static Item CarbonFiber;
    public static Item SyntheticPolymerComposite;
    public static Item SyntheticPlastic;
    
    public static Item VestRender;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {


//        LeadOre = new BlockLeadOre();
//        LeadIngot = new ItemLeadIngot();

        CopperOre = new BlockCopperOre();
        CopperIngot = new ItemCopperIngot();
        
//        GraphiteOre = new BlockGraphiteOre();
        GraphiteChunk = new ItemGraphiteChunk();

        TinOre = new BlockTinOre();
        TinIngot = new ItemTinIngot();

        SulfurOre = new BlockSulfurOre();
        SulfurDust = new ItemSulfurDust();

        SteelDust = new ItemSteelDust();
//        SteelIngot = new ItemSteelIngot();
        SteelIngot = new CraftingItem("SteelIngot", ModernWarfareMod.MODID, Ores.SteelIngot, 0.3, ModernWarfareMod.BlocksTab);
        
        GunmetalComposite = new ItemGunmetalComposite();
//        GunmetalIngot = new ItemGunmetalIngot();
        GunmetalIngot = new CraftingItem("GunmetalIngot", ModernWarfareMod.MODID, Ores.GunmetalIngot, 0.3, ModernWarfareMod.BlocksTab);
//        GunmetalPlate = new ItemGunmetalPlate();
        GunmetalPlate = new CraftingItem("GunmetalPlate", ModernWarfareMod.MODID, Ores.GunmetalPlate, 0.3, ModernWarfareMod.BlocksTab);
        
//        CarbonComposite = new ItemCarbonComposite();
        CarbonComposite = new CraftingItem("CarbonComposite", ModernWarfareMod.MODID, Ores.CarbonComposite, 0.3, ModernWarfareMod.BlocksTab);
        CarbonFiber = new ItemCarbonFiber();
        SyntheticPolymerComposite = new ItemSyntheticPolymerComposite();
        SyntheticPlastic = new ItemSyntheticPlastic();
        
        VestRender = new ItemVestRender();
        
//        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, LeadOre, "LeadOre");
//        compatibility.registerItem(ModernWarfareMod.MODID, LeadIngot, "leadingot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, CopperOre, "CopperOre");
        compatibility.registerItem(ModernWarfareMod.MODID, CopperIngot, "CopperIngot");
        
//        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, GraphiteOre, "GraphiteOre");
        compatibility.registerItem(ModernWarfareMod.MODID, GraphiteChunk, "GraphiteChunk");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, TinOre, "TinOre");
        compatibility.registerItem(ModernWarfareMod.MODID, TinIngot, "TinIngot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, SulfurOre, "SulfurOre");
        compatibility.registerItem(ModernWarfareMod.MODID, SulfurDust, "SulfureDust");

        compatibility.registerItem(ModernWarfareMod.MODID, SteelDust, "SteelDust");
        compatibility.registerItem(ModernWarfareMod.MODID, SteelIngot, "SteelIngot");
        
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalIngot, "GunmetalIngot");
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalPlate, "GunmetalPlate");
        compatibility.registerItem(ModernWarfareMod.MODID, GunmetalComposite, "GunmetalComposite");
        
        compatibility.registerItem(ModernWarfareMod.MODID, CarbonComposite, "CarbonComposite");
        compatibility.registerItem(ModernWarfareMod.MODID, CarbonFiber, "CarbonFiber");
        compatibility.registerItem(ModernWarfareMod.MODID, SyntheticPolymerComposite, "SyntheticPolymerComposite");
        compatibility.registerItem(ModernWarfareMod.MODID, SyntheticPlastic, "SyntheticPlastic");
        
        compatibility.registerItem(ModernWarfareMod.MODID, VestRender, "vestrender");


//        OreDictionary.registerOre(INGOT_LEAD, LeadIngot);
        OreDictionary.registerOre(INGOT_COPPER, CopperIngot);
        OreDictionary.registerOre(INGOT_TIN, TinIngot);
        OreDictionary.registerOre(DUST_SULFUR, SulfurDust);
        OreDictionary.registerOre(INGOT_STEEL, SteelIngot);
    }

}
