package io.github.mecorp.mineralessentials.crystal.watercrystal.items;

import io.github.mecorp.mineralessentials.crystal.firecrystal.items.*;
import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class WaterCrystalItems
{
	public static Item WaterCrystalCrystal;
	
	public static void RegisterWaterCrystalItems()
	{
        WaterCrystalCrystal = new ItemWaterCrystalCrystal();
    	RegisterHelper.registerItem(WaterCrystalCrystal);

	}
}
