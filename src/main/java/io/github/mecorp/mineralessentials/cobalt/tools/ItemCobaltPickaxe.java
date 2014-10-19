package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECobalt;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemCobaltPickaxe extends ItemPickaxe
{

	public ItemCobaltPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CobaltPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECobalt.MECobalt);
	}

}
