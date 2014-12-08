package io.github.mecorp.mineralessentials.steel;

import io.github.mecorp.mineralessentials.steel.armor.SteelArmor;
import io.github.mecorp.mineralessentials.steel.blocks.SteelBlocks;
import io.github.mecorp.mineralessentials.steel.items.SteelItems;
import io.github.mecorp.mineralessentials.steel.ore.SteelOres;
import io.github.mecorp.mineralessentials.steel.tools.SteelTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class SteelRecipes
{
    public static void RegisterSteelRecipes(){

        GameRegistry.addSmelting(SteelOres.SteelOre, new ItemStack(SteelItems.SteelIngot, 1), 10);

        GameRegistry.addRecipe(new ItemStack(SteelTools.SteelPickaxe), "XXX",
				" C ",
				" C ",
				'X', SteelItems.SteelIngot, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(SteelTools.SteelAxe), "XX ",
				"XC ",
				" C ",
				'X', SteelItems.SteelIngot, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(SteelTools.SteelHoe), "XX ",
				" C ",
				" C ",
				'X', SteelItems.SteelIngot, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(SteelTools.SteelShovel), " X ",
				" C ",
				" C ",
				'X', SteelItems.SteelIngot, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(SteelTools.SteelSword), " X ",
				" X ",
				" C ",
				'X', SteelItems.SteelIngot, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(SteelBlocks.SteelBlock), "XXX",
				"XXX",
				"XXX",
				'X', SteelItems.SteelIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(SteelItems.SteelIngot), new ItemStack(SteelBlocks.SteelBlock));

        GameRegistry.addRecipe(new ItemStack(SteelArmor.SteelHelmet), "XXX",
				"X X",
				"   ",
				'X', SteelItems.SteelIngot);

        GameRegistry.addRecipe(new ItemStack(SteelArmor.SteelChestplate), "X X",
				"XXX",
				"XXX",
				'X', SteelItems.SteelIngot);

        GameRegistry.addRecipe(new ItemStack(SteelArmor.SteelPants), "XXX",
				"X X",
				"X X",
				'X', SteelItems.SteelIngot);

        GameRegistry.addRecipe(new ItemStack(SteelArmor.SteelBoots), "   ",
				"X X",
				"X X",
				'X', SteelItems.SteelIngot);
    }
}
