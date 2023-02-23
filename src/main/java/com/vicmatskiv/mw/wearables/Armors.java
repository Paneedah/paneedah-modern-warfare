package com.vicmatskiv.mw.wearables;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.CustomArmor.Builder;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Armors {
	
	// realistic armors
	
	public static Item JPNVG18helmet;
    
    // scp armors
    
    public static Item Dclasschest;
    public static Item Dclassboots;
    
    public static Item SCPGuardchest;
    public static Item SCPGuardboots;
    public static Item SCPGuardhelmet;
	
	// armors

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;
    
    public static Item Urbanchest;
    public static Item Urbanboots;
    public static Item Urbanhelmet;
    
    public static Item Blackcamochest;
    
    public static Item Forestchest;
    
    public static Item BlackJeansboots;
    public static Item KhakiJeansboots;
    
    public static Item Ghilliechest;
    public static Item Ghillieboots;
    public static Item Ghilliehelmet;
    
    public static CustomArmor GasMaskM40;
    
    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;
    
    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;
    
    public static Item Tacticalhelmet;
    
    public static Item SpecOpschest;
    public static Item SpecOpsboots;
    public static Item SpecOpshelmet;
    
    public static Item Juggernautchest;
    public static Item Juggernautboots;
    public static Item Juggernauthelmet;
    
    //public static Item Umbrellachest;
    //public static Item Umbrellaboots;
    //public static Item Umbrellahelmet;
    
    public static Item Astronautchest;
    public static Item Astronautboots;
    public static Item Astronauthelmet;
    
    public static Item NaziSantachest;
    public static Item NaziSantaboots;
    public static Item NaziSantahelmet;
    
    public static Item Santachest;
    public static Item Santaboots;
    public static Item Santahelmet;
    
    
    
    static ArmorMaterial Juggernaut = compatibility.addArmorMaterial(
    		"Juggernaut", "Juggernaut", 20, new int[] { 5, 6, 2, 5 }, 20, null, 0); // TODO: last
    
    static ArmorMaterial Marine = compatibility.addArmorMaterial(
    		"Marine", "Marine", 60, new int[] { 2, 3, 3, 3 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Clothing = compatibility.addArmorMaterial(
    		"Clothing", "Clothing", 33, new int[] { 0, 0, 0, 0 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Astronaut = compatibility.addArmorMaterial(
    		"Astronaut", "Astronaut", 33, new int[] { 1, 2, 2, 1 }, 15, null, 0); // TODO:

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, ModContext modContext) {
    	Builder marineArmorBuilder = new CustomArmor.Builder()
    			.withModId(ModernWarfareMod.MODID)
    			.withMaterial(Armors.Marine)
                .withUnlocalizedName("Marine")
                .withTextureName("USMC")
                .withModelClass("com.vicmatskiv.mw.models.USMC")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Marinehelmet = marineArmorBuilder.buildHelmet(modContext);
        Armors.Marinechest = marineArmorBuilder.buildChest(modContext.isClient());
        Armors.Marineboots = marineArmorBuilder.buildBoots(modContext.isClient());
        
        Builder specopsArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Spec_Ops")
                .withTextureName("militaryuniformblack")
                .withModelClass("com.vicmatskiv.mw.models.SpecOps")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SpecOpshelmet = specopsArmorBuilder.buildHelmet(modContext);
        Armors.SpecOpschest = specopsArmorBuilder.buildChest(modContext.isClient());
        Armors.SpecOpsboots = specopsArmorBuilder.buildBoots(modContext.isClient());
        
        Builder spetznazArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Spetznaz")
                .withTextureName("militaryuniformforest")
                .withModelClass("com.vicmatskiv.mw.models.USMC")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Spetznazhelmet = spetznazArmorBuilder.buildHelmet(modContext);
        Armors.Spetznazchest = spetznazArmorBuilder.buildChest(modContext.isClient());
        Armors.Spetznazboots = spetznazArmorBuilder.buildBoots(modContext.isClient());
        
        Builder urbanArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Urban")
                .withTextureName("militaryuniformurban")
                .withModelClass("com.vicmatskiv.mw.models.USMC")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Urbanhelmet = urbanArmorBuilder.buildHelmet(modContext);
        Armors.Urbanchest = urbanArmorBuilder.buildChest(modContext.isClient());
        Armors.Urbanboots = urbanArmorBuilder.buildBoots(modContext.isClient());
        
        Builder multicamoblackArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("blackcamo")
                .withTextureName("multicamoblackshirt")
                .withModelClass("com.vicmatskiv.mw.models.MultiCamoBlackShirt")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Blackcamochest = multicamoblackArmorBuilder.buildChest(modContext.isClient());
        
        Builder forestArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("forest")
                .withTextureName("militaryshirtforest")
                .withModelClass("com.vicmatskiv.mw.models.MultiCamoBlackShirt")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Forestchest = forestArmorBuilder.buildChest(modContext.isClient());
        
        Builder blackjeansArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("blackjeans")
                .withTextureName("blackjeans")
                .withModelClass("com.vicmatskiv.mw.models.Jeans")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.BlackJeansboots = blackjeansArmorBuilder.buildBoots(modContext.isClient());
        
        Builder khakijeansArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("khakijeans")
                .withTextureName("khakijeans")
                .withModelClass("com.vicmatskiv.mw.models.Jeans")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.KhakiJeansboots = khakijeansArmorBuilder.buildBoots(modContext.isClient());
        
        Builder santaArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Santa")
                .withTextureName("santasuit_normal")
                .withModelClass("com.vicmatskiv.mw.models.SantasuitNormal")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Santahelmet = santaArmorBuilder.buildHelmet(modContext);
        Armors.Santachest = santaArmorBuilder.buildChest(modContext.isClient());
        Armors.Santaboots = santaArmorBuilder.buildBoots(modContext.isClient());
        
        Builder nazisantaArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Nazisanta").withTextureName("santasuit_nazi")
                .withModelClass("com.vicmatskiv.mw.models.SantaSuit").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.NaziSantahelmet = nazisantaArmorBuilder.buildHelmet(modContext);
        Armors.NaziSantachest = nazisantaArmorBuilder.buildChest(modContext.isClient());
        Armors.NaziSantaboots = nazisantaArmorBuilder.buildBoots(modContext.isClient());
        
        Builder juggernautsuitArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Juggernaut)
                .withUnlocalizedName("Juggernaut").withTextureName("JuggernautSuit")
                .withModelClass("com.vicmatskiv.mw.models.JuggernautSuit").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Juggernauthelmet = juggernautsuitArmorBuilder.buildHelmet(modContext);
        Armors.Juggernautchest = juggernautsuitArmorBuilder.buildChest(modContext.isClient());
        Armors.Juggernautboots = juggernautsuitArmorBuilder.buildBoots(modContext.isClient());
        
        Builder ghillieArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("ghillie")
                .withTextureName("ghillie")
                .withModelClass("com.vicmatskiv.mw.models.Ghillie")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Ghilliehelmet = ghillieArmorBuilder.buildHelmet(modContext);
        Armors.Ghilliechest = ghillieArmorBuilder.buildChest(modContext.isClient());
        Armors.Ghillieboots = ghillieArmorBuilder.buildBoots(modContext.isClient());
        

        Builder swatArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Swat").withTextureName("Swat").withModelClass("com.vicmatskiv.mw.models.Swat")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Swathelmet = swatArmorBuilder.buildHelmet(modContext);
        Armors.Swatchest = swatArmorBuilder.buildChest(modContext.isClient());
        Armors.Swatboots = swatArmorBuilder.buildBoots(modContext.isClient());

        Builder tacticalArmorBuilder = new CustomArmor.Builder()
        		.withModId(ModernWarfareMod.MODID)
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Tactical")
                .withTextureName("Tactical")
                .withModelClass("com.vicmatskiv.mw.models.Tactical")
                .withHudTextureName("Marine")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Tacticalhelmet = tacticalArmorBuilder.buildHelmet(modContext);
        
        Builder jpnvg18ArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("JPNVG18").withTextureName("jpnvg18")
                .withModelClass("com.vicmatskiv.mw.models.JPNVG18").withHudTextureName("Marine")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.JPNVG18helmet = jpnvg18ArmorBuilder.buildHelmet(modContext);

        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("m40gasmask").withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.vicmatskiv.mw.models.M40GasMask").withHudTextureName("goggles_overlay")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.GasMaskM40 = gasSuitArmorBuilder.buildHelmet(modContext);
        
        Builder astronautArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Astronaut)
                .withUnlocalizedName("Astronaut").withTextureName("Astronaut")
                .withExposureReductionFactor(1f)
                .withModelClass("com.vicmatskiv.mw.models.Astronaut").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Astronauthelmet = astronautArmorBuilder.buildHelmet(modContext);
        Armors.Astronautchest = astronautArmorBuilder.buildChest(modContext.isClient());
        Armors.Astronautboots = astronautArmorBuilder.buildBoots(modContext.isClient()); 
        
        Builder dclassArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Clothing)
                .withUnlocalizedName("Dclass").withTextureName("dclass")
                .withModelClass("com.vicmatskiv.mw.models.Dclass").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Dclasschest = dclassArmorBuilder.buildChest(modContext.isClient());
        Armors.Dclassboots = dclassArmorBuilder.buildBoots(modContext.isClient()); 
        
        Builder SCPGuardArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("SCPGuard").withTextureName("scpguard")
                .withModelClass("com.vicmatskiv.mw.models.SCPGuard").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SCPGuardhelmet = SCPGuardArmorBuilder.buildHelmet(modContext); 
        Armors.SCPGuardchest = SCPGuardArmorBuilder.buildChest(modContext.isClient());
        Armors.SCPGuardboots = SCPGuardArmorBuilder.buildBoots(modContext.isClient()); 
        
    }
    

}
