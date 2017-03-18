package beninato.menlohacks.blocks;

import java.util.Random;

import beninato.menlohacks.FirstMod;
import beninato.menlohacks.HackathonTab;
import beninato.menlohacks.Reference;
import beninato.menlohacks.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockDonutBox extends Block {

	public BlockDonutBox() 
	{
		super(Material.CAKE);
		setUnlocalizedName(Reference.FirstModBlocks.DONUT_BOX.getUnlocalizedName());
		setRegistryName(Reference.FirstModBlocks.DONUT_BOX.getRegistryName());
		setHardness(0.333F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setLightLevel(1.0F);
		setHarvestLevel("itemShovel", 0);
		setSoundType(SoundType.SLIME);
		setCreativeTab(FirstMod.CREATIVE_TAB);
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.donut;
    }
	public int quantityDropped(Random random)
    {
        return 9;
    }
}
