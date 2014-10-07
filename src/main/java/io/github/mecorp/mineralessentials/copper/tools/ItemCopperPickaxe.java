package io.github.mecorp.mineralessentials.copper.tools;

import net.minecraft.item.ItemPickaxe;
import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;

public class ItemCopperPickaxe extends ItemPickaxe
{
	public ItemCopperPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}
