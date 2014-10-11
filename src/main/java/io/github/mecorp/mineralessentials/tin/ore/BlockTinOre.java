package io.github.mecorp.mineralessentials.tin.ore;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTinOre  extends Block
{
	
	
		public BlockTinOre()
		{
			super(Material.rock);
			setBlockName("TinOre");
			setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabAllSearch);
			setHardness(5.0F);
			setResistance(10.0F);
			setHarvestLevel("pickaxe", 1);
		}
	}


