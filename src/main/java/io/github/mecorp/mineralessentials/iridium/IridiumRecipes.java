package io.github.mecorp.mineralessentials.iridium;

import io.github.mecorp.mineralessentials.iridium.armor.IridiumArmor;
import io.github.mecorp.mineralessentials.iridium.blocks.IridiumBlocks;
import io.github.mecorp.mineralessentials.iridium.items.IridiumItems;
import io.github.mecorp.mineralessentials.iridium.ore.IridiumOres;
import io.github.mecorp.mineralessentials.iridium.tools.IridiumTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class IridiumRecipes
{
	public static void RegisterIridiumRecipes(){

   		GameRegistry.addSmelting(IridiumOres.IridiumOre, new ItemStack(IridiumItems.IridiumIngot, 1), 10);

   	    GameRegistry.addRecipe(new ItemStack(IridiumTools.IridiumPickaxe), new Object[]{
   	    	"XXX",
   	    	" C ",
   	    	" C ",
   	    	'X', IridiumItems.IridiumIngot, 'C', Items.stick});
   	  
        GameRegistry.addRecipe(new ItemStack(IridiumTools.IridiumAxe), new Object[]{
			  "XX ",
			  "XC ",
			  " C ",
			  'X', IridiumItems.IridiumIngot, 'C', Items.stick});
        	
       	GameRegistry.addRecipe(new ItemStack(IridiumTools.IridiumHoe), new Object[]{
			  "XX ",
			  " C ",
			  " C ",
			  'X', IridiumItems.IridiumIngot, 'C', Items.stick});
       	
   	    GameRegistry.addRecipe(new ItemStack(IridiumTools.IridiumShovel), new Object[]{
			  " X ",
			  " C ",
			  " C ",
			  'X', IridiumItems.IridiumIngot, 'C', Items.stick});
   	    
       	GameRegistry.addRecipe(new ItemStack(IridiumTools.IridiumSword), new Object[]{
			  " X ",
			  " X ",
			  " C ",
			  'X', IridiumItems.IridiumIngot, 'C', Items.stick});
       	
       	GameRegistry.addRecipe(new ItemStack(IridiumBlocks.IridiumBlock), new Object[]{
			  "XXX",
			  "XXX",
			  "XXX",
			  'X', IridiumItems.IridiumIngot});
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(IridiumItems.IridiumIngot), new Object[]{new ItemStack(IridiumBlocks.IridiumBlock)});
       	
       	GameRegistry.addRecipe(new ItemStack(IridiumArmor.IridiumHelmet), new Object[]{
			  "XXX",
			  "X X",
			  "   ",
			  'X', IridiumItems.IridiumIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(IridiumArmor.IridiumChestplate), new Object[]{
			  "X X",
			  "XXX",
			  "XXX",
			  'X', IridiumItems.IridiumIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(IridiumArmor.IridiumPants), new Object[]{
			  "XXX",
			  "X X",
			  "X X",
			  'X', IridiumItems.IridiumIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(IridiumArmor.IridiumBoots), new Object[]{
			  "   ",
			  "X X",
			  "X X",
			  'X', IridiumItems.IridiumIngot});
	}
}
