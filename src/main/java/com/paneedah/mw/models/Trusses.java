// Date: 2/18/2019 4:32:20 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Trusses extends ModelBase
{
  //fields
    ModelRenderer trusses1;
    ModelRenderer trusses2;
    ModelRenderer trusses3;
    ModelRenderer trusses4;
    ModelRenderer trusses5;
  
  public Trusses()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      trusses1 = new ModelRenderer(this, 0, 0);
      trusses1.addBox(0F, 0F, 0F, 16, 2, 2);
      trusses1.setRotationPoint(-8F, 8F, -1F);
      trusses1.setTextureSize(128, 128);
      trusses1.mirror = true;
      setRotation(trusses1, 0F, 0F, 0F);
      trusses2 = new ModelRenderer(this, 0, 0);
      trusses2.addBox(0F, 0F, 0F, 16, 2, 2);
      trusses2.setRotationPoint(-8F, 18F, -1F);
      trusses2.setTextureSize(128, 128);
      trusses2.mirror = true;
      setRotation(trusses2, 0F, 0F, 0F);
      trusses3 = new ModelRenderer(this, 0, 0);
      trusses3.addBox(0F, 0F, 0F, 11, 1, 1);
      trusses3.setRotationPoint(-7F, 18F, -0.5F);
      trusses3.setTextureSize(128, 128);
      trusses3.mirror = true;
      setRotation(trusses3, 0F, 0F, -0.9294653F);
      trusses4 = new ModelRenderer(this, 0, 0);
      trusses4.addBox(-11F, 0F, 0F, 12, 1, 1);
      trusses4.setRotationPoint(7F, 18F, -0.5F);
      trusses4.setTextureSize(128, 128);
      trusses4.mirror = true;
      setRotation(trusses4, 0F, 0F, 0.9294596F);
      trusses5 = new ModelRenderer(this, 0, 0);
      trusses5.addBox(0F, 0F, 0F, 16, 1, 3);
      trusses5.setRotationPoint(-8F, 19.5F, -1.5F);
      trusses5.setTextureSize(128, 128);
      trusses5.mirror = true;
      setRotation(trusses5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    trusses1.render(f5);
    trusses2.render(f5);
    trusses3.render(f5);
    trusses4.render(f5);
    trusses5.render(f5);
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
