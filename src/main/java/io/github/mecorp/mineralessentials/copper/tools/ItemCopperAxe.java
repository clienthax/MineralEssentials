package io.github.mecorp.mineralessentials.copper.tools;

//import pw.block_breaking_games.mineral_essentials.creativetabs.ModCreativeTabs;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCopperAxe extends ItemAxe
{
	
    public ItemCopperAxe(ToolMaterial material)
    {
	super(material);
	setUnlocalizedName("CopperAxe");
	setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	//setCreativeTab(ModCreativeTabs.tabMineralEssentials);
    }

}
