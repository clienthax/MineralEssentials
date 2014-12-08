package io.github.mecorp.mineralessentials.copper.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

public class CopperBlocks
{
	
		public static Block CopperBlock;

		public static void RegisterCopperBlocks()
		{
			CopperBlock = new BlockCopperBlock().setUnlocalizedName("CopperBlock");
			RegisterHelper.registerBlock(CopperBlock);
		}
}
