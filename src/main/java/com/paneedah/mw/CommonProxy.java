package com.paneedah.mw;

import com.paneedah.mw.entities.Entities;
import com.paneedah.mw.items.melee.BaseballBatFactory;
import com.paneedah.mw.items.melee.BaseballBatNailsFactory;
import com.paneedah.mw.items.melee.NightStickFactory;
import com.paneedah.mw.items.melee.TacticalTomahawkFactory;
import com.paneedah.mw.ores.Ores;
import com.paneedah.mw.skins.GunSkins;
import com.paneedah.mw.skins.MeleeSkins;
import com.paneedah.mw.tileentities.TileEntities;
import com.paneedah.mw.vehicle.Vehicles;
import com.paneedah.mw.weapons.Attachments;
import com.paneedah.mw.weapons.AuxiliaryAttachments;
import com.paneedah.mw.weapons.Guns;
import com.paneedah.mw.weapons.Magazines;
import com.paneedah.mw.wearables.Armors;
import com.paneedah.mw.wearables.Backpacks;
import com.paneedah.mw.wearables.Bullets;
import com.paneedah.mw.wearables.Vests;
import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.animation.SpecialAttachments;
import com.paneedah.weaponlib.compatibility.CompatibleChannel;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleMaterial;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class CommonProxy {

//    public static Item ElectronicCircuitBoard;
//    public static Item OpticGlass;
//    public static Item Cloth;
//    public static Item TanCloth;
//    public static Item GreenCloth;
//    public static Item Inductor;
//    public static Item Transistor;
//    public static Item Resistor;
//    public static Item Diode;
//    public static Item Capacitor;
//    public static Item CopperWiring;
//    public static Item Piston;
//    public static Item LaserPointer;
//
//    public static Item AluminumPlate;
//
//    public static Item SteelPlate;
//    public static Item BigSteelPlate;
//    public static Item MiniSteelPlate;
//    public static Item MetalComponents;

//    public static Item Plastic;
    
//    public static Item Backpack;

    public ModelBiped getArmorModel(int id) {
        return null;
    }

    protected boolean isClient() {
        return false;
    }
    
    public void postInit(Object mod, ConfigurationManager configurationManager, FMLPostInitializationEvent event) {}

    public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {

        ModernWarfareMod.MOD_CONTEXT.preInit(mod, ModernWarfareMod.MODID, configurationManager, event, new CompatibleChannel(ModernWarfareMod.CHANNEL));

        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");
        
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("nightvision_on");
        
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("nightvision_off");

        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("firerate_toggle");

        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dry_fire");

        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");
        
        ModernWarfareMod.MOD_CONTEXT.setFlashExplosionSound("flashbang");
        
        
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("bullet_1_rock", 1f, CompatibleMaterial.WOOD);
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_2_rock", 1f, CompatibleMaterial.ROCK);
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("bullet_3_rock", 1f, CompatibleMaterial.ROCK, CompatibleMaterial.GROUND);
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_4_rock", 1f, CompatibleMaterial.ROCK);
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_5_grass", 1f, CompatibleMaterial.GRASS);

        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.ROCK, 1.5f, 
                "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.WOOD, 1.5f, 
                "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone", "bullet_10_snap");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GRASS, 1.5f, 
                "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GROUND, 1.5f, 
                "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SAND, 1.5f, 
                "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SNOW, 1.5f, 
                "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.IRON, 1.5f, 
                "bullet_6_iron", "bullet_7_iron", "bullet_8_iron");
        
//        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("sound-name", 1f, CompatibleMaterial.WATER, CompatibleMaterial.GROUND);
        
        
//        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("OpticZoom");
//        
//        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("OpticZoom");


        
//        Backpack = new ItemStorage.Builder()
//            .withName("Backpack")
//            .withSize(32)
//            //.withTextureName("knapsack")
//            .withTab(CreativeTabs.tabMisc)
//            .withModel(new TabletModel())
//            .withModelTextureName("IPad.png")
//            .withGuiTextureName("inventoryitem.png")
//            .withCustomEquippedPositioning((player, stack) -> {
//                GL11.glScalef(0.3f, 1f, 1f);
//                GL11.glTranslatef(0f, 0f, 0.3f);
//            })
//            .build(ModernWarfareMod.MOD_CONTEXT);

