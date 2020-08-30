package principale;
import principale.items.Items;
import principale.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class Main
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event )
    {
        Items.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event )
    {
        proxy.registerRenders();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event )
    {
        Items.postInit();
    }
}
