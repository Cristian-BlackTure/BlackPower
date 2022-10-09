package io.github.thebusybiscuit.ecopower.items;

import java.util.Arrays;
import java.util.Locale;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.addoncommunity.galactifun.base.BaseItems;
import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import io.github.thebusybiscuit.ecopower.EcoPowerPlugin;

public final class IngotPress extends AContainer {

    public static final MachineRecipeType TYPE = new MachineRecipeType(
            EcoPowerPlugin.INGOT_PRESS.getItemId().toLowerCase(Locale.ROOT),
            EcoPowerPlugin.INGOT_PRESS
    );

    public CircuitPress(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
        TYPE.sendRecipesTo((ing, res) -> this.registerRecipe(20, Arrays.copyOf(ing, 2), new ItemStack[] { res }));
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.PISTON);
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "INGOT_PRESS";
    }

}
