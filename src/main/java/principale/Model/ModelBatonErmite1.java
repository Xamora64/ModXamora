package principale.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBox;
import org.lwjgl.opengl.GL11;

public class ModelBatonErmite1 extends ModelBase {
    private final ModelRenderer bone;

    public ModelBatonErmite1() {
        textureWidth = 32;
        textureHeight = 32;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 9, 13, 0.0F, -16.0F, -1.0F, 1, 15, 1, 0.0F ));
        bone.cubeList.add(new ModelBox(bone, 28, 17, 0.0F, -24.0F, -2.0F, 1, 10, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 16, -1.0F, -24.0F, -2.0F, 1, 8, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 16, 36, 1.0F, -24.0F, -2.0F, 1, 9, 3, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 22, 24, 0.0F, -24.0F, 0.0F, 1, 11, 1, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 0, 2, -2.0F, -31.0F, -3.0F, 5, 7, 5, 0.0F));
        bone.cubeList.add(new ModelBox(bone, 10, 10, -2.0F, -32.0F, -3.0F, 3, 1, 3, 0.0F));
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