package thexnator.tutorialmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thexnator.tutorialmod.Reference;
import thexnator.tutorialmod.TutorialMod;

public class TutorialBlocks
{
public static Block cheeseblock;
	
	public static void init()
	{
		cheeseblock = new Block(Material.cloth).setUnlocalizedName("cheeseblock").setCreativeTab(TutorialMod.tabTutorial);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(cheeseblock, cheeseblock.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(cheeseblock);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
