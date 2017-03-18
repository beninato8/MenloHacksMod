package beninato.menlohacks.init;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting 
{
	public static void register()
	{
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, EnumDyeColor.BROWN.getDyeDamage()), new ItemStack(ModItems.coffeeBean, 4), 0.0F);
	}
}
