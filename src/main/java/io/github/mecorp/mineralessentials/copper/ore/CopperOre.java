package io.github.mecorp.mineralessentials.copper.ore;

import net.minecraft.block.Block;

import pw.block_breaking_games.mineral_essentials.help.RegisterHelper;

public class CopperOre
{
	
		public static Block CopperOre;
		public static void RegisterCopperOres()
		{
			CopperOre = new BlockCopperOre().setBlockName("CopperOre");
			RegisterHelper.registerBlock(CopperOre);
		}

}