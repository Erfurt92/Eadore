package com.erfurt.eadore.world.feature;

import com.erfurt.eadore.world.biomes.EadoreBiomeFeatures;
import net.minecraft.block.trees.Tree;
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
        return Feature.NORMAL_TREE.withConfiguration(EadoreBiomeFeatures.MALLORN_TREE_CONFIG);
    }
}