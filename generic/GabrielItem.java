package tutorial.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GabrielItem extends Item {

	public GabrielItem() {
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("gabrielItem");		
	}
	
}
