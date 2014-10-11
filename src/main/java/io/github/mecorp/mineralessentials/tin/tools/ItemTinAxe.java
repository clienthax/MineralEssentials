package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemTinAxe extends ItemAxe
{

	public ItemTinAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("TinAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
