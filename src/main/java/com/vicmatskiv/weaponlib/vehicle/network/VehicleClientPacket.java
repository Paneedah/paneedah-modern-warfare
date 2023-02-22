package com.vicmatskiv.weaponlib.vehicle.network;

import java.io.IOException;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.vehicle.EntityVehicle;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.Vec3d;

public class VehicleClientPacket implements CompatibleMessage {

	public VehicleDataContainer serializer;

	public VehicleClientPacket() {}
	
	public VehicleClientPacket(VehicleDataContainer serializer) {
		this.serializer = serializer;
	}
	

	public void fromBytes(ByteBuf buf) {
		try {
			this.serializer = serializer.read(buf);
			
			//this.serializer.vehicle = (EntityVehicle) mc.player.world.getEntityByID(this.serializer.entityID);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toBytes(ByteBuf buf) {
		//System.out.println("my brotha: " + this.serializer.vehicle);
		this.serializer.write(buf, this.serializer);
	}

	
}
