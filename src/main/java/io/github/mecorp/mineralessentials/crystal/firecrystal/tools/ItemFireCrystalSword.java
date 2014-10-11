package io.github.mecorp.mineralessentials.crystal.firecrystal.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;


public class ItemFireCrystalSword extends ItemSword
{

	public ItemFireCrystalSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FireCrystalSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
