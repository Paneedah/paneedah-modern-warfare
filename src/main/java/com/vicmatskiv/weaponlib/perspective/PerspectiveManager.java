package com.vicmatskiv.weaponlib.perspective;

import com.vicmatskiv.weaponlib.ClientModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstance;
import com.vicmatskiv.weaponlib.compatibility.CompatibleParticleManager;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.vicmatskiv.mw.ModernWarfareMod.mc;
import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class PerspectiveManager {

    private static final Logger logger = LogManager.getLogger(PerspectiveManager.class);

    private Perspective<?> currentPerspective;
    private ClientModContext clientModContext;
    private CompatibleWorldRenderer entityRenderer;
    private RenderGlobal renderGlobal;
    private CompatibleParticleManager effectRenderer;
    //private DynamicShaderGroupManager shaderGroupManager;

    public PerspectiveManager(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
        //this.shaderGroupManager = new DynamicShaderGroupManager();
    }

    public Perspective<?> getPerspective(PlayerItemInstance<?> currentInstance, boolean init) {

        if(currentInstance == null || (currentPerspective == null && !init)) {
            return null;
        }

        Class<? extends Perspective<?>> perspectiveClass = currentInstance.getRequiredPerspectiveType();

        if (perspectiveClass != null) {
            if(currentPerspective == null) {
                currentPerspective = createActivePerspective(perspectiveClass);
            } else if(!perspectiveClass.isInstance(currentPerspective)) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = createActivePerspective(perspectiveClass);
            }
        } else if (currentPerspective != null) {
            if(init) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = null;
            }

        }

        return currentPerspective;
    }

    private Perspective<?> createActivePerspective(Class<? extends Perspective<?>> perspectiveClass) {
        Perspective<?> result = null;

        try {
            result = perspectiveClass.newInstance();
            result.activate(clientModContext, this);
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("Failed to create view of {} - {}", perspectiveClass, e, e);
        }
        return result;
    }

    CompatibleWorldRenderer getEntityRenderer() {
        if(entityRenderer == null) {
            entityRenderer = new CompatibleWorldRenderer(mc,
                    mc.getResourceManager());
        }
        return entityRenderer;
    }

    RenderGlobal getRenderGlobal() {
        if(renderGlobal == null) {
            renderGlobal = compatibility.createCompatibleRenderGlobal();
            WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
            renderGlobal.setWorldAndLoadRenderers(world);
        }
        return renderGlobal;
    }

    CompatibleParticleManager getEffectRenderer() {
        if(effectRenderer == null) {
            WorldClient world = (WorldClient) compatibility.world(compatibility.clientPlayer());
            effectRenderer = compatibility.createCompatibleParticleManager(world);
        }
        return effectRenderer;
    }

//    DynamicShaderGroupManager getShaderGroupManager() {
//        return shaderGroupManager;
//    }

}
