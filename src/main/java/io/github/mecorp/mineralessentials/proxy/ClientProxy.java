package io.github.mecorp.mineralessentials.proxy;


import io.github.mecorp.mineralessentials.developercapes.DevCapes;
import io.github.mecorp.mineralessentials.reference.Reference;
import io.github.mecorp.mineralessentials.utility.LogHelper;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initCapes()
    {
        DevCapes.getInstance().registerConfig(Reference.DevCapes, Reference.MOD_ID);
        LogHelper.info("Capes Loaded");
    }
}