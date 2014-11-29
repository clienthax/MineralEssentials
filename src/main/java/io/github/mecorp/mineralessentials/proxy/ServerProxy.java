
package io.github.mecorp.mineralessentials.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.machines.furnaces.TileEntityMultiSmelterBlock;

public class ServerProxy extends CommonProxy
{
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityMultiSmelterBlock.class, TileEntityMultiSmelterBlock.publicName);
    }
}