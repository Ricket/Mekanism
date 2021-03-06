package mekanism.common.item;

import mekanism.common.Resource;
import mekanism.common.base.IMetaItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemShard extends ItemMekanism implements IMetaItem
{
	public ItemShard()
	{
		super();
		setHasSubtypes(true);
	}

	@Override
	public String getTexture(int meta)
	{
		return Resource.values()[meta].getName() + "Shard";
	}
	
	@Override
	public int getVariants()
	{
		return Resource.values().length;
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tabs, NonNullList<ItemStack> itemList)
	{
		for(int counter = 0; counter < Resource.values().length; counter++)
		{
			itemList.add(new ItemStack(item, 1, counter));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		if(item.getItemDamage() <= Resource.values().length-1)
		{
			return "item." + Resource.values()[item.getItemDamage()].getName().toLowerCase() + "Shard";
		}
		
		return "Invalid";
	}
}
