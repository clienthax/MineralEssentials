package io.github.mecorp.mineralessentials.crystal;

import io.github.mecorp.mineralessentials.crystal.armor.CrystalArmor;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import io.github.mecorp.mineralessentials.crystal.tools.CrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CrystalRecipes 
{
		public static void RegisterCrystalRecipes(){
	       	GameRegistry.addRecipe(new ItemStack(CrystalItems.CrystalCrystal), new Object[]{
				  "XCX",
				  "CXC",
				  "XCX",
				  'X', Items.diamond, 'C', Items.gold_nugget});
	   	    
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalPickaxe), new Object[]{
	   	    	"XXX",
	   	    	" C ",
	   	    	" C ",
	   	    	'X', CrystalItems.CrystalCrystal, 'C', Items.stick});
	   	  
	        GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalAxe), new Object[]{
				  "XX ",
				  "XC ",
				  " C ",
				  'X', CrystalItems.CrystalCrystal, 'C', Items.stick});
	        	
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalHoe), new Object[]{
				  "XX ",
				  " C ",
				  " C ",
				  'X', CrystalItems.CrystalCrystal, 'C', Items.stick});
	       	
	   	    GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalShovel), new Object[]{
				  " X ",
				  " C ",
				  " C ",
				  'X', CrystalItems.CrystalCrystal, 'C', Items.stick});
	   	    
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalSword), new Object[]{
				  " X ",
				  " X ",
				  " C ",
				  'X', CrystalItems.CrystalCrystal, 'C', Items.stick});
	       
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalHelmet), new Object[]{
				  "XXX",
				  "X X",
				  "   ",
				  'X', CrystalItems.CrystalCrystal});
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalChestplate), new Object[]{
				  "X X",
				  "XXX",
				  "XXX",
				  'X', CrystalItems.CrystalCrystal});
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalPants), new Object[]{
				  "XXX",
				  "X X",
				  "X X",
				  'X', CrystalItems.CrystalCrystal});
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalBoots), new Object[]{
				  "   ",
				  "X X",
				  "X X",
				  'X', CrystalItems.CrystalCrystal});
	       	
		}
}
