package principale.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import principale.Reference;

public class BatonErmite2 extends ItemSword
{

    public BatonErmite2(ToolMaterial p_145356_1_)
    {
        super(p_145356_1_);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(Reference.MOD_ID +".batonermite2");
        setTextureName(Reference.MOD_ID +":batonermite2");
        GameRegistry.registerItem(this, getUnlocalizedName());
        setMaxStackSize(1);
    }

}
