// Date: 2/18/2019 8:05:11 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TrashBin extends ModelBase
{
  //fields
    ModelRenderer trashbin1;
    ModelRenderer trashbin2;
    ModelRenderer trashbin3;
    ModelRenderer trashbin4;
    ModelRenderer trashbin5;
    ModelRenderer trashbin6;
    ModelRenderer trashbin7;
    ModelRenderer trashbin8;
    ModelRenderer trashbin9;
    ModelRenderer trashbin10;
    ModelRenderer trashbin11;
    ModelRenderer trashbin12;
  
  public TrashBin()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      trashbin1 = new ModelRenderer(this, 0, 0);
      trashbin1.addBox(0F, 0F, 0F, 12, 16, 8);
      trashbin1.setRotationPoint(-6F, 8F, -2F);
      trashbin1.setTextureSize(128, 128);
      trashbin1.mirror = true;
      setRotation(trashbin1, 0F, 0F, 0F);
      trashbin2 = new ModelRenderer(this, 0, 0);
      trashbin2.addBox(0F, 0F, 0F, 14, 16, 6);
      trashbin2.setRotationPoint(-7F, 8F, -1F);
      trashbin2.setTextureSize(128, 128);
      trashbin2.mirror = true;
      setRotation(trashbin2, 0F, 0F, 0F);
      trashbin3 = new ModelRenderer(this, 0, 0);
      trashbin3.addBox(0F, 0F, 0F, 4, 4, 4);
      trashbin3.setRotationPoint(-5.5F, 4F, 1F);
      trashbin3.setTextureSize(128, 128);
      trashbin3.mirror = true;
      setRotation(trashbin3, 0F, 0F, 0F);
      trashbin4 = new ModelRenderer(this, 0, 0);
      trashbin4.addBox(0F, 0F, 0F, 4, 4, 4);
      trashbin4.setRotationPoint(1.5F, 4F, 1F);
      trashbin4.setTextureSize(128, 128);
      trashbin4.mirror = true;
      setRotation(trashbin4, 0F, 0F, 0F);
      trashbin5 = new ModelRenderer(this, 0, 0);
      trashbin5.addBox(0F, 0F, 0F, 4, 5, 3);
      trashbin5.setRotationPoint(-5.5F, 4F, 1F);
      trashbin5.setTextureSize(128, 128);
      trashbin5.mirror = true;
      setRotation(trashbin5, -0.6320364F, 0F, 0F);
      trashbin6 = new ModelRenderer(this, 0, 0);
      trashbin6.addBox(0F, 0F, 0F, 4, 5, 3);
      trashbin6.setRotationPoint(1.5F, 4F, 1F);
      trashbin6.setTextureSize(128, 128);
      trashbin6.mirror = true;
      setRotation(trashbin6, -0.6320364F, 0F, 0F);
      trashbin7 = new ModelRenderer(this, 0, 0);
      trashbin7.addBox(0F, 0F, 0F, 13, 2, 5);
      trashbin7.setRotationPoint(-6.5F, 6F, 0F);
      trashbin7.setTextureSize(128, 128);
      trashbin7.mirror = true;
      setRotation(trashbin7, 0F, 0F, 0F);
      trashbin8 = new ModelRenderer(this, 0, 0);
      trashbin8.addBox(0F, 0F, 0F, 2, 1, 4);
      trashbin8.setRotationPoint(5.5F, 4F, 1F);
      trashbin8.setTextureSize(128, 128);
      trashbin8.mirror = true;
      setRotation(trashbin8, 0F, 0F, 1.07818F);
      trashbin9 = new ModelRenderer(this, 0, 0);
      trashbin9.addBox(-2F, 0F, 0F, 2, 1, 4);
      trashbin9.setRotationPoint(-5.5F, 4F, 1F);
      trashbin9.setTextureSize(128, 128);
      trashbin9.mirror = true;
      setRotation(trashbin9, 0F, 0F, -1.078177F);
      trashbin10 = new ModelRenderer(this, 0, 0);
      trashbin10.addBox(0F, 0F, 0F, 11, 3, 1);
      trashbin10.setRotationPoint(-5.5F, 5F, 4.5F);
      trashbin10.setTextureSize(128, 128);
      trashbin10.mirror = true;
      setRotation(trashbin10, 0F, 0F, 0F);
      trashbin11 = new ModelRenderer(this, 0, 0);
      trashbin11.addBox(0F, 0F, 0F, 4, 4, 4);
      trashbin11.setRotationPoint(-2F, 4.3F, 0.8F);
      trashbin11.setTextureSize(128, 128);
      trashbin11.mirror = true;
      setRotation(trashbin11, 0F, 0F, 0F);
      trashbin12 = new ModelRenderer(this, 0, 0);
      trashbin12.addBox(0F, 0F, 0F, 4, 5, 4);
      trashbin12.setRotationPoint(-2F, 4.3F, 0.8F);
      trashbin12.setTextureSize(128, 128);
      trashbin12.mirror = true;
      setRotation(trashbin12, -0.5948578F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    trashbin1.render(f5);
    trashbin2.render(f5);
    trashbin3.render(f5);
    trashbin4.render(f5);
    trashbin5.render(f5);
    trashbin6.render(f5);
    trashbin7.render(f5);
    trashbin8.render(f5);
    trashbin9.render(f5);
    trashbin10.render(f5);
    trashbin11.render(f5);
    trashbin12.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
