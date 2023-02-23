package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryFireMessageHandler implements CompatibleMessageHandler<TryFireMessage, CompatibleMessage> {
	
	private WeaponFireAspect fireManager;

	TryFireMessageHandler(WeaponFireAspect fireManager) {
		this.fireManager = fireManager;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(TryFireMessage message, CompatibleMessageContext ctx) {
		if(ctx.isServerSide()) {
			EntityPlayer player = ctx.getPlayer();
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof Weapon) {
				if(message.isOn()) {
					ctx.runInMainThread(() -> {
						fireManager.serverFire(player, itemStack, message.isBurst(), message.isAimed());
					});
				}
			}
		}
		
		return null;
	}

}
