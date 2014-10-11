package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ItemCobaltShovel extends ItemSpade
{

	public ItemCobaltShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CobaltShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
