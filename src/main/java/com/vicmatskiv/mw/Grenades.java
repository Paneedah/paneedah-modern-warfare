package com.vicmatskiv.mw;

import com.vicmatskiv.mw.items.grenade.*;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;

public class Grenades {

    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;
    public static ItemGrenade GasGrenade;
    public static ItemGrenade FlashGrenade;
    
    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;


    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy commonProxy) {
        GrenadeSafetyPin = new AttachmentBuilder<ItemGrenade>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.Pin(), "gun.png").withName("GrenadeSafetyPin")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FuseGrenade = new FuseGrenadeFactory().createGrenade(commonProxy);
        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(commonProxy);
        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(commonProxy);
        GasGrenade = new GasGrenadeFactory().createGrenade(commonProxy);
        FlashGrenade = new FlashGrenadeFactory().createGrenade(commonProxy);
    }
}
