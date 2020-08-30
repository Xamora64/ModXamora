package principale.items;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Items.VanityColor;
import JinRyuu.JRMCore.JRMCoreH2;
import JinRyuu.JRMCore.items.ItemVanity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import principale.Model.ModelSunGlass;
import principale.Reference;

public class Sunglass1 extends ItemArmor//Vanity
{
    public Sunglass1(ArmorMaterial glass, int p_14532_3_)
    {
        super(glass, 0, p_14532_3_);

        // super(0, 0, "SunGlass"); // <- C'est le code de DBC qui est totalement pété
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(Reference.MOD_ID + ".sunglass1");
        setTextureName(Reference.MOD_ID + ":SunGlass/sunglass1");
        GameRegistry.registerItem(this, getUnlocalizedName());
        setMaxStackSize(1);

    }/*

    public String getTextureFile() {
        return Reference.MOD_ID + ":sunglass1";
    }*/

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Reference.MOD_ID + ":textures/items/SunGlass/SunGlassRed.png";
    }

    @SideOnly(Side.CLIENT)
    public net.minecraft.client.model.ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)

    {
        return new ModelSunGlass();
    }

}
