package io.github.mecorp.mineralessentials.copper.items;
import net.minecraft.item.Item;
import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;

public class ItemCopperIngot extends Item
{
	public ItemCopperIngot()
	{
		super();
		setUnlocalizedName("CopperIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
	}
}

