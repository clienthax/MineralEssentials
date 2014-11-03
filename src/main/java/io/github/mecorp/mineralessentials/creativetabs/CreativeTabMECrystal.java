package io.github.mecorp.mineralessentials.creativetabs;

import io.github.mecorp.mineralessentials.cobalt.items.CobaltItems;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 03/11/2014.
 */
public class CreativeTabMECrystal
{
    public static final CreativeTabs MECrystal = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return CrystalItems.CrystalCrystal;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "ME-Crystal";
        }
    };
}