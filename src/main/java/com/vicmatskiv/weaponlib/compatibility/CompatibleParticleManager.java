package com.vicmatskiv.weaponlib.compatibility;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;

import static com.vicmatskiv.mw.ModernWarfareMod.mc;

public class CompatibleParticleManager {
   
    private ParticleManager effectRenderer;

    public CompatibleParticleManager(WorldClient world) {
        this.effectRenderer = new ParticleManager(world, mc.getTextureManager());
    }
    
    public CompatibleParticleManager(ParticleManager effectRenderer) {
        this.effectRenderer = effectRenderer;
    }

    public ParticleManager getParticleManager() {
        return effectRenderer;
    }

}
