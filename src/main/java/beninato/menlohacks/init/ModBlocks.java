package beninato.menlohacks.init;

import beninato.menlohacks.blocks.BlockDonutBox;
import beninato.menlohacks.blocks.BlockRubyOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	
	public static Block donutBox;
	public static Block rubyOre;
	
	public static void init()
	{
		donutBox = new BlockDonutBox();
		rubyOre = new BlockRubyOre();
	}
	
	public static void register()
	{
		registerBlock(donutBox);
		registerBlock(rubyOre);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(donutBox);
		GameRegistry.register(rubyOre);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(donutBox);
		registerRender(rubyOre);
	}
	
	private static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
