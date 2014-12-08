package io.github.mecorp.mineralessentials.proxy;


import com.jadarstudios.developercapes.DevCapes;
import io.github.mecorp.mineralessentials.reference.Reference;
import io.github.mecorp.mineralessentials.helper.LogHelper;

public class ClientProxy extends CommonProxy
{
    @Override
    public void initCapes()
    {
        DevCapes.getInstance().registerConfig(Reference.DevCapes);
        LogHelper.info("Capes Loaded");
    }
}