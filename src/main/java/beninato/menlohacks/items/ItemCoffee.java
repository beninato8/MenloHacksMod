package beninato.menlohacks.items;

import beninato.menlohacks.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemCoffee extends ItemFood 
{
	public ItemCoffee() 
	{
		super(1, 1.0F, false);
		setUnlocalizedName(Reference.FirstModItems.COFFEE.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.COFFEE.getRegistryName());
		setPotionEffect(new PotionEffect(Potion.getPotionById(1), 10, 10), 1.0F);
	}
}
