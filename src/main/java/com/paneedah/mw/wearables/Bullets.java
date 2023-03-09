package com.paneedah.mw.wearables;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.ores.Ores;
import com.paneedah.mw.utils.ModReference;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleItems;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import org.lwjgl.opengl.GL11;

public class Bullets {

    public static ItemBullet Bullet20x82mm;
    public static ItemBullet Bullet50BMG;
    public static ItemBullet Bullet408CT;
    public static ItemBullet Bullet308Winchester;
    public static ItemBullet Bullet8x58;
    public static ItemBullet Bullet792x57;
    public static ItemBullet Bullet792x33Kurz;
    public static ItemBullet Bullet3006Springfield;
    public static ItemBullet Bullet762x54;
    public static ItemBullet Bullet762x51;
    public static ItemBullet Shotgun12Guage;
    public static ItemBullet Shotgun4G;
    public static ItemBullet Bullet4570;
    public static ItemBullet Bullet4440;
    public static ItemBullet Bullet762x39;
    public static ItemBullet Bullet556x45;
    public static ItemBullet Bullet65;
    public static ItemBullet Bullet545x39;
    public static ItemBullet Bullet45ACP;
    public static ItemBullet Bullet357;
    public static ItemBullet Bullet40SW;
    public static ItemBullet Bullet44;
    public static ItemBullet Bullet50Beowulf;
    public static ItemBullet Bullet50AE;
    public static ItemBullet Bullet500;
    public static ItemBullet Bullet380ACP;
    public static ItemBullet Bullet10mm;
    public static ItemBullet Bullet763x25;
    public static ItemBullet Bullet762x35;
    public static ItemBullet Bullet765x21;
    public static ItemBullet Bullet9x39mm;
    public static ItemBullet Bullet9x19mm;
    public static ItemBullet Bullet9x18mm;
    public static ItemBullet Bullet57x28mm;
    public static ItemBullet Bullet46x30mm;
    public static ItemBullet Bullet473x33mm;
    public static ItemBullet Grenade40mm;
    public static ItemBullet RPGRocket;
    public static ItemBullet M202Rocket;
    public static ItemBullet EnergyCase;
    public static ItemBullet PlasmaCapsule;
    
//    public static ItemBullet Bullet9x18mm;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        Grenade40mm = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Grenade40mm").withMaxStackSize(64)
                .withModel(new com.paneedah.mw.models.GL06Grenade(), "GL06.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, 1F, 2.1F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2F, 2F, 2f);
                }).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        M202Rocket = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("m202rocket").withMaxStackSize(64)
                .withModel(new com.paneedah.mw.models.M202Rocket(), "gun.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Ores.GunmetalPlate, Ores.GunmetalIngot)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.8F, -0.2F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                }).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        RPGRocket = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("rpg7_rocket").withMaxStackSize(64)
                .withModel(new com.paneedah.mw.models.RPG7rocketPROJECTILE(), "rpg7.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Ores.GunmetalPlate, Ores.GunmetalIngot)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -1F, 0.5F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                }).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        EnergyCase = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("EnergyCase")
                .withModel(new com.paneedah.mw.models.EnergyCase(), "gun.png")
                //.withMaxStackSize(500)
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -1.1F, 0.6F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        PlasmaCapsule = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("PlasmaCapsule")
                .withModel(new com.paneedah.mw.models.ChainsawFuel(), "PlasmaCapsule.png")
                //.withMaxStackSize(500)
                //.withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet3006Springfield = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet3006Springfield")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletspringfield.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet8x58 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet8x58")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet8x58.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet792x33Kurz = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet792x33Kurz")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.35F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet50BMG = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet50BMG")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet20x82mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet20x82mm")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet20x82.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet408CT = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet408CT")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet308Winchester = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet308Winchester")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletspringfield.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet792x57 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet792x57")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet8x58.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x54 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet762x54")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet762x54.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x51 = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet762x51")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Shotgun12Guage = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Shotgun12Gauge")
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge(), "Shotgun12Gauge.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Shotgun4G = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Shotgun4G")
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge(), "Shotgun4Gauge.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x35 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet762x35")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet765x21 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet765x21")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.5F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.4F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.2F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x39 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet762x39")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet762x39.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.84F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet556x45 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet556x45")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet65 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet65")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet545x39 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet545x39")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bullet545x39.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.65F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.55F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.55F, 1.5f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet4570 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet4570")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.75F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.75F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet4440 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet4440")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
    
        Bullet45ACP = new ItemBullet.Builder()
        	.withModId(ModReference.id)
            .withCreativeTab(ModernWarfareMod.AmmoTab)
            .withName("Bullet45ACP")
            .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
            .withFirstPersonPositioning((player, itemStack) -> {
                GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                GL11.glRotatef(30F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            }).withThirdPersonPositioning((player, itemStack) -> {
                GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                GL11.glRotatef(-50F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            }).withInventoryPositioning((itemStack) -> {
                GL11.glTranslatef(-0.8F, -4F, 0.7F);
                GL11.glRotatef(10F, 0f, 1f, 0f);
                GL11.glRotatef(2F, 1f, 0f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(2.4F, 2.4F, 2.4f);
            })
            .withTextureName("Dummy.png")
            .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet357 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet357")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -2.1F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.45F, 0.85F, 0.45F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.35F, 0.75F, 0.35F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.0F, 2.8F, 2.0f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet44 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet44")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet40SW = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet40SW")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet50AE = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet50AE")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet50ae.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.8F, 3F, 2.8f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet50Beowulf = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet50Beowulf")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet500 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet500")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet380ACP = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet380ACP")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet763x25 = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet763x25")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                }).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet9x39mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet9x39mm")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet50ae.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet9x19mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet9x19mm")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet9x18mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet9x18mm")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bullet9x18.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet57x28mm = new ItemBullet.Builder().withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet57x28mm")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet46x30mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet46x30mm")
                .withModel(new com.paneedah.mw.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet10mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet10mm")
                .withModel(new com.paneedah.mw.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.8F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet473x33mm = new ItemBullet.Builder()
        		.withModId(ModReference.id)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet473x33mm")
                .withModel(new com.paneedah.mw.models.Bulletcaseless(), "bulletcaseless.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.0F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 2F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
    }

}
