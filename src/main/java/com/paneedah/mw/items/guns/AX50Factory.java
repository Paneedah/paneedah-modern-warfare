package com.paneedah.mw.items.guns;

import com.paneedah.mw.CommonProxy;
import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.models.*;
import com.paneedah.mw.weapons.Attachments;
import com.paneedah.mw.weapons.AuxiliaryAttachments;
import com.paneedah.mw.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class AX50Factory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("ax50")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("ax50_boltaction")
        .withRecoil(15f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("ax50")
        .withPumpTimeout(1100)
        .withSilencedShootSound("snipersilencer")
        .withReloadSound("ax50_reload")
        .withUnloadSound("ax50_unload")
        .withInspectSound("inspection")
        .withDrawSound("ax50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Anti-Materiel Sniper Rifle",
        "Damage: 25", 
        "Cartridge: .50 BMG",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "5rnd .50 BMG AX-50 Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 7f, // x 
                 2f, // y
                 16f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.SCOPE)
        .withCompatibleAttachment(Magazines.AX50Mag, (model) -> {
//        	GL11.glTranslatef(0f, 3f, 3f);
//        	GL11.glRotatef(15f, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AX50BoltAction1, true, (model) -> {
//            GL11.glTranslatef(-1.05f, -0.41f, 0f);
//            GL11.glRotatef(55f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AX50BoltAction2, true, (model) -> {
//          GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
//          GL11.glRotatef(70f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.G95IronSights, true, (model) -> {
            if(model instanceof G95_rearsights) {
                GL11.glTranslatef(-0.155F, -1.82F, -0.9F);
                GL11.glScaled(0.29F, 0.29F, 0.29F);
            } else if(model instanceof G95_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.82F, -7.5F);
                GL11.glScaled(0.29F, 0.29F, 0.29F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.205F, -1.6F, -8.1f);
                GL11.glScaled(0.6F, 0.6F, 1.55F);
          } else if(model instanceof AKRail2) {
        	  GL11.glTranslatef(-0.205F, -1.63F, -3.65f);
              GL11.glScaled(0.6F, 0.6F, 1.25F);
          } else if(model instanceof AKRail3) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail4) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail5) {
              GL11.glScaled(0F, 0F, 0F);
          }
        })
        .withCompatibleAttachment(Attachments.AX50Scope, true, (player, stack) -> {
            GL11.glTranslatef(-0.16F, -1.83F, -1F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.084F, -0.13F, 1.296F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withTextureNames("ax50")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new AX50())
            //.withTextureName("AWP")
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
                GL11.glScaled(0.42F, 0.42F, 0.42F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                GL11.glTranslatef(0.100000f, 2.550000f, 2.200000f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
//                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(4f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.200000f, 1.34f, 0.075000f);
                
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.250000f, 1.42f, 0.075000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
//            	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(4f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.200000f, 1.34f, 1.175000f);
//                GL11.glRotatef(-4f, 1f, 0f, 0f);
                
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.250000f, 1.42f, 1.175000f);
                GL11.glRotatef(-4f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.4f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.2f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(), (renderContext) -> {
            })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, -0.125000f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, -0.085000f);
                    }, 130, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.375000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.395000f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.375000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.075000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.025000f);
                    }, 100, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.335f, 1.65f, 0.1f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(3F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.335f, 1.65f, 0.1f);
                    }, 130, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.305f, 1.65f, 0.2f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.305f, 1.65f, 0.15f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.305f, 1.65f, 0.13f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.335f, 1.65f, 0.1f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.335f, 1.65f, 0.1f);
                    }, 100, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.05f, -0.41f, 0f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 0f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.05f, -0.41f, 0f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 0f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.05f, -0.41f, 0f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.05f, -0.41f, 0f);
                          GL11.glRotatef(55f, 0f, 0f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                          GL11.glTranslatef(0f, 0f, 1.5f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
                
             .withFirstPersonPositioningReloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-64.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                     }, 400, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-64.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                    }, 200, 130),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-69.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, -0.125000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, -0.085000f);
                    }, 130, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.375000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.395000f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.375000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.075000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.275000f, 0.025000f);
                    }, 100, 0)
                    
                    )
                    
            .withFirstPersonPositioningUnloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                     }, 210, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.800000f, 0.950000f, 0.530000f);
                     }, 120, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-64.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.800000f, 0.950000f, 0.520000f);
                     }, 170, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-63.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.800000f, 0.950000f, 0.500000f);
                     }, 150, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.AX50Mag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 3f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 2f, 0.8f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 1.2f, -0.4f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.AX50Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 1.2f, -0.4f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 2f, 0.8f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 3f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 1f, 0f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.7f, 0f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, 0.2F, 3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(95F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 370, 50),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 200, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 140, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 270, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 240, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 500, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-2.5F, 0F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 280, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 220, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, 0.2F, 3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 160, 0))
            
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 0f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.475000f, 0.375000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.475000f, 0.375000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.475000f, 0.075000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 1.475000f, -0.125000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    	GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.42f, -0.235000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(44.5F, 0f, 1f, 0f);
                        GL11.glRotatef(7f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.42f, 0.1500f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.42f, 0.035000f);
                    }, 100, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AX50BoltAction1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-1.05f, -0.41f, 1.5f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-1.05f, -0.41f, 0f);
                        GL11.glRotatef(55f, 0f, 0f, 1f);

                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AX50BoltAction2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, -0f, 1.5f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0f, -0f, 1.5f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position

                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.345f, 1.35f, 0.5f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.65f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.345f, 1.35f, 0.6f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
            	GL11.glRotatef(15.000000f, 1f, 0f, 0f);
            	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
            	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.100000f, 1.600000f, 0.500000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.5f, 0.5f, -0.5f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
            	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.5f, 0.5f, -0.5f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    	 
//                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    	 
//                    	 GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.500000f, -0.450000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.500000f, -0.450000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    })
            
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.050000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -0.125000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.300000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
	                   	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.100000f, -0.275000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
	                   	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.100000f, -0.275000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.325000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.110000f, -0.350000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.235000f, -0.245000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
	                   	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.100000f, -0.275000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.300000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -0.125000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.050000f, -0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.325000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.110000f, -0.350000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.235000f, -0.245000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200))
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.325000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.110000f, -0.350000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.235000f, -0.245000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
	                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.525000f, -0.050000f, 0.115000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.650000f, 0.100000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.380000f, -0.580000f, -0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.235000f, -0.245000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.295000f, -0.355000f, 0.005000f);
                    }, 50, 200))
                    
            .build())
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
