package io.github.mecorp.mineralessentials.crystal.firecrystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECrystal;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemFireCrystalArmor extends ItemArmor {

	public ItemFireCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== FireCrystalArmor.FireCrystalHelmet || stack.getItem() == FireCrystalArmor.FireCrystalChestplate || stack.getItem() == FireCrystalArmor.FireCrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/FireCrystal1.png";
		}
		else if(stack.getItem() == FireCrystalArmor.FireCrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/FireCrystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemFireCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECrystal.MECrystal;
	}
}
