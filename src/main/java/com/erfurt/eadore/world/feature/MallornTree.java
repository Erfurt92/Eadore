package com.erfurt.eadore.world.feature;

import com.erfurt.eadore.world.biomes.EadoreBiomeFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MallornTree extends Tree
{
    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean bool)
    {
        return randomIn.nextInt(10) == 0 ? Feature.FANCY_TREE.withConfiguration(bool ? EadoreBiomeFeatures.FANCY_MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG : EadoreBiomeFeatures.FANCY_MALLORN_TREE_CONFIG) : Feature.NORMAL_TREE.withConfiguration(bool ? EadoreBiomeFeatures.MALLORN_TREE_WITH_MORE_BEEHIVES_CONFIG : EadoreBiomeFeatures.MALLORN_TREE_CONFIG);
    }
}