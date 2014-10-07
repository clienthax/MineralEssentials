package io.github.mecorp.mineralessentials.copper.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import pw.block_breaking_games.mineral_essentials.help.Reference;

public class BlockCopperBlock extends Block 
{
	public BlockCopperBlock()
	{
		super(Material.rock);
		setBlockName("CopperBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.tabMineralEssentials);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
