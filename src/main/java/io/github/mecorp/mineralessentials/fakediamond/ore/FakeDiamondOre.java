package io.github.mecorp.mineralessentials.fakediamond.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;


public class FakeDiamondOre
{
	
		public static Block FakeDiamondOre;
		public static void RegisterFakeDiamondOres()
		{
            FakeDiamondOre = new BlockFakeDiamondOre().setUnlocalizedName("FakeDiamondOre");
			RegisterHelper.registerBlock(FakeDiamondOre);
		}

}