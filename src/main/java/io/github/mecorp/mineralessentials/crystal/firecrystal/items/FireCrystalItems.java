package io.github.mecorp.mineralessentials.crystal.firecrystal.items;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;

public class FireCrystalItems
{
	public static Item FireCrystalCrystal;
	public static Item BlazeBlob;
	
	public static void RegisterFireCrystalItems()
	{
		FireCrystalCrystal = new ItemFireCrystalCrystal();
    	RegisterHelper.registerItem(FireCrystalCrystal);
    	
    	BlazeBlob = new ItemBlazeBlob();
    	RegisterHelper.registerItem(BlazeBlob);
	}
}
