package beninato.menlohacks;

import beninato.menlohacks.init.ModBlocks;
import beninato.menlohacks.init.ModItems;
import beninato.menlohacks.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, 
name = Reference.NAME, 
version = Reference.VERSION, 
acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FirstMod 
{
	@Instance
	public static FirstMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, 
			serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("PreInit - meoooooowwww");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Init - fishes");
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("PostInit - blublllllllllllllllllll");
	}
}
