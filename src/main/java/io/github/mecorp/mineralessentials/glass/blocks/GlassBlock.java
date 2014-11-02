package io.github.mecorp.mineralessentials.glass.blocks;

import io.github.mecorp.mineralessentials.copper.blocks.BlockCopperBlock;
import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;

/**
 * Created by untamemadman on 26/10/2014.
 */
public class GlassBlock
{

    public static Block GlassBlock;

    public static void RegisterGlassBlocks()
    {
        GlassBlock = new BlockGlassBlock().setBlockName("GlassBlock");
        RegisterHelper.registerBlock(GlassBlock);
    }
}
