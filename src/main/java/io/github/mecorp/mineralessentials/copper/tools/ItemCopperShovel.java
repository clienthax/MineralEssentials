package io.github.mecorp.mineralessentials.copper.tools;

import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;
import net.minecraft.item.ItemSpade;

public class ItemCopperShovel extends ItemSpade
{
	public ItemCopperShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}
