package io.github.mecorp.mineralessentials.cobalt.blocks;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECobalt;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCobaltBlock extends Block
{
	public BlockCobaltBlock()
	{
		super(Material.rock);
		setBlockName("CobaltBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECobalt.MECobalt);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
