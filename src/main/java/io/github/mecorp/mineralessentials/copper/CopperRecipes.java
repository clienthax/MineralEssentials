package io.github.mecorp.mineralessentials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.copper.blocks.CopperBlocks;
import io.github.mecorp.mineralessentials.copper.items.CopperItems;
import io.github.mecorp.mineralessentials.copper.ore.CopperOre;
import io.github.mecorp.mineralessentials.copper.tools.CopperTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class CopperRecipes
{
	public static void RegisterCopperRecipes(){

   		GameRegistry.addSmelting(CopperOre.CopperOre, new ItemStack(CopperItems.CopperIngot, 1), 10);

   	    GameRegistry.addRecipe(new ItemStack(CopperTools.CopperPickaxe), new Object[]{
   	    	"XXX",
   	    	" C ",
   	    	" C ",
   	    	'X', CopperItems.CopperIngot, 'C', Items.stick});
   	  
        GameRegistry.addRecipe(new ItemStack(CopperTools.CopperAxe), new Object[]{
			  "XX ",
			  "XC ",
			  " C ",
			  'X', CopperItems.CopperIngot, 'C', Items.stick});
        	
       	GameRegistry.addRecipe(new ItemStack(CopperTools.CopperHoe), new Object[]{
			  "XX ",
			  " C ",
			  " C ",
			  'X', CopperItems.CopperIngot, 'C', Items.stick});
       	
   	    GameRegistry.addRecipe(new ItemStack(CopperTools.CopperShovel), new Object[]{
			  " X ",
			  " C ",
			  " C ",
			  'X', CopperItems.CopperIngot, 'C', Items.stick});
   	    
       	GameRegistry.addRecipe(new ItemStack(CopperTools.CopperSword), new Object[]{
			  " X ",
			  " X ",
			  " C ",
			  'X', CopperItems.CopperIngot, 'C', Items.stick});
       	
       	GameRegistry.addRecipe(new ItemStack(CopperBlocks.CopperBlock), new Object[]{
			  "XXX",
			  "XXX",
			  "XXX",
			  'X', CopperItems.CopperIngot});
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(CopperItems.CopperIngot), new Object[]{new ItemStack(CopperBlocks.CopperBlock)});
       	
       /*	GameRegistry.addRecipe(new ItemStack(CopperArmor.CopperHelmet), new Object[]{
			  "XXX",
			  "X X",
			  "   ",
			  'X', CopperItems.CopperIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CopperArmor.CopperChestplate), new Object[]{
			  "X X",
			  "XXX",
			  "XXX",
			  'X', CopperItems.CopperIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CopperArmor.CopperPants), new Object[]{
			  "XXX",
			  "X X",
			  "X X",
			  'X', CopperItems.CopperIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CopperArmor.CopperBoots), new Object[]{
			  "   ",
			  "X X",
			  "X X",
			  'X', CopperItems.CopperIngot});*/
	}
}
