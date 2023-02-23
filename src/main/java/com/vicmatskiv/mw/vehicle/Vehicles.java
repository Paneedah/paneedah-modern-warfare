package com.vicmatskiv.mw.vehicle;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.VehicleKey;
import com.vicmatskiv.mw.models.VehicleLock;
import com.vicmatskiv.mw.vehicle.AE86TruenoFactory;
import com.vicmatskiv.mw.vehicle.ATVFactory;
import com.vicmatskiv.mw.vehicle.AudiS4Factory;
import com.vicmatskiv.mw.vehicle.McLarenSennaFactory;
import com.vicmatskiv.weaponlib.render.QRL;
import com.vicmatskiv.weaponlib.vehicle.AccessibleVehicleGUI;
import com.vicmatskiv.weaponlib.vehicle.GeneralVehicleSounds;

public class Vehicles {
	
	public static void init(CommonProxy commonProxy) {
		
		// due to the fact that advanced warfare cannot be accessed from
		// weaponlib, here are things that need to be set from this end.
		GeneralVehicleSounds.setup(ModernWarfareMod.MOD_CONTEXT);
		AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(),
				QRL.quickLoc("gui", "vehiclekey"), QRL.quickLoc("gui", "keylock"));
		
		//new SampleVehicleFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AudiS4Factory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new McLarenSennaFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AE86TruenoFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new ATVFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
	}
}
