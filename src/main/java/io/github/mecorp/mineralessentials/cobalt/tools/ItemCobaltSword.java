package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;


public class ItemCobaltSword extends ItemSword
{

	public ItemCobaltSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CobaltSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
