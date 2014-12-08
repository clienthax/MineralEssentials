package io.github.mecorp.mineralessentials.cobalt.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

public class CobaltBlocks
{
	public static Block CobaltBlock;

	public static void RegisterCobaltBlocks()
	{
		CobaltBlock = new BlockCobaltBlock().setUnlocalizedName("CobaltBlock");
		RegisterHelper.registerBlock(CobaltBlock);
	}
}