package io.github.mecorp.mineralessentials.tin.blocks;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class TinBlocks
{
	public static Block TinBlock;
	
	public static void RegisterTinBlocks()
	{
		TinBlock = new BlockTinBlock().setBlockName("TinBlock");
		RegisterHelper.registerBlock(TinBlock);
	}
}
