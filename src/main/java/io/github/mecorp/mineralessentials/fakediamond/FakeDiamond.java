package io.github.mecorp.mineralessentials.fakediamond;

import io.github.mecorp.mineralessentials.fakediamond.items.FakeDiamondItems;
import io.github.mecorp.mineralessentials.fakediamond.ore.FakeDiamondOre;

public class FakeDiamond
{
	public static void RegisterDiamond(){
        FakeDiamondItems.RegisterFakeDiamondItems();
        FakeDiamondOre.RegisterFakeDiamondOres();
		
	}
}
