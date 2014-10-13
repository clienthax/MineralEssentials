package io.github.mecorp.mineralessentials.sheep;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSheepArmor extends ItemArmor {

	public ItemSheepArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== SheepArmor.SheepHelmet || stack.getItem() == SheepArmor.SheepChestplate || stack.getItem() == SheepArmor.SheepBoots)
		{
			return Reference.MOD_ID + ":models/armor/Sheep1.png";
		}
		else if(stack.getItem() == SheepArmor.SheepPants)
		{
			return Reference.MOD_ID + ":models/armor/Sheep2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemSheepArmor");
		return null;
		}
	}
}
