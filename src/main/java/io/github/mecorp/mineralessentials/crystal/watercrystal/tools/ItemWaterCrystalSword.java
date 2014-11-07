package io.github.mecorp.mineralessentials.crystal.watercrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECrystal;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;


public class ItemWaterCrystalSword extends ItemSword
{

	public ItemWaterCrystalSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("WaterCrystalSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECrystal.MECrystal);
	}
    /*public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par1ItemStack.addEnchantment(Enchantment.fireAspect, 2);
    }*/
}