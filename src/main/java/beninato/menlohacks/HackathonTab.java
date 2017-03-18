package beninato.menlohacks;

import beninato.menlohacks.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HackathonTab extends CreativeTabs 
{

	public HackathonTab() 
	{
		super("tabHackathon");
	}

	@Override
	public Item getTabIconItem() 
	{
		return ModItems.donut;
	}

}
