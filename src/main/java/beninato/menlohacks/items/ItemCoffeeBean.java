package beninato.menlohacks.items;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import net.minecraft.item.Item;

public class ItemCoffeeBean extends Item
{
	public ItemCoffeeBean()
	{
		setUnlocalizedName(Reference.FirstModItems.COFFEE_BEAN.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.COFFEE_BEAN.getRegistryName());
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}
}
