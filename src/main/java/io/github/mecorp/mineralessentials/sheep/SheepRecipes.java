package io.github.mecorp.mineralessentials.sheep;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class SheepRecipes
{
	public static void RegisterSheepRecipes(){

       	GameRegistry.addRecipe(new ItemStack(SheepBlocks.SheepBlock), new Object[]{
			  "XXX",
			  "XXX",
			  "XXX",
			  'X', Blocks.wool});   		
       	
       	GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepHelmet), new Object[]{
			  "XXX",
			  "X X",
			  "   ",
			  'X', Blocks.wool});
       	
       	GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepChestplate), new Object[]{
			  "X X",
			  "XXX",
			  "XXX",
			  'X', Blocks.wool});
       	
       	GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepPants), new Object[]{
			  "XXX",
			  "X X",
			  "X X",
			  'X', Blocks.wool});
       	
       	GameRegistry.addRecipe(new ItemStack(SheepArmor.SheepBoots), new Object[]{
			  "   ",
			  "X X",
			  "X X",
			  'X', Blocks.wool});
	}
	
}
