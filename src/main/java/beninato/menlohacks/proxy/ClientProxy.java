package beninato.menlohacks.proxy;

import beninato.menlohacks.init.ModBlocks;
import beninato.menlohacks.init.ModItems;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() 
	{
		ModBlocks.registerRenders();
		ModItems.registerRenders();
	}

}
