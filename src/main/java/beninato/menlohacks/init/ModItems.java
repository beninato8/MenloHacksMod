package beninato.menlohacks.init;

import beninato.menlohacks.Reference;
import beninato.menlohacks.items.ItemDonut;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	
	public static Item donut;
	
	public static void init()
	{
		donut = new ItemDonut();
	}
	
	public static void register()
	{
		GameRegistry.register(donut);
	}
	
	public static void registerRenders()
	{
		registerRender(donut);
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
