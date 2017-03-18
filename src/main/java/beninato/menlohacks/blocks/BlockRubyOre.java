package beninato.menlohacks.blocks;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRubyOre extends Block
{

	public BlockRubyOre() 
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.FirstModBlocks.RUBY_ORE.getUnlocalizedName());
		setRegistryName(Reference.FirstModBlocks.RUBY_ORE.getRegistryName());
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}

}
