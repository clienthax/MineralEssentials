package io.github.mecorp.mineralessentials.copper.ore;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;


public class CopperOre
{
	
		public static Block CopperOre;
		public static void RegisterCopperOres()
		{
			CopperOre = new BlockCopperOre().setBlockName("CopperOre");
			RegisterHelper.registerBlock(CopperOre);
		}

}