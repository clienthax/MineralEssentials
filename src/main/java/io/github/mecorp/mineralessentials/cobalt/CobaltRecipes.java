package io.github.mecorp.mineralessentials.cobalt;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.cobalt.armor.CobaltArmor;
import io.github.mecorp.mineralessentials.cobalt.blocks.CobaltBlocks;
import io.github.mecorp.mineralessentials.cobalt.items.CobaltItems;
import io.github.mecorp.mineralessentials.cobalt.ore.CobaltOres;
import io.github.mecorp.mineralessentials.cobalt.tools.CobaltTools;
import cpw.mods.fml.common.registry.GameRegistry;

public class CobaltRecipes
{
	public static void RegisterCobaltRecipes(){

   		GameRegistry.addSmelting(CobaltOres.CobaltOre, new ItemStack(CobaltItems.CobaltIngot, 1), 10);

   	    GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltPickaxe), new Object[]{
   	    	"XXX",
   	    	" C ",
   	    	" C ",
   	    	'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod});
   	  
        GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltAxe), new Object[]{
			  "XX ",
			  "XC ",
			  " C ",
			  'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod});
        	
       	GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltHoe), new Object[]{
			  "XX ",
			  " C ",
			  " C ",
			  'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod});
       	
   	    GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltShovel), new Object[]{
			  " X ",
			  " C ",
			  " C ",
			  'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod});
   	    
       	GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltSword), new Object[]{
			  " X ",
			  " X ",
			  " C ",
			  'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod});
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltBlocks.CobaltBlock), new Object[]{
			  "XXX",
			  "XXX",
			  "XXX",
			  'X', CobaltItems.CobaltIngot});
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(CobaltItems.CobaltIngot), new Object[]{new ItemStack(CobaltBlocks.CobaltBlock)});
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltHelmet), new Object[]{
			  "XXX",
			  "X X",
			  "   ",
			  'X', CobaltItems.CobaltIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltChestplate), new Object[]{
			  "X X",
			  "XXX",
			  "XXX",
			  'X', CobaltItems.CobaltIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltPants), new Object[]{
			  "XXX",
			  "X X",
			  "X X",
			  'X', CobaltItems.CobaltIngot});
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltBoots), new Object[]{
			  "   ",
			  "X X",
			  "X X",
			  'X', CobaltItems.CobaltIngot});
	}
}
