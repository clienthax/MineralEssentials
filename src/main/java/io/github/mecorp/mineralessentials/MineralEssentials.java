package io.github.mecorp.mineralessentials;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.mecorp.mineralessentials.cobalt.Cobalt;
import io.github.mecorp.mineralessentials.copper.Copper;
import io.github.mecorp.mineralessentials.creative.Creative;
import io.github.mecorp.mineralessentials.crystal.Crystal;
import io.github.mecorp.mineralessentials.fakediamond.FakeDiamond;
import io.github.mecorp.mineralessentials.food.Food;
import io.github.mecorp.mineralessentials.generation.ModGeneration;
import io.github.mecorp.mineralessentials.glass.Glass;
import io.github.mecorp.mineralessentials.handler.ConfigHandler;
import io.github.mecorp.mineralessentials.iridium.Iridium;
import io.github.mecorp.mineralessentials.proxy.CommonProxy;
import io.github.mecorp.mineralessentials.reference.Reference;
import io.github.mecorp.mineralessentials.sheep.Sheep;
import io.github.mecorp.mineralessentials.tin.Tin;

/**
 * Created by untamemadman on 8/25/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MineralEssentials
{
    @Mod.Instance(Reference.MOD_ID)
    public static MineralEssentials instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        Copper.RegisterCopper();
        Cobalt.RegisterCobalt();
        Iridium.RegisterIridium();
        Crystal.RegisterCrystal();
        Tin.RegisterTin();
        Creative.RegisterCreative();
        Sheep.RegisterSheep();
        FakeDiamond.RegisterDiamond();
        Glass.RegisterGlass();
        Food.RegisterFood();
        ModGeneration.loadGeneration();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.initCapes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}