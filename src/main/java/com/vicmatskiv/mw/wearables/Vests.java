package com.vicmatskiv.mw.wearables;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemVest;
import com.vicmatskiv.weaponlib.animation.Transform;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import net.minecraft.creativetab.CreativeTabs;
import org.lwjgl.opengl.GL11;

public class Vests {

    public static void preInit(Object mod, ConfigurationManager configurationManager,
            CompatibleFmlPreInitializationEvent event) {

    	new ItemVest.Builder()
        .withName("m43a_chest_harness")
        .withPercentDamageBlocked(0.4)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.M43AChestHarness", "m43achestharness.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
		        new Transform()
		        .withPosition(-0.15, -4, -0.25)
		        .withRotation(-15, 150, 0)
		        .withScale(3, 3, 3)
		        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
    	
        new ItemVest.Builder()
        .withName("flyye_field_compact_plate_carrier")
        .withPercentDamageBlocked(0.5)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.MollePlateCarrier", "molleplatecarrier.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.9, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("molle_black")
        .withPercentDamageBlocked(0.5)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.MollePlateCarrier", "molleplatecarrier_black.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.9, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("molle_green")
        .withPercentDamageBlocked(0.5)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.MollePlateCarrier", "molleplatecarrier_green.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.9, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("molle_urban")
        .withPercentDamageBlocked(0.5)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.MollePlateCarrier", "molleplatecarrier_urban.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.9, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("swat_vest")
        .withPercentDamageBlocked(0.6)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.UTG547Vest", "utg547vest.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.9, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("usmc_vest")
        .withPercentDamageBlocked(0.7)
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.USMCVest", "usmc.png")
//        .withModelTextureName("usmc.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.6, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(2.6, 2.6, 2.6)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("usmc_vest_black")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
        .withPercentDamageBlocked(0.7)
//        .withDurability(100) // works the same way as shield's max capacity
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.USMCVest", "usmcvestblack.png")
//        .withModelTextureName("usmc.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.6, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(2.6, 2.6, 2.6)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("usmc_vest_green")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
        .withPercentDamageBlocked(0.7)
//        .withDurability(100) // works the same way as shield's max capacity
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.USMCVest", "militaryuniformforest.png")
//        .withModelTextureName("usmc.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.6, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(2.6, 2.6, 2.6)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("usmc_vest_urban")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
        .withPercentDamageBlocked(0.7)
//        .withDurability(100) // works the same way as shield's max capacity
        .withTab(ModernWarfareMod.ArmorTab)
        .withProperModel("com.vicmatskiv.mw.models.USMCVest", "militaryuniformurban.png")
//        .withModelTextureName("usmc.png")
//        .withCustomEquippedPositioning((player, stack) -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.15, -3.6, -0.25)
	        .withRotation(-15, 150, 0)
	        .withScale(2.6, 2.6, 2.6)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("juggernaut_body_armor")
        .withDamageReduceAmount(25) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.Juggernautbodyarmor())
        .withModelTextureName("juggernautbodyarmor.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.1, -4, -0.25)
	        .withRotation(-15, 160, 5)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("fort_armor")
        .withDamageReduceAmount(25) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FortArmor())
        .withModelTextureName("fortarmor.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
	        new Transform()
	        .withPosition(-0.1, -4, -0.25)
	        .withRotation(-15, 160, 5)
	        .withScale(3, 3, 3)
	        .doGLDirect();
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
    
    

}
