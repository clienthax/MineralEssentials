package io.github.mecorp.mineralessentials.tin;

import io.github.mecorp.mineralessentials.tin.armor.TinArmor;
import io.github.mecorp.mineralessentials.tin.blocks.TinBlocks;
import io.github.mecorp.mineralessentials.tin.items.TinItems;
import io.github.mecorp.mineralessentials.tin.ore.TinOre;
import io.github.mecorp.mineralessentials.tin.tools.TinTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TinRecipes
{

	public static void RegisterTinRecipes(){

   		GameRegistry.addSmelting(TinOre.TinOre, new ItemStack(TinItems.TinIngot, 1), 10);

   	    GameRegistry.addRecipe(new ItemStack(TinTools.TinPickaxe), new Object[]{
   	    	"XXX",
   	    	" C ",
   	    	" C ",
   	    	'X', TinItems.TinIngot, 'C', Items.stick});
   	  
        GameRegistry.addRecipe(new ItemStack(TinTools.TinAxe), new Object[]{
			  "XX ",
			  "XC ",
			  " C ",
			  'X', TinItems.TinIngot, 'C', Items.stick});
        	
       	GameRegistry.addRecipe(new ItemStack(TinTools.TinHoe), new Object[]{
			  "XX ",
			  " C ",
			  " C ",
			  'X', TinItems.TinIngot, 'C', Items.stick});
       	
   	    GameRegistry.addRecipe(new ItemStack(TinTools.TinShovel), new Object[]{
			  " X ",
			  " C ",
			  " C ",
			  'X', TinItems.TinIngot, 'C', Items.stick});
   	    
       	GameRegistry.addRecipe(new ItemStack(TinTools.TinSword), new Object[]{
			  " X ",
			  " X ",
			  " C ",
			  'X', TinItems.TinIngot, 'C', Items.stick});
       	
       	GameRegistry.addRecipe(new ItemStack(TinBlocks.TinBlock), new Object[]{
			  "XXX",
			  "XXX",
			  "XXX",
			  'X', TinItems.TinIngot});
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(TinItems.TinIngot), new Object[]{new ItemStack(TinBlocks.TinBlock)});
       	
       	GameRegistry.addRecipe(new ItemStack(TinArmor.TinHelmet), new Object[]{
			  "XXX",
			  "X X",
			  "   ",
			  'X', TinItems.TinIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(TinArmor.TinChestplate), new Object[]{
			  "X X",
			  "XXX",
			  "XXX",
			  'X', TinItems.TinIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(TinArmor.TinPants), new Object[]{
			  "XXX",
			  "X X",
			  "X X",
			  'X', TinItems.TinIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(TinArmor.TinBoots), new Object[]{
			  "   ",
			  "X X",
			  "X X",
			  'X', TinItems.TinIngot});
	}
}
