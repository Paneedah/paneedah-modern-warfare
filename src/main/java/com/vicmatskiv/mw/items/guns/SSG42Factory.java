package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.*;
import com.vicmatskiv.mw.models.SSG42;
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

public class SSG42Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("ssg42")
        .withAmmoCapacity(2)
        .withMaxBulletsPerReload(4)
        .withIteratedLoad()
        .withFireRate(0.3f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withPumpTimeout(500)
        .withShootSound("ssg42")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("mp43ereload")
        .withReloadIterationSound("load_shell")
        .withDrawSound("noaction_draw")
        .withAllReloadIterationsCompletedSound("mp43ereloadfin")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withInaccuracy(30)
        .withPellets(20)
        .withFlashIntensity(0.8f)
        .withFlashScale(() -> 1.3f)
        .withFlashOffsetX(() -> 0.11f)
        .withFlashOffsetY(() -> 0.15f)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Super Shotgun (MkII Demon Slayer)",
        "Damage per Pellet: 18",
        "Pellets per Shot: 20", 
        "Cartridge: 12 Gauge Shotgun Shell",
        "Fire Rate: SEMI",
        "Rate of Fire: 30/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                7f, // x 
                1f, // y
                13f) // z
        
        .withCompatibleAttachment(AuxiliaryAttachments.SSG42Barrels, true, (model) -> {
            GL11.glScalef(1f, 1f, 1f);
        })
        .withBleedingCoefficient(2F)
        .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
        .withTextureNames("ssg42")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new SSG42())
            //.withTextureName("Remington900")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.3F, -0.1F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(34F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.175000f, 0.35f, -1.125000f);
                GL11.glRotatef(2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(2F, 0f, 0f, 1f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.175000f, 0.275000f, -1.125000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(2F, 0f, 0f, 1f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.175000f, 0.275000f, -0.9f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.23f, -0.7f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 320, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
//                    GL11.glTranslatef(0f, 0f, 0f);
//                    GL11.glRotatef(10F, 1f, 0f, 0f);
//                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.SSG42Barrels.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
            )
                
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glRotatef(-2F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.275000f, -1.125000f);
                }, 200, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(38F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.4f, -1.125000f);
                    GL11.glRotatef(4F, 1f, 0f, 0f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(34F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.35f, -1.125000f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                }, 220, 0)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glRotatef(12F, 1f, 0f, 0f);
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glTranslatef(-0.175000f, 0.275000f, -1.125000f);
                    }, 160, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.4f, -1.125000f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 0f, 0f, 1f);
                    GL11.glRotatef(-7F, 1f, 0f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.4f, -1.125000f);
                }, 170, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(34F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.35f, -1.125000f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(34F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.35f, -1.125000f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                }, 160, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(32F, 0f, 1f, 0f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.4f, -1.125000f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                }, 190, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(31.5F, 0f, 1f, 0f);
                    GL11.glRotatef(6.5F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.43f, -1.125000f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(32F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.37f, -1.125000f);
                    GL11.glRotatef(4F, 1f, 0f, 0f);
                }, 160, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(34F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.175000f, 0.35f, -1.125000f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                }, 190, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.150000f, -0.950000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.375000f, 0.700000f, -0.825000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.7f, -1.4f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.5f, -1.4f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.4f, -1.4f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.45f, -1.4f);
                    }, 240, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.23f, -1f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 0.6f, -0.6f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.1f, -1.324999f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.575000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.3f, 2.3f, 2.3f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.3f, 2.3f, 2.3f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.3f, 2.3f, 2.3f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.575000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.3f, 2.3f, 2.3f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, 0.175000f, 0.450000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.600000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.500000f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.575000f, 0.400000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -1.025000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.825000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.825000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -1.025000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.3f, 2.3f, 2.3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.950000f, 0.250000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(18f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
