package io.github.mecorp.mineralessentials.steel.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

public class SteelBlocks
{
	public static Block SteelBlock;

	public static void RegisterSteelBlocks()
	{
		SteelBlock = new BlockSteelBlock().setUnlocalizedName("SteelBlock");
		RegisterHelper.registerBlock(SteelBlock);
	}
}