package beninato.menlohacks.items;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemCoffee extends ItemFood 
{
	public ItemCoffee() 
	{
		super(0, 0.0F, false);
		setUnlocalizedName(Reference.FirstModItems.COFFEE.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.COFFEE.getRegistryName());
		setPotionEffect(new PotionEffect(Potion.getPotionById(1), 50, 10), 1.0F);
		setAlwaysEdible();
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}
	
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.DRINK;
	}
}
