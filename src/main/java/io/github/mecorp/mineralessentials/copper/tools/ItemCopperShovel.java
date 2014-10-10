package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemCopperShovel extends ItemSpade
{
	public ItemCopperShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}
}
