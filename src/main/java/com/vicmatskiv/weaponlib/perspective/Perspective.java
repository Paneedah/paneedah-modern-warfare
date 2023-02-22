package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleRenderTickEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldRenderer;
import com.vicmatskiv.weaponlib.compatibility.Framebuffers;
import com.vicmatskiv.weaponlib.shader.DynamicShaderContext;
import com.vicmatskiv.weaponlib.shader.DynamicShaderGroupManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.shader.Framebuffer;

import static com.vicmatskiv.mw.ModernWarfareMod.mc;

public abstract class Perspective<S> {

    protected ClientModContext modContext;
    protected Framebuffer framebuffer;

    protected int width;
    protected int height;

    protected CompatibleWorldRenderer entityRenderer;
    protected RenderGlobal renderGlobal;
    protected CompatibleParticleManager effectRenderer;
    protected DynamicShaderGroupManager shaderGroupManager;

    public void activate(ClientModContext modContext, PerspectiveManager manager) {
        this.modContext = modContext;
        if(framebuffer == null) {
            framebuffer = new Framebuffer(width, height, true);
            framebuffer.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.entityRenderer = manager.getEntityRenderer();
        this.effectRenderer = manager.getEffectRenderer();
        this.renderGlobal = manager.getRenderGlobal();
        this.shaderGroupManager = new DynamicShaderGroupManager(); //manager.getShaderGroupManager();
        if(this.shaderGroupManager.hasActiveGroups()) {
            System.err.println("!!! Active shader groups found !!!");
        }
    }

    public void deactivate(ClientModContext modContext) {
        //framebuffer.framebufferClear();
        int originalFramebufferId = Framebuffers.getCurrentFramebuffer();

        framebuffer.deleteFramebuffer();
        this.shaderGroupManager.removeAllShaders(new DynamicShaderContext(null, entityRenderer, null, 0f));
        Framebuffers.bindFramebuffer(originalFramebufferId, true, mc.getFramebuffer().framebufferWidth, mc.getFramebuffer().framebufferHeight);
    }

    public float getBrightness(RenderContext<S> context) {
        return 1f;
    }

    public int getTexture(RenderContext<S> context) {
        return framebuffer != null ? framebuffer.framebufferTexture : -1;
    }

    public Framebuffer getFramebuffer() {
        return framebuffer;
    }

    public abstract void update(CompatibleRenderTickEvent event);

}
