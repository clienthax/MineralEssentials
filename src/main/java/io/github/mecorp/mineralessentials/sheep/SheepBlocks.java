package io.github.mecorp.mineralessentials.sheep;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class SheepBlocks {
	public static Block SheepBlock;
	
	public static void RegisterSheepBlocks()
	{
		SheepBlock = new BlockSheepBlock().setBlockName("SheepBlock");
		RegisterHelper.registerBlock(SheepBlock);
	}
}
