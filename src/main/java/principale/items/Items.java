package principale.items;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
    public static Item batonErmite1;
    public static Item batonErmite2;
    public static Item.ToolMaterial toolErmite = EnumHelper.addToolMaterial("toolErmite", 0, 800, 1, 2, 0 );
    public static ItemArmor.ArmorMaterial glass = EnumHelper.addArmorMaterial("glass", 50, new int[]{0, 0, 0, 0}, 0);
    public static Item sunGlass;
    public static void init()
    {
        batonErmite1 = new BatonErmite1(toolErmite);
        GameRegistry.addRecipe(new ItemStack(batonErmite1, 1), new Object[]{" # ", " # ", " # ", '#', Blocks.log});
        batonErmite2 = new BatonErmite2(toolErmite);
        GameRegistry.addRecipe(new ItemStack(batonErmite2, 1), new Object[]{"## ", " # ", " # ", '#', Blocks.log2});
        GameRegistry.addRecipe(new ItemStack(batonErmite2, 1), new Object[]{" ##", " # ", " # ", '#', Blocks.log2});
    }
    public static void postInit()
    {
        ItemsDBC.ItemGi.add(sunGlass = new Sunglass1(glass, 0));
    }
}