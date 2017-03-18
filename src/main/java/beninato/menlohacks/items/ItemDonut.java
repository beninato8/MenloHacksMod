package beninato.menlohacks.items;

import beninato.menlohacks.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemDonut extends ItemFood
{
	public ItemDonut() 
	{
		super(5, 10f, false);
		setUnlocalizedName(Reference.FirstModItems.DONUT.getUnlocalizedName());
		setRegistryName(Reference.FirstModItems.DONUT.getRegistryName());
		
	}
	/*public ItemFood setPotionEffect(PotionEffect p_185070_1_, float p_185070_2_)
    {
        this.potionId = p_185070_1_;
        this.potionEffectProbability = p_185070_2_;
        return this;
    }*/
}
