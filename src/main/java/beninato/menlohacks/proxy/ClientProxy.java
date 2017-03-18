package beninato.menlohacks.proxy;

import beninato.menlohacks.init.ModItems;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		ModItems.registerRenders();
	}

}
