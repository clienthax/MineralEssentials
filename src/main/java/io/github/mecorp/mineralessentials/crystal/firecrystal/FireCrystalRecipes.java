package io.github.mecorp.mineralessentials.crystal.firecrystal;

import io.github.mecorp.mineralessentials.crystal.armor.CrystalArmor;
import io.github.mecorp.mineralessentials.crystal.firecrystal.armor.FireCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.firecrystal.tools.FireCrystalTools;
import io.github.mecorp.mineralessentials.crystal.tools.CrystalTools;
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

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalPickaxe), new Object[]{
                "XXX",
                " C ",
                " C ",
                'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalAxe), new Object[]{
                "XX ",
                "XC ",
                " C ",
                'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalHoe), new Object[]{
                "XX ",
                " C ",
                " C ",
                'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalShovel), new Object[]{
                " X ",
                " C ",
                " C ",
                'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalSword), new Object[]{
                " X ",
                " X ",
                " C ",
                'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick});

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalHelmet), new Object[]{
                "XXX",
                "X X",
                "   ",
                'X', FireCrystalItems.FireCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalChestplate), new Object[]{
                "X X",
                "XXX",
                "XXX",
                'X', FireCrystalItems.FireCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalPants), new Object[]{
                "XXX",
                "X X",
                "X X",
                'X', FireCrystalItems.FireCrystalCrystal});

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalBoots), new Object[]{
                "   ",
                "X X",
                "X X",
                'X', FireCrystalItems.FireCrystalCrystal});
	}
}
