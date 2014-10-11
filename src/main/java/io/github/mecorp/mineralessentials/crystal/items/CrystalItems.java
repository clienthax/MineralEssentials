package io.github.mecorp.mineralessentials.crystal.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class CrystalItems
{
		public static Item CrystalCrystal;
		
		public static void RegisterCrystalItems()
		{
			CrystalCrystal = new ItemCrystalCrystal();
	    	RegisterHelper.registerItem(CrystalCrystal);
	    	
		}
}