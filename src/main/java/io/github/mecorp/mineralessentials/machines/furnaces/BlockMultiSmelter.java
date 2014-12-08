package io.github.mecorp.mineralessentials.machines.furnaces;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by untamemadman on 23/11/2014.
 */

public class BlockMultiSmelter extends Block implements ITileEntityProvider
{
    public BlockMultiSmelter()
    {
        super(Material.rock);
		setUnlocalizedName("MultiSmelterBlock");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
        setStepSound(soundTypePiston);
        setHardness(3.5F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityMultiSmelterBlock();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
}
