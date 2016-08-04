package thexnator.tutorialmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thexnator.tutorialmod.Reference;
import thexnator.tutorialmod.TutorialMod;

public class TutorialItems 
{
	public static Item cheese;
	
	public static void init()
	{
		cheese = new Item().setUnlocalizedName("cheese").setCreativeTab(TutorialMod.tabTutorial);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(cheese);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
