package io.github.mecorp.mineralessentials.tin.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class TinItems
{
	public static Item TinIngot;
	
	public static void RegisterTinItems()
	{
		TinIngot = new ItemTinIngot();
		RegisterHelper.registerItem(TinIngot);
	}
}
