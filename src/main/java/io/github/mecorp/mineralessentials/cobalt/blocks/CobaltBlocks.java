package io.github.mecorp.mineralessentials.cobalt.blocks;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class CobaltBlocks
{
	public static Block CobaltBlock;

	public static void RegisterCobaltBlocks()
	{
		CobaltBlock = new BlockCobaltBlock().setBlockName("CobaltBlock");
		RegisterHelper.registerBlock(CobaltBlock);
	}
}