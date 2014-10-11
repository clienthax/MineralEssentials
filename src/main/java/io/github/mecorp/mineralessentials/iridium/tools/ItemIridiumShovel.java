package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ItemIridiumShovel extends ItemSpade
{

	public ItemIridiumShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("IridiumShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
