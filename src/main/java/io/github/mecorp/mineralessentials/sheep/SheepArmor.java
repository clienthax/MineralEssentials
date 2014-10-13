package io.github.mecorp.mineralessentials.sheep;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SheepArmor {
	
	static ArmorMaterial SheepArmorMaterial = EnumHelper.addArmorMaterial("SheepArmorMaterial", 0, new int[]{1, 1, 1, 1}, 0);
    public static Item SheepHelmet;
    public static Item SheepChestplate;
    public static Item SheepPants;
    public static Item SheepBoots;

	public static void RegisterSheepArmor(){
		
		SheepHelmet = new ItemSheepArmor(SheepArmorMaterial, 0, "SheepHelmet");
	    RegisterHelper.registerItem(SheepHelmet);
	    
	    SheepChestplate = new ItemSheepArmor(SheepArmorMaterial, 1, "SheepChestplate");
	    RegisterHelper.registerItem(SheepChestplate);
	    
	    SheepPants = new ItemSheepArmor(SheepArmorMaterial, 2, "SheepPants");
	    RegisterHelper.registerItem(SheepPants);
	    
	    SheepBoots = new ItemSheepArmor(SheepArmorMaterial, 3, "SheepBoots");
	    RegisterHelper.registerItem(SheepBoots);
	    
	}

	
}
