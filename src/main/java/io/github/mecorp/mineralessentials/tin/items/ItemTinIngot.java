package io.github.mecorp.mineralessentials.tin.items;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item
{
	public ItemTinIngot()
	{
		super();
		setUnlocalizedName("TinIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}
}
