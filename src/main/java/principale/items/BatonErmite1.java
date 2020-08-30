package principale.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import principale.Reference;

public class BatonErmite1 extends ItemSword
{

    public BatonErmite1(ToolMaterial p_145356_1_)
    {
        super(p_145356_1_);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(Reference.MOD_ID +".batonermite1");
        setTextureName(Reference.MOD_ID +":batonermite1");
        GameRegistry.registerItem(this, getUnlocalizedName());
        setMaxStackSize(1);
    }
}