//        compatibility.registerItem(ModernWarfareMod.MODID, ElectronicCircuitBoard, "Electronics");
//        compatibility.registerItem(ModernWarfareMod.MODID, OpticGlass, "OpticGlass");
//        compatibility.registerItem(ModernWarfareMod.MODID, Cloth, "Cloth");
//        compatibility.registerItem(ModernWarfareMod.MODID, TanCloth, "TanCloth");
//        compatibility.registerItem(ModernWarfareMod.MODID, GreenCloth, "GreenCloth");
//        compatibility.registerItem(ModernWarfareMod.MODID, AluminumPlate, "AluminumPlate");
//        compatibility.registerItem(ModernWarfareMod.MODID, SteelPlate, "SteelPlate");
//        compatibility.registerItem(ModernWarfareMod.MODID, BigSteelPlate, "BigSteelPlate");
//        compatibility.registerItem(ModernWarfareMod.MODID, MiniSteelPlate, "MiniSteelPlate");
//        compatibility.registerItem(ModernWarfareMod.MODID, MetalComponents, "MetalComponents");
//        compatibility.registerItem(ModernWarfareMod.MODID, Transistor, "Transistor");
//        compatibility.registerItem(ModernWarfareMod.MODID, Resistor, "Resistor");
//        compatibility.registerItem(ModernWarfareMod.MODID, Inductor, "Inductor");
//        compatibility.registerItem(ModernWarfareMod.MODID, Diode, "Diode");
//        compatibility.registerItem(ModernWarfareMod.MODID, Capacitor, "Capacitor");
//        compatibility.registerItem(ModernWarfareMod.MODID, CopperWiring, "CopperWiring");
//        compatibility.registerItem(ModernWarfareMod.MODID, Piston, "Piston");
//        compatibility.registerItem(ModernWarfareMod.MODID, LaserPointer, "LaserPointer");
//        compatibility.registerItem(ModernWarfareMod.MODID, Plastic, "plastic");
        
        
        
        
        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(ModernWarfareMod.MOD_CONTEXT);
        
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        SpecialAttachments.init(mod, configurationManager, event, ModernWarfareMod.MOD_CONTEXT);
        
        Backpacks.preInit(mod, configurationManager, event);
        Vests.preInit(mod, configurationManager, event);
        Ores.init();
        Armors.init(mod, configurationManager, event, ModernWarfareMod.MOD_CONTEXT);
        Attachments.init(mod, configurationManager, event);
        AuxiliaryAttachments.init(mod, configurationManager, event);
        GunSkins.init(mod, configurationManager, event);
        MeleeSkins.init(mod, configurationManager, event);
        Bullets.init(mod, configurationManager, event);
        Magazines.init(mod, configurationManager, event);
        Guns.init(mod, configurationManager, event, this);
        com.paneedah.mw.Electronics.init(mod, configurationManager, event);
        Grenades.init(mod, configurationManager, event, this);
        CustomSpawnEggs.init(mod, configurationManager, event, this);
        
        new TacticalTomahawkFactory().createMelee(this);
        
        new BaseballBatFactory().createMelee(this);
        
        new BaseballBatNailsFactory().createMelee(this);
        
        new NightStickFactory().createMelee(this);
        
        TileEntities.init(this);
        
        ModernWarfareMod.MOD_CONTEXT.preInitEnd(mod, ModernWarfareMod.MODID, configurationManager, event, ModernWarfareMod.MOD_CONTEXT.getChannel());
        
       
        
        
    }

    public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.MODID);
        
        Entities.init(this);
        
        Vehicles.init(this);
        
        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);
    }

}
