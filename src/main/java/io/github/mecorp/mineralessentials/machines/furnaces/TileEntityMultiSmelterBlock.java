package io.github.mecorp.mineralessentials.machines.furnaces;

import io.github.mecorp.mineralessentials.MineralEssentials;
import io.github.mecorp.mineralessentials.client.gui.GUIs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by untamemadman on 23/11/2014.
 */

public class TileEntityMultiSmelterBlock extends TileEntity
{
    int tick = 100;

    public static final String publicName = "tileEntityMultiSmelterBlock";
    private String name = "tileEntityMultiSmelterBlock";

    public String getName()
    {
        return name;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(MineralEssentials.instances, GUIs.MultiSmelter.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
}
