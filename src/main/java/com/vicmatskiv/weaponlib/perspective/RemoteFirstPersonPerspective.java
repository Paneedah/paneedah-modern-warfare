package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.RenderingPhase;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatiblePlayerCreatureWrapper;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.vicmatskiv.mw.ModernWarfareMod.mc;
import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public abstract class RemoteFirstPersonPerspective extends Perspective<RenderableState> {

    @SuppressWarnings("unused")
    private static final Logger logger = LogManager.getLogger(RemoteFirstPersonPerspective.class);

    private long renderEndNanoTime;

    protected CompatiblePlayerCreatureWrapper watchablePlayer;

    public RemoteFirstPersonPerspective() {
        this.renderEndNanoTime = System.nanoTime();
        this.width = 427; //mc.displayWidth >> 1;
        this.height = 240; //mc.displayHeight >> 1;
        WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
        this.watchablePlayer = new CompatiblePlayerCreatureWrapper(mc, world);
    }

    @Override
    public void update(CompatibleRenderTickEvent event) {
        
        if(mc.isGamePaused()) {
            return;
        }

        EntityPlayer origPlayer = compatibility.clientPlayer();

        if(origPlayer == null) {
            return;
        }

        updateWatchablePlayer();

        RenderGlobal origRenderGlobal = mc.renderGlobal;
        CompatibleParticleManager origEffectRenderer = compatibility.getCompatibleParticleManager();
        Entity origRenderViewEntity = compatibility.getRenderViewEntity();
        EntityRenderer origEntityRenderer = mc.entityRenderer;
        int origDisplayWidth = mc.displayWidth;
        int origDisplayHeight = mc.displayHeight;

        mc.displayWidth = this.width;
        mc.displayHeight = this.height;

        framebuffer.bindFramebuffer(true);

        mc.renderGlobal = this.renderGlobal;
        mc.effectRenderer = this.effectRenderer.getParticleManager();

        mc.entityRenderer = this.entityRenderer;
        if (watchablePlayer.getEntityLiving() != null && !watchablePlayer.getEntityLiving().isDead) {

            compatibility.setRenderViewEntity(watchablePlayer.getEntityLiving());
            compatibility.setClientPlayer(watchablePlayer);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);

            this.entityRenderer.setPrepareTerrain(true);
            this.entityRenderer.updateRenderer();
            long p_78471_2_ = this.renderEndNanoTime + (long) (1000000000 / 60);
            this.entityRenderer.renderWorld(event.getRenderTickTime(), p_78471_2_);

            modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);

            compatibility.setRenderViewEntity(origRenderViewEntity);
            compatibility.setClientPlayer(origPlayer);
        }

        renderOverlay();

        mc.getFramebuffer().bindFramebuffer(true);

        mc.renderGlobal = origRenderGlobal;
        mc.effectRenderer = origEffectRenderer.getParticleManager();

        mc.displayWidth = origDisplayWidth;
        mc.displayHeight = origDisplayHeight;
        mc.entityRenderer = origEntityRenderer;

        this.renderEndNanoTime = System.nanoTime();
    }

    protected abstract void updateWatchablePlayer();

    protected void renderOverlay() {
        this.entityRenderer.setupOverlayRendering();
    }
}
