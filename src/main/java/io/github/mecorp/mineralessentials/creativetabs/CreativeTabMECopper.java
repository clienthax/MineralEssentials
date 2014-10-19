package io.github.mecorp.mineralessentials.creativetabs;

import io.github.mecorp.mineralessentials.copper.items.CopperItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 17/10/2014.
 */
public class CreativeTabMECopper
{
    public static final CreativeTabs MECopper = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return CopperItems.CopperIngot;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "ME-Copper";
        }
    };
}