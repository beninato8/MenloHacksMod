package beninato.menlohacks.init;

import beninato.menlohacks.items.ItemCoffee;
import beninato.menlohacks.items.ItemCoffeeBean;
import beninato.menlohacks.items.ItemDonut;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item donut;
	public static Item coffee;
	public static Item coffeeBean;
	
	public static void init()
	{
		donut = new ItemDonut();
		coffee = new ItemCoffee();
		coffeeBean = new ItemCoffeeBean();
	}
	
	public static void register()
	{
		GameRegistry.register(donut);
		GameRegistry.register(coffee);
		GameRegistry.register(coffeeBean);
	}
	
	public static void registerRenders()
	{
		registerRender(donut);
		registerRender(coffee);
		registerRender(coffeeBean);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
