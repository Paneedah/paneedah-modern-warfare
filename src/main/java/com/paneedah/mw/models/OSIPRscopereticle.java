package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class OSIPRscopereticle extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;

	public OSIPRscopereticle() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-6.0F, 8.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 5, 3.0F, -1.0F, 1.0F, 6, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 9, 4.8F, -20.6F, 1.0F, 2, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 12, 6.2F, -20.6F, 1.0F, 1, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 6, -4.65F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, 15.6F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.8F, -20.6F, 1.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.6807F);
		bone3.cubeList.add(new ModelBox(bone3, 25, 0, -12.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(7.2F, -20.6F, 1.0F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.6807F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 25, 0.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(3.0F, 0.0F, 1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.8029F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 3, -11.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, 0.0F, -23.0F, 1, 0, 23, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(9.0F, 0.0F, 1.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.8029F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 2, 0.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 2, 3.0F, 0.0F, -23.0F, 1, 0, 23, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-6.0F, 8.0F, -36.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 4, 3.0F, -1.0F, 1.0F, 6, 1, 0, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 8, 7, 4.8F, -20.6F, 1.0F, 2, 1, 0, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 12, 6.2F, -20.6F, 1.0F, 1, 1, 0, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 6, -4.65F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 6, 15.6F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.8F, -20.6F, 1.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.6807F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 24, -12.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 4, -10.0F, 0.0F, 0.0F, 1, 0, 23, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 4, -10.0F, 0.0F, -17.0F, 1, 0, 23, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(7.2F, -20.6F, 1.0F);
		bone6.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.6807F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 23, 0.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 6, 6, 9.0F, 0.0F, 0.0F, 1, 0, 23, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 6, 6, 9.0F, 0.0F, -17.0F, 1, 0, 23, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(3.0F, 0.0F, 1.0F);
		bone6.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.8029F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 1, -11.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(9.0F, 0.0F, 1.0F);
		bone6.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.8029F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 0.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.5F, -4.0F, -81.0F);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.5F, -1.0F, 0.0F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.7854F);
		bone17.cubeList.add(new ModelBox(bone17, 8, 6, -1.7678F, -1.7678F, 0.0F, 2, 1, 0, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 8, 10, 5.7175F, 4.7175F, 0.0F, 1, 2, 0, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 4, 11, 4.7175F, 5.7175F, 0.0F, 1, 1, 0, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 12, -1.7678F, -0.7678F, 0.0F, 1, 1, 0, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(3.0F, 2.5F, 0.0F);
		bone16.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.7854F);
		bone18.cubeList.add(new ModelBox(bone18, 10, 10, 0.7678F, -0.2322F, 0.0F, 1, 2, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 8, 8, -6.7175F, -6.7175F, 0.0F, 2, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 2, 11, -6.7175F, -5.7175F, 0.0F, 1, 1, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 6, 11, -0.2322F, 0.7678F, 0.0F, 1, 1, 0, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 3.0F, -27.0F);
		bone16.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 0, 11, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-6.0F, 8.0F, -53.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 4, 3.0F, -1.0F, 1.0F, 6, 1, 0, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 8, 7, 4.8F, -20.6F, 1.0F, 2, 1, 0, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 12, 6.2F, -20.6F, 1.0F, 1, 1, 0, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 6, -4.65F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 6, 15.6F, -13.0F, 1.0F, 1, 5, 0, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(4.8F, -20.6F, 1.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.6807F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 24, -12.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(7.2F, -20.6F, 1.0F);
		bone11.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.6807F);
		bone13.cubeList.add(new ModelBox(bone13, 0, 23, 0.0F, 0.0F, 0.0F, 12, 1, 0, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.0F, 0.0F, 1.0F);
		bone11.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.8029F);
		bone14.cubeList.add(new ModelBox(bone14, 0, 1, -11.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(9.0F, 0.0F, 1.0F);
		bone11.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.8029F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone6.render(f5);
		bone16.render(f5);
		bone11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}