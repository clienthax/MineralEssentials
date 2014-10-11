package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemTinHoe extends ItemHoe
{

	public ItemTinHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("TinHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
