package io.github.mecorp.mineralessentials.crystal.firecrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSpade;


public class ItemFireCrystalShovel extends ItemSpade
{

	public ItemFireCrystalShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FireCrystalShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
