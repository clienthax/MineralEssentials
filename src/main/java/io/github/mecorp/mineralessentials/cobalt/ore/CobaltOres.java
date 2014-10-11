package io.github.mecorp.mineralessentials.cobalt.ore;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class CobaltOres {
	public static Block CobaltOre;
	public static void RegisterCobaltOres()
	{
		CobaltOre = new BlockCobaltOre().setBlockName("CobaltOre");
		RegisterHelper.registerBlock(CobaltOre);
	}
}
	
