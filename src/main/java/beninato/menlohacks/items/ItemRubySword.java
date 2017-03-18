package beninato.menlohacks.items;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import net.minecraft.item.ItemSword;

public class ItemRubySword extends ItemSword
{

	public ItemRubySword(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(Reference.FirstModItems.RUBY_SWORD.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.RUBY_SWORD.getRegistryName());
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}

}
