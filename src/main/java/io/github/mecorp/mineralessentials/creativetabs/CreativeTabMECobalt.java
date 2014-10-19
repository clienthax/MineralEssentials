package io.github.mecorp.mineralessentials.creativetabs;

import io.github.mecorp.mineralessentials.cobalt.items.CobaltItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 17/10/2014.
 */
public class CreativeTabMECobalt
{
    public static final CreativeTabs MECobalt = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return CobaltItems.CobaltIngot;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "ME-Cobalt";
        }
    };
}