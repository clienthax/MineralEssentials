package io.github.mecorp.mineralessentials.copper.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class CopperItems
{
public static Item CopperIngot;
	
	public static void RegisterCopperItems()
	{
		CopperIngot = new ItemCopperIngot();
    	RegisterHelper.registerItem(CopperIngot);
	}
}
