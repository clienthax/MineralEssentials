package io.github.mecorp.mineralessentials;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.mecorp.mineralessentials.copper.Copper;
import io.github.mecorp.mineralessentials.copper.blocks.CopperBlocks;
import io.github.mecorp.mineralessentials.handler.ConfigHandler;
import io.github.mecorp.mineralessentials.proxy.CommonProxy;
import io.github.mecorp.mineralessentials.reference.Reference;

/**
 * Created by Sam on 8/25/2014.
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
        Copper.RegisterCopper();
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