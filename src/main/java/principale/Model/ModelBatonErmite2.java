package principale.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBox;
import org.lwjgl.opengl.GL11;

public class ModelBatonErmite2 extends ModelBase {
        private final ModelRenderer bone;


        public ModelBatonErmite2() {
            textureWidth = 32;
            textureHeight = 32;

            bone = new ModelRenderer(this);
            bone.setRotationPoint(0.0F, 24.0F, 0.0F);
            bone.cubeList.add(new ModelBox(bone, 3, 15, 0.0F, -14.0F, -2.2F, 1, 13, 1, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 22, 24, -0.5F, -24.0F, -2.0F, 2, 6, 3, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 22, 24, -0.25F, -18.0F, -1.5F, 1, 3, 2, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 0, 2, -1.0F, -28.0F, -4.0F, 3, 4, 10, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 10, 10, -1.0F, -27.5F, 6.0F, 3, 3, 1, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 10, 10, -0.25F, -27.0F, 7.0F, 1, 2, 1, 0.0F));
            bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -15.0F, -2.0F, 1, 1, 2, 0.0F));
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
