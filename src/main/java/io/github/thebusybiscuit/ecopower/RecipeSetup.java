import io.github.thebusybiscuit.slimefun4.implementation.items.magical.InfusedHopper;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.InfusedMagnet;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.KnowledgeFlask;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.KnowledgeTome;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.MagicEyeOfEnder;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.MagicalZombiePills;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.SoulboundItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.TelepositionScroll;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.ElementalRune;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.EnchantmentRune;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.SoulboundRune;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.VillagerRune;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.WaterStaff;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.WindStaff;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.talismans.MagicianTalisman;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.talismans.Talisman;
import io.github.thebusybiscuit.slimefun4.implementation.items.medical.Bandage;
import io.github.thebusybiscuit.slimefun4.implementation.items.medical.Medicine;
import io.github.thebusybiscuit.slimefun4.implementation.items.medical.Splint;
import io.github.thebusybiscuit.slimefun4.implementation.items.medical.Vitamins;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.AlloyIngot;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.BasicCircuitBoard;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.CoolantCell;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.GoldIngot;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.OrganicFertilizer;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.OrganicFood;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.SteelThruster;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.StrangeNetherGoo;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.SyntheticEmerald;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.ArmorForge;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.AutomatedPanningMachine;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.Compressor;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.EnhancedCraftingTable;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.GrindStone;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.Juicer;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.MagicWorkbench;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.MakeshiftSmeltery;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.OreCrusher;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.OreWasher;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.PressureChamber;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.Smeltery;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.TableSaw;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.miner.AdvancedIndustrialMiner;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.miner.IndustrialMiner;
import io.github.thebusybiscuit.slimefun4.implementation.items.seasonal.ChristmasPresent;
import io.github.thebusybiscuit.slimefun4.implementation.items.seasonal.EasterEgg;
import io.github.thebusybiscuit.slimefun4.implementation.items.teleporter.PersonalActivationPlate;
import io.github.thebusybiscuit.slimefun4.implementation.items.teleporter.PortableTeleporter;
import io.github.thebusybiscuit.slimefun4.implementation.items.teleporter.SharedActivationPlate;
import io.github.thebusybiscuit.slimefun4.implementation.items.teleporter.Teleporter;
import io.github.thebusybiscuit.slimefun4.implementation.items.teleporter.TeleporterPylon;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.ClimbingPick;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.ExplosivePickaxe;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.ExplosiveShovel;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.GoldPan;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.GrapplingHook;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.LumberAxe;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.NetherGoldPan;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.PickaxeOfContainment;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.PickaxeOfTheSeeker;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.PickaxeOfVeinMining;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.PortableCrafter;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.PortableDustbin;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.SmeltersPickaxe;
import io.github.thebusybiscuit.slimefun4.implementation.items.tools.TapeMeasure;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.ExplosiveBow;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.IcyBow;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SeismicAxe;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SwordOfBeheading;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.VampireBlade;
import io.github.thebusybiscuit.slimefun4.utils.ColoredMaterial;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;

/**
 * This class holds the recipes of all items.
 * This is the place where all items from Slimefun are registered.
 *
 */
public final class SlimefunItemSetup {

    private static boolean registeredItems = false;

    private SlimefunItemSetup() {}

    public static void setup(@Nonnull Slimefun plugin) {
        if (registeredItems) {
            throw new UnsupportedOperationException("Slimefun Items can only be registered once!");
        }

        registeredItems = true;
        DefaultItemGroups itemGroups = new DefaultItemGroups();

        new NuclearReactor(itemGroups.electricity, SlimefunItems.NUCLEAR_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REINFORCED_PLATE, SlimefunItems.COOLING_UNIT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.LEAD_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.LEAD_INGOT}){
            
            @Override
            public int getEnergyProduction() {
                return 250;
            }

            @Override
            public int getCapacity() {
                return 16384;
            }
            
        }.register(plugin);
