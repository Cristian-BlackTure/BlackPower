package io.github.thebusybiscuit.ecopower;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.GitHubBuildsUpdater;

public class EcoPowerPlugin extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/EcoPower/master").start();
        }

        new Metrics(this, 8154);

    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/TheBusyBiscuit/EcoPower/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
