package principale.Model;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBatonErmite1Render implements IItemRenderer
{
    protected ModelBatonErmite1 model;

    protected static final ResourceLocation texture = new ResourceLocation("epee:textures/items/texturebaton1.png");

    public ModelBatonErmite1Render() {

            model = new ModelBatonErmite1();


    }



    @Override

    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch(type)

        {

            case EQUIPPED:

                return true;

            default:

                return false;

        }
    }
    @Override

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {

        return false;

    }
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case EQUIPPED:
            {
                GL11.glPushMatrix();

                if(((EntityPlayer)data[1]).isBlocking())
                {
                    GL11.glRotatef(90, 0.0F, 0.0F , -1.0F);
                    GL11.glTranslatef(-0.17F, 0.3F, -0.2F);
                }
                else
                {
                    GL11.glRotatef(90, 0.0F, 0.0F , -1.0F);
                    GL11.glTranslatef(-0.42F, 0.2F, 0.03F);
                }

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();

                break;
            }
            default:

                break;
        }
    }

}
