package beninato.menlohacks;

public class Reference 
{
	public static final String MOD_ID = "menlohacksmod";
	public static final String NAME = "First Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";

	public static final String CLIENT_PROXY_CLASS = "beninato.menlohacks.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "beninato.menlohacks.proxy.ServerProxy";

	public static enum FirstModItems 
	{ 
		DONUT("donut", "ItemDonut"),
		COFFEE("coffee", "ItemCoffee"),
		COFFEE_BEAN("coffeeBean", "ItemCoffeeBean"),
		RUBY("ruby", "ItemRuby"),
		RUBY_SWORD("rubySword", "ItemRubySword");

		private String unlocalizedName;
		private String registryName;
		FirstModItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}

		public String getRegistryName() 
		{
			return registryName;
		}
	}
	
	public static enum FirstModBlocks
	{
		DONUT_BOX("donutBox", "BlockDonutBox"),
		RUBY_ORE("rubyOre", "BlockRubyOre");
		
		private String unlocalizedName;
		private String registryName;
		FirstModBlocks(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}

		public String getRegistryName() 
		{
			return registryName;
		}
	}
}
