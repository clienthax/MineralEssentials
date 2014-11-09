package io.github.mecorp.mineralessentials.copper.ore;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECopper;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;


public class BlockCopperOre extends Block
{
	public BlockCopperOre()
	{
		super(Material.rock);
		setBlockName("CopperOre");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECopper.MECopper);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
        OreDictionary.registerOre("oreCopper", CopperOre);
	}

}
