package io.github.mecorp.mineralessentials.creative.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by untamemadman on 12/10/2014.
 */
public class BlockWindows  extends Block
{
    public BlockWindows()
    {
        super(Material.rock);
        setBlockName("Windows");
        setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabAllSearch);
        setLightLevel(1.0F);
        setBlockUnbreakable();
        setResistance(6000000.0F);
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