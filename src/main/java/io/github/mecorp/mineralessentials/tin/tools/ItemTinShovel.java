package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ItemTinShovel extends ItemSpade
{

	public ItemTinShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("TinShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
