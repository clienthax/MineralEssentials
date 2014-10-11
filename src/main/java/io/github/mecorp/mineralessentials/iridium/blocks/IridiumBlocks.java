package io.github.mecorp.mineralessentials.iridium.blocks;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class IridiumBlocks
{
	public static Block IridiumBlock;

	public static void RegisterIridiumBlocks()
	{
		IridiumBlock = new BlockIridiumBlock().setBlockName("IridiumBlock");
		RegisterHelper.registerBlock(IridiumBlock);
	}
}