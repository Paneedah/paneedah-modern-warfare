package com.paneedah.mw;

import com.paneedah.mw.models.Workbench;
import com.paneedah.mw.ores.Ores;
import com.paneedah.mw.wearables.Armors;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.crafting.ammopress.TESRAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.model.AmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TESRWorkbench;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import com.paneedah.weaponlib.inventory.StandardPlayerInventoryTab;
import com.paneedah.weaponlib.render.CustomArmorLayer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import static com.paneedah.mw.ModernWarfareMod.mc;

public class ClientProxy extends CommonProxy {

	@Override
	protected boolean isClient() {
		return true;
	}

	@Override
	public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
		super.preInit(mod, configurationManager, event);
		
        InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(ModernWarfareMod.MOD_CONTEXT, Ores.VestRender));
        inventoryTabs.registerTab(new BackpackInventoryTab(ModernWarfareMod.MOD_CONTEXT));
		
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation("mw:textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation("mw:textures/blocks/ammo_press.png")));
	}
	
	@Override
	public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
	    super.init(mod, configurationManager, event);
	    
	    PlayerAnimations.init(mod, null, event);
	    
        mc.getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.CopperOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperore", "inventory"));

        mc.getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.SulfurOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurore", "inventory"));

        mc.getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.TinOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tinore", "inventory"));

        /*
        mc.getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.LeadOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadore", "inventory"));

        mc.getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.GraphiteOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "graphiteore", "inventory"));
         */

        RenderItem renderItem = mc.getRenderItem();

        renderItem.getItemModelMesher().register(Ores.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SteelDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steeldust", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SteelIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steelingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SulfurDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurdust", "inventory"));
        renderItem.getItemModelMesher().register(Ores.TinIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tiningot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GraphiteChunk, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "graphitechunk", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalplate", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalcomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.CarbonComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "carboncomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.CarbonFiber, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "carbonfiber", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SyntheticPolymerComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "syntheticpolymercomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SyntheticPlastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "syntheticplastic", "inventory"));
        
        renderItem.getItemModelMesher().register(Ores.VestRender, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "vestrender", "inventory"));
        
        //renderItem.getItemModelMesher().register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "akmiron", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Dclassboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "dclass_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Dclasschest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "dclass_chest", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.SCPGuardboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SCPGuardchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "scpguard_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SCPGuardhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "scpguard_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Marineboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Marinechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Urbanboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "urban_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Urbanchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "urban_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "urban_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ghillie_helmet", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Ghilliechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ghillie_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Ghillieboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ghillie_boots", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Blackcamochest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "blackcamo_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Forestchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "forest_chest", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "blackjeans_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "khakijeans_boots", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Swatboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Swatchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Swathelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Santaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Santachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Santahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Astronautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Astronautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Astronauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "jpnvg18_helmet", "inventory"));
            
        renderItem.getItemModelMesher().register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "m40gasmask_helmet", "inventory"));

	}
	
	@Override
	public void postInit(Object mod, ConfigurationManager configurationManager, FMLPostInitializationEvent event) {
	    mc.getRenderManager().getSkinMap().forEach((p, r) -> r.addLayer(new CustomArmorLayer(r)));
	}
}
