package io.github.mecorp.mineralessentials.crystal.firecrystal;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.firecrystal.items.FireCrystalItems;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class FireCrystalRecipes
{
	public static void RegisterFireCrystalRecipes(){
       	GameRegistry.addRecipe(new ItemStack(FireCrystalItems.BlazeBlob), new Object[]{
			  "   ",
			  " XX",
			  " XX",
			  'X', Items.blaze_powder});
       	
       	GameRegistry.addRecipe(new ItemStack(FireCrystalItems.FireCrystalCrystal), new Object[]{
			  " X ",
			  "XCX",
			  " X ",
			  'X', FireCrystalItems.BlazeBlob, 'C', CrystalItems.CrystalCrystal});
       	
	}
}
