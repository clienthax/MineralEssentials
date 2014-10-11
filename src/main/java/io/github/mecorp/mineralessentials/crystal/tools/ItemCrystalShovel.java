package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ItemCrystalShovel extends ItemSpade
{

	public ItemCrystalShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CrystalShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
