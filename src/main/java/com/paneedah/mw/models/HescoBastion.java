package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class HescoBastion extends ModelBase {
	private final ModelRenderer bastion;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;

	public HescoBastion() {
		textureWidth = 100;
		textureHeight = 100;

		bastion = new ModelRenderer(this);
		bastion.setRotationPoint(0.0F, 24.0F, 0.0F);
		bastion.cubeList.add(new ModelBox(bastion, 0, 0, -7.5F, -15.0F, -7.5F, 15, 14, 15, 0.0F, false));
		bastion.cubeList.add(new ModelBox(bastion, 0, 29, -7.0F, -1.0F, -7.0F, 14, 1, 14, 0.0F, false));
		bastion.cubeList.add(new ModelBox(bastion, 45, 0, -7.5F, -16.001F, -7.75F, 15, 3, 1, 0.0F, false));
		bastion.cubeList.add(new ModelBox(bastion, 17, 44, -7.5F, -16.001F, 6.75F, 15, 3, 1, 0.0F, false));
		bastion.cubeList.add(new ModelBox(bastion, 0, 44, -7.75F, -16.0F, -7.5F, 1, 3, 15, 0.0F, false));
		bastion.cubeList.add(new ModelBox(bastion, 41, 41, 6.75F, -16.0F, -7.5F, 1, 3, 15, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(6.0F, -15.4F, -5.7F);
		bastion.addChild(bone);
		setRotationAngle(bone, -1.0821F, -0.2967F, -0.0873F);
		bone.cubeList.add(new ModelBox(bone, 45, 4, -7.0F, -7.0F, 0.0F, 7, 7, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.4F, -15.2F, -8.6F);
		bastion.addChild(bone3);
		setRotationAngle(bone3, -1.0821F, 0.7505F, -0.0873F);
		bone3.cubeList.add(new ModelBox(bone3, 17, 48, -7.0F, -5.0F, 0.0F, 5, 5, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-5.1F, -15.3F, 7.5F);
		bastion.addChild(bone2);
		setRotationAngle(bone2, -1.2741F, -2.9147F, -0.0175F);
		bone2.cubeList.add(new ModelBox(bone2, 42, 29, -12.0F, -7.0F, 0.0F, 12, 7, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bastion.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}