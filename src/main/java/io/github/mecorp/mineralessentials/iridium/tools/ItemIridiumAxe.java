package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemIridiumAxe extends ItemAxe
{

	public ItemIridiumAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("IridiumAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
