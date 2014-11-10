package io.github.mecorp.mineralessentials.glass.blocks;

import io.github.mecorp.mineralessentials.utility.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by untamemadman on 26/10/2014.
 */

public class GlassBlock
{

    public static Block ClearGlassBlock;
    public static Block MECorpClearGlass;

    public static void RegisterGlassBlocks()
    {
        ClearGlassBlock = new BlockGlassBlock().setBlockName("ClearGlassBlock");
        RegisterHelper.registerBlock(ClearGlassBlock);
        OreDictionary.registerOre("blockGlass", new ItemStack(ClearGlassBlock));

        MECorpClearGlass = new BlockMECorpGlass().setBlockName("MECorpClearGlass");
        RegisterHelper.registerBlock(MECorpClearGlass);
        OreDictionary.registerOre("blockGlass", new ItemStack(MECorpClearGlass));
    }
}
