package io.github.mecorp.mineralessentials.copper.items;

import net.minecraft.item.Item;
import pw.block_breaking_games.mineral_essentials.help.RegisterHelper;

public class CopperItems
{
public static Item CopperIngot;
	
	public static void RegisterCopperItems()
	{
		CopperIngot = new ItemCopperIngot();
    	RegisterHelper.registerItem(CopperIngot);
	}
}
