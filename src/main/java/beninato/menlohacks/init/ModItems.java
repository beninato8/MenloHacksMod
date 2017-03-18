package beninato.menlohacks.init;

import beninato.menlohacks.items.ItemCoffee;
import beninato.menlohacks.items.ItemCoffeeBean;
import beninato.menlohacks.items.ItemDonut;
import beninato.menlohacks.items.ItemRuby;
import beninato.menlohacks.items.ItemRubySword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item donut;
	public static Item coffee;
	public static Item coffeeBean;
	public static Item ruby;
	public static ToolMaterial RUBY = EnumHelper.addToolMaterial("ruby", 3, 2048, 16.0F, 12.0F, 3000);
	public static ItemSword rubySword;
	
	public static void init()
	{
		donut = new ItemDonut();
		coffee = new ItemCoffee();
		coffeeBean = new ItemCoffeeBean();
		ruby = new ItemRuby();
		rubySword = new ItemRubySword(RUBY);
	}
	
	public static void register()
	{
		GameRegistry.register(donut);
		GameRegistry.register(coffee);
		GameRegistry.register(coffeeBean);
		GameRegistry.register(ruby);
		GameRegistry.register(rubySword);
	}
	
	public static void registerRenders()
	{
		registerRender(donut);
		registerRender(coffee);
		registerRender(coffeeBean);
		registerRender(ruby);
		registerRender(rubySword);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
