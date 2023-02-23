package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.*;
import com.vicmatskiv.mw.models.*;
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

public class P10mmFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("p10")
        .withFireRate(0.5f)
        .withAmmoCapacity(10)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("p10")
        .withSilencedShootSound("m9a1_silenced")
        .withReloadSound("m9a1_reload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.17f)
        .withFlashOffsetY(() -> 0.18f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Military Service Pistol", 
        "Damage: 5.4", 
        "Cartridge: 10mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 50/100"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 4f, // x 
                 1f, // y
                 3f) // z
         
        .withCompatibleBullet(Bullets.Bullet10mm, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.P10Slide, true, (model) -> {
            if(model instanceof P10mmSlide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof makarovrearsight) {
                GL11.glTranslatef(0F, -0.32F, -0.19F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(0.01F, -0.3F, -1.9F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.P10frontsight, true, (model) -> {
            if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(0.01F, -0.3F, -1.9F);
                GL11.glScaled(0.2F, 0.3F, 0.3F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.P10Mag, true, (model) -> {
            
//            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//            GL11.glTranslatef(0F, 1F, 0.4F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.4F, -1F, -2.2F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.08F, -0.3F, -4.6F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                GL11.glTranslatef(-0.02F, -0.4F, -0.4F);
                GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withTextureNames("p10")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new P10mm())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.3F, -1.2F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, -0.2f, -2.1f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, -0.2f, -1.9f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.6f, -0.4f, -2.1f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.6f, -0.4f, -1.9f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.P10Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.P10Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.P10Mag.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.P10Mag.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.P10Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.45F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.45F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonCustomPositioning(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1.45F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.075000f, -0.175000f, -1.649999f);
                    }, 70, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(Attachments.RMR.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1.45F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.P10Mag.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, -0.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.8F, -0.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.8F, -0.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.5F, 0F, -0.2F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0.5F, 0F, -0.2F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                      }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.P10Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.6f, -0.2f, -1f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.7f, 0f, -1.2f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-2.2F, -0.7F, 2.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.P10Mag.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 2.3F, -0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(2F, 4F, 0.2F);
                        GL11.glRotatef(-40F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(2F, 4F, 0.2F);
                        GL11.glRotatef(-40F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 2.3F, -0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0.5F, 0F, -0.2F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                      }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000)
                        )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.P10Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 0.7f, -2.1f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 0.4f, -2.1f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 0.05f, -2.1f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-9F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 0.15f, -2.05f);
                    }, 130, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.5f, 0.08f, -2.1f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.P10Slide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.19f, -0.21f, -2.2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.1f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.2f, -0.2f, -2f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.1f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -1.000000f, -1.150000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.5f, 0f, -1.5f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                       GL11.glScalef(5f, 5f, 5f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                   }, 
                   (renderContext) -> {
                       GL11.glScalef(5f, 5f, 5f);
                       GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                   })
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    })
            .withFirstPersonHandPositioningRunning(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.125000f, 0.7f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.950000f, 0.150000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -1.025000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -1.075000f, 0.200000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -1.075000f, 0.200000f);
                        
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -1.025000f, 0.150000f);
                        
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.950000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.950000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.950000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.975000f, 0.125000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -0.775000f, 0.200000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -0.800000f, 0.100000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -0.775000f, 0.200000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.560000f, 0.390000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5.4f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
