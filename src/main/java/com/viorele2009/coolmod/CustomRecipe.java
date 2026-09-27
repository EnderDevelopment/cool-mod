package com.viorele2009.coolmod;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public
class CustomRecipe implements Recipe<Inventory> {
    @Override
    public boolean matches(Inventory inventory, Level level) {
        return false;
    }

    @Override
    public ItemStack assemble(Inventory inventory) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }
}
