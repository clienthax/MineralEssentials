package io.github.mecorp.mineralessentials.crystal.earthcrystal;

import io.github.mecorp.mineralessentials.crystal.earthcrystal.armor.EarthCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.items.EarthCrystalItems;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.tools.EarthCrystalTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class EarthCrystalRecipes
{
	public static void RegisterEarthCrystalRecipes(){

       	GameRegistry.addRecipe(new ItemStack(EarthCrystalItems.EarthCrystalCrystal), new Object[]{
			  " X ",
			  "XCX",
			  " X ",
			  'X', Blocks.dirt, 'C', CrystalItems.CrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalPickaxe), new Object[]{
                "XXX",
                " C ",
                " C ",
                'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalAxe), new Object[]{
                "XX ",
                "XC ",
                " C ",
                'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalHoe), new Object[]{
                "XX ",
                " C ",
                " C ",
                'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalShovel), new Object[]{
                " X ",
                " C ",
                " C ",
                'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalSword), new Object[]{
                " X ",
                " X ",
                " C ",
                'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalHelmet), new Object[]{
                "XXX",
                "X X",
                "   ",
                'X', EarthCrystalItems.EarthCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalChestplate), new Object[]{
                "X X",
                "XXX",
                "XXX",
                'X', EarthCrystalItems.EarthCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalPants), new Object[]{
                "XXX",
                "X X",
                "X X",
                'X', EarthCrystalItems.EarthCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalBoots), new Object[]{
                "   ",
                "X X",
                "X X",
                'X', EarthCrystalItems.EarthCrystalCrystal});
	}
}
