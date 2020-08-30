package principale.proxy;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;
import principale.Model.ModelBatonErmite1Render;
import principale.Model.ModelBatonErmite2Render;
import principale.Model.ModelSunGlassRender;
import principale.Reference;
import principale.items.Items;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        MinecraftForgeClient.registerItemRenderer(Items.batonErmite1, (IItemRenderer)new ModelBatonErmite1Render());
        MinecraftForgeClient.registerItemRenderer(Items.batonErmite2, (IItemRenderer)new ModelBatonErmite2Render());
      //  MinecraftForgeClient.registerItemRenderer(Items.sunGlass, (IItemRenderer)new ModelSunGlassRender());
    }
}
