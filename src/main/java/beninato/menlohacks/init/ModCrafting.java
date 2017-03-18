package beninato.menlohacks.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{
	public static void register()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.donutBox), "DDD","DDD","DDD",'D',ModItems.donut);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.donutBox), "SSS","WFW","WWW", 'S', Items.SUGAR,'F', Items.WHEAT,'W', Blocks.WOODEN_SLAB);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.donut, 9), new Object[] {"#", '#', ModBlocks.donutBox});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.coffee), "CWC"," P "," B ",'C', ModItems.coffeeBean,'W', new ItemStack(Items.WATER_BUCKET.setContainerItem(Items.BUCKET)), 'P', Items.PAPER,'B', Items.GLASS_BOTTLE);
	}
}
