package com.vicmatskiv.mw.items.guns;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.OSIPR;
import com.vicmatskiv.mw.models.OSIPRscopereticle;
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

public class OSIPRFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("osipr")
        .withAmmoCapacity(32)
        .withFireRate(0.7f)
        .withRecoil(1.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("osipr")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("osipr_reload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.07f)
        .withFlashOffsetY(() -> 0.16f)
        .withFlashTexture("pulserifle_flashes")
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle",
        "Damage: 8", 
        "Cartridge: 7.62x51mm (WIP, will change)",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 4f, // y
                 3f) // z
         
        .withCompatibleBullet(Bullets.Bullet762x51, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRAutoSpanker, true, (model) -> {
//            GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//            GL11.glRotatef(-70F, 0f, 1f, 0f);
//            GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRCell1, true, (model) -> {
//          GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//          GL11.glRotatef(-70F, 0f, 1f, 0f);
//          GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRCell2, true, (model) -> {
//          GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//          GL11.glRotatef(-70F, 0f, 1f, 0f);
//          GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRCellClaws, true, (model) -> {
//          GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//          GL11.glRotatef(-70F, 0f, 1f, 0f);
//          GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRCellFinger, true, (model) -> {
//          GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//          GL11.glRotatef(-70F, 0f, 1f, 0f);
//          GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.OSIPRHeatEscaper, true, (model) -> {
//          GL11.glTranslatef(-0.55F, 0.5F, 0.1F);
//          GL11.glRotatef(-70F, 0f, 1f, 0f);
//          GL11.glRotatef(-35F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.OSIPRMount, (model) -> {
//            GL11.glTranslatef(-0.2F, -1.32F, -6.5F);
//            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.OSIPRMiniScope, true, (player, stack) -> {
            GL11.glTranslatef(0.07F, -0.43F, 0.05F);
            GL11.glScaled(0.2F, 0.2F, 0.2F);
        },(model) -> {
            if(model instanceof FALIron) {
                GL11.glTranslatef(-0.35F, 0.89F, 0.25F);
                GL11.glScaled(0.05F, 0.6F, 0.2F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.OSIPRSight, (player, stack) -> {
            GL11.glTranslatef(0F, 0.05F, 0F);
//            GL11.glScaled(0.2F, 0.2F, 0.2F);
        },(model) -> {
            if(model instanceof OSIPRscopereticle) {
                GL11.glTranslatef(-0F, -0.465F, -0.3F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.OSIPRLaser, (p, s) -> {
//            GL11.glTranslatef(0.01F, -0.65F, -2.1F);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
//            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withTextureNames("osipr")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new OSIPR())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.3F, -1.4F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.225000f, -0.200000f, 0.30000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, -0.300000f, -0.150000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, -0.300000f, 0.150000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), (renderContext) -> {
//           	 GL11.glTranslatef(0.0f, 0.0f, -0.45f);
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCell1.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(-0.13f, -0.13f, 0f);
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCell2.getRenderablePart(), (renderContext) -> {
//         	 GL11.glTranslatef(-0.35f, 0.3f, 0.8f);
//         	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
            	
//            	GL11.glTranslatef(0f, 0f, 0.45f);
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCellClaws.getRenderablePart(), (renderContext) -> {
//            	 GL11.glTranslatef(2.2f, 0.0f, -0.8f);
//            	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRCellFinger.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(-0.2f, -0.08f, 0f);
//            	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), (renderContext) -> {
//          	 GL11.glTranslatef(0.1f, 0.0f, 0.0f);
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.0f, 0.0f, -0.6f);
            })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.0f, 0.0f, -0.6f);
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.1f, 0.0f, 0f);
            })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0.1f, 0.0f, 0f);
            })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                   }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                   }, 1, 0),
            
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                         GL11.glTranslatef(-0.225000f, -0.200000f, -0.050000f);
                    }, 200, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRAutoSpanker.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0f, 0.0f, -0.45f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0f, 0.0f, -0.2f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(0.0f, 0.0f, -0.2f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0f, 0.0f, -0.2f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0f, 0.0f, -0.45f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCell1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.13f, -0.13f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.34f, -0.14f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.34f, -0.14f, -0.3f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.34f, -0.14f, -0.44f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.34f, -0.14f, -0.44f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.1f, 0.23f, 0f);
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCell2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0f, 0.0f, 0.15f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glTranslatef(0.0f, 0.0f, 0.45f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glTranslatef(0.0f, 0.0f, 0.45f);
                   }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glTranslatef(-0.38f, 0.36f, 0.45f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.38f, 0.36f, 0.45f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.38f, 0.36f, 0.45f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.38f, 0.36f, 0.45f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCellClaws.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2.2f, 0.0f, -0.8f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRCellFinger.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.2f, -0.07f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.1f, 0.25f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.1f, 0.25f, 0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.1f, 0.25f, 0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.1f, 0.25f, 0f);
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.OSIPRHeatEscaper.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
            			GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1f, 0.0f, 0.0f);
                    }, 200, 100),
            
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 100)
            )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.3f, 0f, -0.7f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.150000f, 0.400000f, -0.350000f);
                  }, 350, 600)
                    )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                    	GL11.glRotatef(45F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, 0.100000f, 0.250000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                    	GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, 0.05000f, 0.250000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                    	GL11.glRotatef(25F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, -0.100000f, -00000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                    	GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, -0.200000f, -0.150000f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.225000f, -0.200000f, -0.00000f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
//                GL11.glRotatef(-8F, 0f, 0f, 1f);
                GL11.glTranslatef(0.14f, -0.07f, -0.2f);

               
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OSIPRSight)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
//                GL11.glRotatef(-8F, 0f, 0f, 1f);
                GL11.glTranslatef(0.14f, -0.07f, -0.15f);

               
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OSIPRSight)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 0.1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.2f, 0.2f, -0.2f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.3f, 0f, -0.7f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.3f, 0f, -0.7f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 0.075000f, 0.525000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    })
            
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 0.075000f, 0.525000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                        
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                        
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0)
                    )
                    
//            .withFirstPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 1000),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 1000),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 4f);
//                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.35f, -0.450000f, 0.150000f);
//                    }, 250, 0)
//                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 0.075000f, 0.525000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 0.075000f, 0.525000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.825000f, 0.275000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.550000f, 0.525000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(8f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

