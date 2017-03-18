package beninato.menlohacks.blocks;

import beninato.menlohacks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDonutBox extends Block {

	public BlockDonutBox() 
	{
		super(Material.CAKE);
		setUnlocalizedName(Reference.FirstModBlocks.DONUTBOX.getUnlocalizedName());
		setRegistryName(Reference.FirstModBlocks.DONUTBOX.getRegistryName());
		setHardness(2.333F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setLightLevel(1.0F);
		setHarvestLevel("itemShovel", 0);
		setSoundType(SoundType.SLIME);
	}

}
