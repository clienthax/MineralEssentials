package io.github.mecorp.mineralessentials.tin.ore;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class TinOre
{

	public static Block TinOre;
		public static void RegisterTinOres()
		{
			TinOre = new BlockTinOre().setBlockName("TinOre");
			RegisterHelper.registerBlock(TinOre);
		}
	}
		

