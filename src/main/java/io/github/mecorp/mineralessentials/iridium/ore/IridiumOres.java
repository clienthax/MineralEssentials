package io.github.mecorp.mineralessentials.iridium.ore;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

public class IridiumOres {
	public static Block IridiumOre;
	public static void RegisterIridiumOres()
	{
		IridiumOre = new BlockIridiumOre().setBlockName("IridiumOre");
		RegisterHelper.registerBlock(IridiumOre);
	}
}
	
