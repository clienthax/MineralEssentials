package io.github.mecorp.mineralessentials.copper.blocks;

import net.minecraft.block.Block;
import pw.block_breaking_games.mineral_essentials.help.RegisterHelper;

public class CopperBlocks
{
	
		public static Block CopperBlock;

		public static void RegisterCopperBlocks()
		{
			CopperBlock = new BlockCopperBlock().setBlockName("CopperBlock");
			RegisterHelper.registerBlock(CopperBlock);
		}
}
