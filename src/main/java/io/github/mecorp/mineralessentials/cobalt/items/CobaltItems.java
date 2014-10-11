package io.github.mecorp.mineralessentials.cobalt.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class CobaltItems
{
	public static Item CobaltIngot;
	
	public static void RegisterCobaltItems()
	{
		CobaltIngot = new ItemCobaltIngot();
    	RegisterHelper.registerItem(CobaltIngot);
	}
}
