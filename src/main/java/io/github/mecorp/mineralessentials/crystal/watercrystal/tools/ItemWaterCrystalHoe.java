package io.github.mecorp.mineralessentials.crystal.watercrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECrystal;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemWaterCrystalHoe extends ItemHoe
{

	public ItemWaterCrystalHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("WaterCrystalHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECrystal.MECrystal);
	}

}
