package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;
//import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;

public class ItemCopperPickaxe extends ItemPickaxe
{
	public ItemCopperPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}
