package io.github.mecorp.mineralessentials.crystal.aircrystal;

import io.github.mecorp.mineralessentials.crystal.aircrystal.armor.AirCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.aircrystal.items.AirCrystalItems;
import io.github.mecorp.mineralessentials.crystal.aircrystal.tools.AirCrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class AirCrystalRecipes
{
	public static void RegisterAirCrystalRecipes(){
       	GameRegistry.addRecipe(new ItemStack(AirCrystalItems.AirCrystalCrystal), new Object[]{
			  "XXX",
			  "XCX",
			  "XXX",
			  'X', Items.feather, 'C', CrystalItems.CrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalPickaxe), new Object[]{
                "XXX",
                " C ",
                " C ",
                'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalAxe), new Object[]{
                "XX ",
                "XC ",
                " C ",
                'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalHoe), new Object[]{
                "XX ",
                " C ",
                " C ",
                'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalShovel), new Object[]{
                " X ",
                " C ",
                " C ",
                'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalSword), new Object[]{
                " X ",
                " X ",
                " C ",
                'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalHelmet), new Object[]{
                "XXX",
                "X X",
                "   ",
                'X', AirCrystalItems.AirCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalChestplate), new Object[]{
                "X X",
                "XXX",
                "XXX",
                'X', AirCrystalItems.AirCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalPants), new Object[]{
                "XXX",
                "X X",
                "X X",
                'X', AirCrystalItems.AirCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalBoots), new Object[]{
                "   ",
                "X X",
                "X X",
                'X', AirCrystalItems.AirCrystalCrystal});
	}
}
