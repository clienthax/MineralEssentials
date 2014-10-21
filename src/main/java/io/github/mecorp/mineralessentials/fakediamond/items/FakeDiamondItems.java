package io.github.mecorp.mineralessentials.fakediamond.items;

import io.github.mecorp.mineralessentials.fakediamond.FakeDiamond;
import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class FakeDiamondItems
{
public static Item FakeDiamond;
	
	public static void RegisterFakeDiamondItems()
	{
        FakeDiamond = new ItemFakeDiamond();
    	RegisterHelper.registerItem(FakeDiamond);
	}
}
