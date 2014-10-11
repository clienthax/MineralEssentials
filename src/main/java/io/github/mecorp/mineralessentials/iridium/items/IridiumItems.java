package io.github.mecorp.mineralessentials.iridium.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class IridiumItems
{
	public static Item IridiumIngot;
	
	public static void RegisterIridiumItems()
	{
		IridiumIngot = new ItemIridiumIngot();
    	RegisterHelper.registerItem(IridiumIngot);
	}
}
