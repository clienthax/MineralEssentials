package io.github.mecorp.mineralessentials.crystal;

import io.github.mecorp.mineralessentials.crystal.armor.CrystalArmor;
import io.github.mecorp.mineralessentials.crystal.firecrystal.FireCrystal;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import io.github.mecorp.mineralessentials.crystal.tools.CrystalTools;

public class Crystal
{
	public static void RegisterCrystal(){
		CrystalItems.RegisterCrystalItems();
		CrystalTools.RegisterCrystalTools();
		CrystalArmor.RegisterCrystalArmor();
		CrystalRecipes.RegisterCrystalRecipes();
		FireCrystal.RegisterFireCrystal();
	}
}
