package io.github.mecorp.mineralessentials.copper.tools;

import net.minecraft.item.ItemSword;
import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;

public class ItemCopperSword extends ItemSword 
{
	public ItemCopperSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperSword");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}
