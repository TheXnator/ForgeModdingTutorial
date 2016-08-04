package thexnator.tutorialmod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommonProxy 
{
	public void registerRenders()
	{

	}

	public void registerRenderInformation() {}
	
	public World getClientWorld()
	{
		return null;
	}

	public EntityPlayer getClientPlayer()
	{
		return null;
	}
	
	public EntityPlayer getPlayerFromHandler(INetHandler handler) {
		if (handler instanceof NetHandlerPlayServer) return ((NetHandlerPlayServer)handler).playerEntity;

		return null;
	}

	public boolean isSinglePlayer()
	{
		return false;
	}

	public boolean isDedicatedServer()
	{
		return MinecraftServer.getServer().isDedicatedServer();
	}

	public void preInit()
	{
		
	}
	
	public void init()
	{		
		System.out.println("CommonProxy init");;
	}
}
