package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;
//import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;

public class ItemCopperSword extends ItemSword 
{
	public ItemCopperSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}
