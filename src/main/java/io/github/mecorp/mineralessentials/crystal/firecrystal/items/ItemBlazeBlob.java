package io.github.mecorp.mineralessentials.crystal.firecrystal.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemBlazeBlob extends Item {
	public ItemBlazeBlob()
	{
		super();
		setUnlocalizedName("BlazeBlob");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}


}
