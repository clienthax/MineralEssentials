package io.github.mecorp.mineralessentials.iridium.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

public class IridiumBlocks
{
	public static Block IridiumBlock;

	public static void RegisterIridiumBlocks()
	{
		IridiumBlock = new BlockIridiumBlock().setUnlocalizedName("IridiumBlock");
		RegisterHelper.registerBlock(IridiumBlock);
	}
}