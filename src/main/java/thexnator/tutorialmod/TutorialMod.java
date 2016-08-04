package thexnator.tutorialmod;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thexnator.tutorialmod.init.TutorialBlocks;
import thexnator.tutorialmod.init.TutorialItems;
import thexnator.tutorialmod.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MC_VERSION)
public class TutorialMod 
{
	@Instance(Reference.MODID)
	public static TutorialMod instance;
	
	@SidedProxy(modId=Reference.MODID, clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final TutorialTab tabTutorial = new TutorialTab("tabTutorial");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		TutorialBlocks.init();
		TutorialBlocks.register();
		TutorialItems.init();
		TutorialItems.register();
		//TutorialTileEntities.register();
		
		proxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		OBJLoader.instance.addDomain("tm");
		proxy.registerRenderInformation();
		proxy.registerRenders();
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
