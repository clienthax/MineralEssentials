package io.github.mecorp.mineralessentials.crystal.items;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCrystalCrystal  extends Item
{
	public ItemCrystalCrystal()
	{
		super();
		setUnlocalizedName("CrystalCrystal");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}
}
