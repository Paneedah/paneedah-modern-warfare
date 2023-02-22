package com.vicmatskiv.weaponlib.mission;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class OpenMissionGuiHandler implements CompatibleMessageHandler<OpenMissionGuiMessage, CompatibleMessage>  {

    @SuppressWarnings("unused")
    private ModContext modContext;

    public OpenMissionGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(OpenMissionGuiMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()) {
            compatibility.runInMainClientThread(() -> {
//                CompatiblePlayerEntityTrackerProvider.setTracker(compatibility.clientPlayer(), message.getTracker());
//                if(message.getStatusMessage() != null) {
//                    modContext.getStatusMessageCenter().addMessage(message.getStatusMessage(), 1000);
//                }
//                mc.displayGuiScreen(new MissionsMenuGui());

            });
        }
        return null;
    }
}
