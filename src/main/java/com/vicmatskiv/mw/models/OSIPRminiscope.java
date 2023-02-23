package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class OSIPRminiscope extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;

	public OSIPRminiscope() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 6.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, 0.0F, 1, 8, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, 0.0F, 1, 8, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-8.0F, -1.0F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -1.3614F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.01F, 0.0F, 0.0F, 1, 10, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 6.99F, 0.0F, 0.0F, 1, 10, 8, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, 5.0F, -9.5F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.1396F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -4.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, 3.0F, -9.5F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.1222F, 0.0698F, 1.117F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -2.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-9.5F, 5.0F, -9.5F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.1396F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-9.5F, 3.0F, -9.5F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.1222F, -0.0698F, -1.117F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.5F, 1.0F, 3.5F);
		bone.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -3.5F, -1.0F, -8.0F, 3, 1, 9, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -3.5F, 4.0F, -8.0F, 3, 1, 9, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -5.0F, 0.5F, -8.0F, 1, 3, 9, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, 0.5F, -8.0F, 1, 3, 9, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.5F, -1.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.7854F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -1.0F, 0.0F, -8.0F, 1, 2, 9, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -4.1213F, -2.1213F, -8.0F, 2, 1, 9, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -6.364F, 0.1213F, -8.0F, 1, 2, 9, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -4.2426F, 3.2426F, -8.0F, 2, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}