package io.github.mecorp.mineralessentials.copper.tools;

import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCopperAxe extends ItemAxe
{
	
    public ItemCopperAxe(ToolMaterial material)
    {
	super(material);
	setUnlocalizedName("CopperAxe");
	setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(ModCreativeTabs.tabMineralEssentials);
    }

}
