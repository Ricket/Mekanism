package mekanism.client.jei.machine;

import mekanism.common.recipe.inputs.ItemStackInput;
import mekanism.common.recipe.machines.BasicMachineRecipe;
import mekanism.common.recipe.outputs.ItemStackOutput;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.item.ItemStack;

public class MachineRecipeWrapper extends BaseRecipeWrapper
{
	public BasicMachineRecipe recipe;
	
	public MachineRecipeCategory category;
	
	public MachineRecipeWrapper(BasicMachineRecipe r, MachineRecipeCategory c)
	{
		recipe = r;
		category = c;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) 
	{
		ingredients.setInput(ItemStack.class, ((ItemStackInput)recipe.getInput()).ingredient);
		ingredients.setOutput(ItemStack.class, ((ItemStackOutput)recipe.getOutput()).output);
	}
	
	@Override
	public MachineRecipeCategory getCategory()
	{
		return category;
	}
}
