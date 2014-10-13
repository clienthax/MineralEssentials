package io.github.mecorp.mineralessentials.sheep;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSheepBlock extends Block
{
	public BlockSheepBlock()
	{
		super(Material.rock);
		setBlockName("SheepBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setBlockUnbreakable();
		setResistance(6000000.0F);
	}
}
