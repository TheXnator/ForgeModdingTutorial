package thexnator.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs
{
	public TutorialTab(String label) 
	{
		super(label);
		this.setBackgroundImageName("tutorial.png");
	}

	@Override
	public Item getTabIconItem() 
	{
		return Items.apple;
	}	
}
