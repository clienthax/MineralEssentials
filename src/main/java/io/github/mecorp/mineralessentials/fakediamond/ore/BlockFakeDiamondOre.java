package io.github.mecorp.mineralessentials.fakediamond.ore;

import io.github.mecorp.mineralessentials.fakediamond.items.FakeDiamondItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Random;


public class BlockFakeDiamondOre extends Block
{
	public BlockFakeDiamondOre()
	{
		super(Material.rock);
		setBlockName("FakeDiamondOre");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}

    /*
    public int idDropped(int i, Random random, int j)
    {
        return FakeDiamondItems.FakeDiamond;
    }
    */
}
