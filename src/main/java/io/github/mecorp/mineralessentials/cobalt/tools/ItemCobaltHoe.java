package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemCobaltHoe extends ItemHoe
{

	public ItemCobaltHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CobaltHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
