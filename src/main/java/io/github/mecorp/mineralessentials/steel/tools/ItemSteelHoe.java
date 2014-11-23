package io.github.mecorp.mineralessentials.steel.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemSteelHoe extends ItemHoe
{

	public ItemSteelHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("SteelHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
    }

}
