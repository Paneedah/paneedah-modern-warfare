package com.vicmatskiv.weaponlib.network.packets;

import com.vicmatskiv.weaponlib.ClientEventHandler;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;

import static com.vicmatskiv.mw.ModernWarfareMod.mc;
import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GunFXPacket implements CompatibleMessage {

	public int entID;

	public GunFXPacket() {}
	
	public GunFXPacket(int entityID) {
		this.entID = entityID;
	}
	

	public void fromBytes(ByteBuf buf) {
		this.entID = buf.readInt();
	}

	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.entID);
	}

	public static class GunFXPacketHandler implements CompatibleMessageHandler<GunFXPacket, CompatibleMessage> {
		
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(GunFXPacket m, CompatibleMessageContext ctx) {
			 if(!ctx.isServerSide()) {
		            compatibility.runInMainClientThread(() -> {
					
		            	
		            if(mc.player.getEntityId() == m.entID) {
		            	return;
		            }
					ClientEventHandler.uploadFlash(m.entID);
					
				});
			}
			
			return null;
		}

	}

	
}
