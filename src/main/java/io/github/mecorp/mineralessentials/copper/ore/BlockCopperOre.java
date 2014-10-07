package io.github.mecorp.mineralessentials.copper.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;

public class BlockCopperOre extends Block
{
	public BlockCopperOre()
	{
		super(Material.rock);
		setBlockName("CopperOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
