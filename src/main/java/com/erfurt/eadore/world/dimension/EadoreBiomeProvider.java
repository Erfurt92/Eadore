package com.erfurt.eadore.world.dimension;

import com.erfurt.eadore.init.BiomeInit;
import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class EadoreBiomeProvider extends BiomeProvider
{
    private Random rand;

    private static final Set<Biome> biomeList = ImmutableSet.of(
            BiomeInit.EADORE_PLAINS.get(),
            BiomeInit.EADORE_FOREST.get(),
            BiomeInit.EADORE_MOUNTAINS.get(),
            BiomeInit.EADORE_FOREST_HILLS.get(),
            BiomeInit.EADORE_RIVER.get(),
            BiomeInit.EADORE_BEACH.get(),
            BiomeInit.EADORE_OCEAN.get(),
            BiomeInit.EADORE_DEEP_OCEAN.get());

    public EadoreBiomeProvider()
    {
        super(biomeList);
        rand = new Random();
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z)
    {
        return BiomeInit.EADORE_PLAINS.get();
    }
}