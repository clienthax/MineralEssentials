package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemTinPickaxe extends ItemPickaxe
{

	public ItemTinPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("TinPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabAllSearch);
	}

}
