package io.github.thebusybiscuit.ecopower;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

/**
 * Holds the base machines and setup
 */
public final class BlackBlocks {

    public static final SlimefunItemStack REACTORCORE = new SlimefunItemStack(
            "REACTORCORE",
            HeadTexture.NUCLEAR_REACTOR.getAsItemStack(),
            "&fLambda Reactor",
            "",
            "&7Uses lasers to fuse Helium-3 pellets",
            "&7and generate a whale a lot of energy",
            "&7in the process makes ingot too",
            "",
            LoreBuilder.powerPerSecond(65_536),
            LoreBuilder.powerBuffer(65_536)
    );
}
