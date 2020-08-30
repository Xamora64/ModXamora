package principale.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBox;
import org.lwjgl.opengl.GL11;

public class ModelSunGlass extends ModelBiped
{
    private final ModelRenderer bone;

    public ModelSunGlass() {
        textureWidth = 32;
        textureHeight = 32;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-7.0F, 6.0F, -12.0F);
        setRotationAngle(bone, 0.0F, 1.5F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 12, 8, -8.0F, -11.0F, 7.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 17, 17, -8.0F, -11.0F, 8.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 18, 12, -8.0F, -12.0F, 6.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 17, 4, -8.0F, -12.0F, 9.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 12, 12, -8.0F, -13.0F, 2.0F, 1, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 9, -8.0F, -13.0F, 10.0F, 1, 1, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 7, -8.0F, -12.0F, 1.0F, 1, 3, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -12.0F, 14.0F, 1, 3, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 6, 2, -14.0F, -11.0F, 14.0F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 6, 0, -14.0F, -11.0F, 1.0F, 6, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 18, -8.0F, -9.0F, 2.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 13, 17, -8.0F, -9.0F, 13.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 16, 8, -8.0F, -8.0F, 3.0F, 1, 1, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 5, 15, -8.0F, -8.0F, 10.0F, 1, 1, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 10, 13, -8.0F, -10.0F, 6.0F, 1, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 6, 7, -8.0F, -10.0F, 9.0F, 1, 2, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 6, 6, -8.0F, -12.0F, 2.0F, 1, 3, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -12.0F, 10.0F, 1, 3, 4, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 14, -8.0F, -9.0F, 3.0F, 1, 1, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 12, 4, -8.0F, -9.0F, 10.0F, 1, 1, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 11, -8.0F, -11.0F, 6.0F, 1, 1, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 10, 4, -8.0F, -11.0F, 9.0F, 1, 1, 1, 0.0F));
    }
    


    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();

        //GL11.glRotated(90, 0.0F, 1.0F, 0.0F);
        //GL11.glTranslatef(0.18F, -1.0F, 0.0F);
        GL11.glScaled(0.65F,0.65F,0.65F);

        GL11.glPopMatrix();

        bone.rotateAngleY = f3 / (180F / (float)Math.PI);
        bone.rotateAngleX = f4 / (180F / (float)Math.PI);

        bone.render(f5);

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationPoint(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotationPointX = x;
        modelRenderer.rotationPointY = y;
        modelRenderer.rotationPointZ = z;
    }
}
