package io.github.mecorp.mineralessentials.glass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.mecorp.mineralessentials.copper.blocks.BlockCopperBlock;
import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECopper;
import io.github.mecorp.mineralessentials.reference.Reference;
import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by untamemadman on 26/10/2014.
 */
public class BlockGlassBlock extends Block
{
    public BlockGlassBlock()
    {
        super(Material.glass);
        setBlockName("GlassBlock");
        setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabAllSearch);
        setStepSound(soundTypeGlass);
        setHardness(5.0F);
        setResistance(10.0F);
    }
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    public boolean isOpaqueCube ()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
}