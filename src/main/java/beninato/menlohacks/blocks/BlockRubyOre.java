package beninato.menlohacks.blocks;

import java.util.Random;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.Reference;
import beninato.menlohacks.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block
{

	public BlockRubyOre() 
	{
		super(Material.IRON);
		setUnlocalizedName(Reference.FirstModBlocks.RUBY_ORE.getUnlocalizedName());
		setRegistryName(Reference.FirstModBlocks.RUBY_ORE.getRegistryName());
		setCreativeTab(FirstMod.CREATIVE_TAB);
		setHardness(2.0F);
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.ruby;
    }
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return this.quantityDropped(random) * (fortune + 1);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1;
    }

}
