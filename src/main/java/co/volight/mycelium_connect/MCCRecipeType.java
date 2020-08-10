package co.volight.mycelium_connect;

import co.volight.mycelium_connect.recipes.MultiCountSmelting;
import co.volight.mycelium_connect.recipes.RecipeTypeMultiCountSmelting;
import net.minecraft.item.crafting.IRecipeType;

public class MCCRecipeType {
    public static final IRecipeType<MultiCountSmelting> multiCountSmelting = new RecipeTypeMultiCountSmelting();
}