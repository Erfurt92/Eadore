package com.erfurt.eadore.world.biomes;

import com.erfurt.eadore.init.BlockInit;
import com.erfurt.eadore.world.dimension.EadoreGenSettings;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraftforge.common.IPlantable;

import java.util.function.Predicate;

public class EadoreBiomeFeatures extends DefaultBiomeFeatures
{
    private static final BlockState DIRT = Blocks.DIRT.getDefaultState();
    private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
    private static final BlockState STONE = Blocks.STONE.getDefaultState();
    private static final BlockState GRANITE = Blocks.GRANITE.getDefaultState();
    private static final BlockState DIORITE = Blocks.DIORITE.getDefaultState();
    private static final BlockState ANDESITE = Blocks.ANDESITE.getDefaultState();

    private static final BlockState EADORE_COAL_ORE = BlockInit.EADORE_COAL_ORE.get().getDefaultState();
    private static final BlockState EADORE_IRON_ORE = BlockInit.EADORE_IRON_ORE.get().getDefaultState();
    private static final BlockState EADORE_GOLD_ORE = BlockInit.EADORE_GOLD_ORE.get().getDefaultState();
    private static final BlockState EADORE_REDSTONE_ORE = BlockInit.EADORE_REDSTONE_ORE.get().getDefaultState();
    private static final BlockState AMETHYST_ORE = BlockInit.AMETHYST_ORE.get().getDefaultState();
    private static final BlockState EADORE_LAPIS_ORE = BlockInit.EADORE_LAPIS_ORE.get().getDefaultState();
    private static final BlockState EADORE_EMERALD_ORE = BlockInit.EADORE_EMERALD_ORE.get().getDefaultState();

    private static final BlockState MALLORN_LOG = BlockInit.MALLORN_LOG.get().getDefaultState();
    private static final BlockState MALLORN_LEAVES = BlockInit.MALLORN_LEAVES.get().getDefaultState();
    private static final BlockState AIR = Blocks.AIR.getDefaultState();
    private static final Block MALLORN_SAPLING = BlockInit.MALLORN_SAPLING.get();

    private static BlockState EADORE_FILLER = EadoreGenSettings.DEFAULT_FILLER_BLOCK;
    private static final Predicate<BlockState> PREDICATE_EADORE_FILLER = new BlockMatcher(EADORE_FILLER.getBlock());
    private static final OreFeatureConfig.FillerBlockType EADORE_NATURAL_STONE = OreFeatureConfig.FillerBlockType.create("eadore_natural_stone_enum", "eadore_natural_stone", PREDICATE_EADORE_FILLER);

    public static final TreeFeatureConfig MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(2, 0)))
            .baseHeight(4)
            .heightRandA(2)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig FANCY_MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(0, 0)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(2, 0)))
            .baseHeight(4)
            .heightRandA(2)
            .foliageHeight(3)
            .ignoreVines()
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig FANCY_MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(0, 0)))
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig FOREST_MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(2, 0)))
            .baseHeight(4)
            .heightRandA(2)
            .foliageHeight(3)
            .ignoreVines()
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig FANCY_FOREST_MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(MALLORN_LEAVES),
            new BlobFoliagePlacer(0, 0)))
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig DEAD_MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(AIR),
            new BlobFoliagePlacer(2, 0)))
            .baseHeight(4)
            .heightRandA(2)
            .foliageHeight(3)
            .ignoreVines()
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();
    public static final TreeFeatureConfig FANCY_DEAD_MALLORN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(MALLORN_LOG),
            new SimpleBlockStateProvider(AIR),
            new BlobFoliagePlacer(0, 0)))
            .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F)))
            .setSapling((IPlantable)MALLORN_SAPLING)
            .build();

    public static void addEadoreStoneVariants(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, DIRT, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 256))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, GRAVEL, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 256))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, STONE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80)))); // Might delete not sure
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, GRANITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, DIORITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, ANDESITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
    }

    public static void addEadoreOres(Biome biomeIn) // Replace with Eadore variations once they are implemented
    {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, EADORE_COAL_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, EADORE_IRON_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, EADORE_GOLD_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32)))); // Not sure if I should make a new variant or use Gilded Black Stone once 1.16 comes
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, EADORE_REDSTONE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, AMETHYST_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 16))));
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(EADORE_NATURAL_STONE, EADORE_LAPIS_ORE, 7)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(1, 16, 16))));
    }

    public static void addEadoreExtraEmeraldOre(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(EADORE_FILLER, EADORE_EMERALD_ORE)).withPlacement(Placement.EMERALD_ORE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
    }

    public static void addMallornTreesFlowersGrass(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.33333334F)), Feature.NORMAL_TREE.withConfiguration(MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.05F, 1))));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(PLAINS_FLOWER_CONFIG).withPlacement(Placement.NOISE_HEIGHTMAP_32.configure(new NoiseDependant(-0.8D, 15, 4))));
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseDependant(-0.8D, 5, 10))));
    }

    public static void addMallornForestTrees(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_FOREST_MALLORN_TREE_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.withConfiguration(FOREST_MALLORN_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

    public static void addMallornDeadForestTrees(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_DEAD_MALLORN_TREE_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.withConfiguration(DEAD_MALLORN_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));
    }

    public static void addScatteredMallornTrees(Biome biomeIn)
    {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.FANCY_TREE.withConfiguration(FANCY_MALLORN_TREE_CONFIG).withChance(0.1F)), Feature.NORMAL_TREE.withConfiguration(MALLORN_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    }
}