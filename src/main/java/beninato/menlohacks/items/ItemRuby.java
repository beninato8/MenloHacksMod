package beninato.menlohacks.items;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import net.minecraft.item.Item;


public class ItemRuby extends Item
{
	public ItemRuby() 
	{
		setUnlocalizedName(Reference.FirstModItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.RUBY.getRegistryName());
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}
}
