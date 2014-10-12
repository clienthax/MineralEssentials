package io.github.mecorp.mineralessentials.creative.blocks;

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
}