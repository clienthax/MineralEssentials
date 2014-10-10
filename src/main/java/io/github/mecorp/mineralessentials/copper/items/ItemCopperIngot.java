package io.github.mecorp.mineralessentials.copper.items;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;
//import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;

public class ItemCopperIngot extends Item
{
	public ItemCopperIngot()
	{
		super();
		setUnlocalizedName("CopperIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}

