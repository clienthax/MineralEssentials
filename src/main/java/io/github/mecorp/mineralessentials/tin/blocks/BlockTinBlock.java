package io.github.mecorp.mineralessentials.tin.blocks;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTinBlock extends Block
{
	public BlockTinBlock()
	{
		super(Material.rock);
		setBlockName("TinBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
	}
}
