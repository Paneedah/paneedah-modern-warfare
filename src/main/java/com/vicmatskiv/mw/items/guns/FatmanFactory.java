package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Fatman;
import com.vicmatskiv.mw.models.MiniNuke;
import com.vicmatskiv.mw.weapons.Attachments;
import com.vicmatskiv.mw.weapons.AuxiliaryAttachments;
import com.vicmatskiv.mw.wearables.Bullets;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class FatmanFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("fatman")
//      .withAmmo(CommonProxy.AR15Mag)
        .withAmmoCapacity(1)
        .withFireRate(0.7f)
        .withRecoil(20f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("rpg7")
        .withReloadSound("rpg7_reload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.7f)
        .withFlashScale(() -> 2f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withDestroyingBlocks(false)
        
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, // x 
                1f, // y
                8f) // z
        
        .withInformationProvider(stack -> Arrays.asList("Type: Rocket Launcher", "Damage: 70", 
        "Cartridge: Mini-Nuke", "Fire Rate: Semi"))
        .withCompatibleAttachment(Bullets.MiniNuke, (model) -> {})
//        .withCompatibleAttachment(AuxiliaryAttachments.RPG7rocket, true, (model) -> {
//        })
        .withCompatibleAttachment(AuxiliaryAttachments.FatmanGrip, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 2f);
//            GL11.glRotatef(15F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FatmanRack, true, (model) -> {
//            GL11.glTranslatef(-0.45f, -0.45f, 0f);
//            GL11.glRotatef(35F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MiniNuke, true, (model) -> {
            GL11.glScaled(1.5F, 1.5F, 1.5F);
            GL11.glTranslatef(0f, -1f, -2.7f);
            GL11.glRotatef(90F, 1f, 0f, 0f);
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Fatman())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-3.5F, -6.5F, 3.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(8F, 0f, 0f, 1f);
//                GL11.glRotatef(-8F, 1f, 0f, 0f);
//                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
//                GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glTranslatef(-1.700000f, 1.000000f, 2.600000f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.03f, 0.8f, -1.6f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MiniNuke.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-1F, 0.3F, 10F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MiniNuke.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, -50F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                    }, 230, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-4F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.400000f, 2.000000f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.700000f, 2.100000f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                    }, 450, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(-8F, 1f, 0f, 0f);
                    GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                }, 320, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(-8F, 1f, 0f, 0f);
                    GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(-8F, 1f, 0f, 0f);
                    GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glTranslatef(-1.700000f, 1.700000f, 2.200000f);
                }, 310, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glRotatef(-4F, 1f, 0f, 0f);
                    GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glTranslatef(-1.700000f, 1.400000f, 2.000000f);
                }, 290, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(1F, 0f, 0f, 1f);
                    GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                }, 270, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FatmanGrip.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                    
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FatmanRack.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.45f, -0.45f, 0f);
                        GL11.glRotatef(35F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.45f, -0.5f, 0f);
                        GL11.glRotatef(55F, 0f, 0f, 1f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.45f, -0.5f, 0f);
                    GL11.glRotatef(55F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MiniNuke.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.45f, 5f, 8f);
                        GL11.glRotatef(35F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1f, 3f, 4f);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 6f, 4f);
                    GL11.glRotatef(45F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.5f, 6f, -2.5f);
                    GL11.glRotatef(45F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.5f, 1f, -2.5f);
                    GL11.glRotatef(40F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.6f, -1f, -2.5f);
                    GL11.glRotatef(35F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0f, -0f, -2.5f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0f, -0f, -2.5f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0f, -0f, -2.5f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.8f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.4f, -0.8f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                    }, 240, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.900000f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glTranslatef(-1.700000f, 1.000000f, 1.800000f);
                    }, 230, 0)
                    )
           
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.03f, 0.8f, -2f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glTranslatef(-1.700000f, 1.000000f, 1.600000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, 0.700000f, -1.3f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(6f, 6f, 6.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                         
//                         GL11.glScalef(6f, 6f, 6f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                     })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.75f, -0.175000f, 0.6f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, 0.300000f, -0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, 0.300000f, -0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.100000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.050000f, -0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.050000f, -0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.025000f, 0.200000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.000000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.100000f, -0.100000f);
                        
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, 0.300000f, -0.000000f);
                        
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, 0.250000f, 0.450000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.750000f, -1.050000f, 0.050000f);
                    }, 280, 0)
                    )
                    
            .build())
            .withSpawnEntityDamage(70f)
            .withSpawnEntitySpeed(5f)
            .withSpawnEntityExplosionRadius(14f)
            .withSpawnEntityGravityVelocity(0.3f)
//            .withExplosionParticleTexture("bfg-particles")
            .withSpawnEntityParticleAgeCoefficient(2F)
            .withSpawnEntityExplosionParticleScaleCoefficient(3F)
            .withSmokeParticleTexture("mini-nuke")
            .withSpawnEntitySmokeParticleAgeCoefficient(0.2F)
            .withSpawnEntitySmokeParticleScaleCoefficient(40F)
            .withSpawnEntityModel(new MiniNuke())
            .withSpawnEntityModelTexture("mininuke")
            .build(ModernWarfareMod.MOD_CONTEXT);
        }
    }
