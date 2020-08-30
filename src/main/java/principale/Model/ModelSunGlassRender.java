package principale.Model;
/*
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ModelSunGlassRender implements IItemRenderer
{
    protected ModelSunGlass model;

    protected static final ResourceLocation texture = new ResourceLocation("epee:textures/items/SunGlassRed.png");

    public ModelSunGlassRender() {

        model = new ModelSunGlass();

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
*/

