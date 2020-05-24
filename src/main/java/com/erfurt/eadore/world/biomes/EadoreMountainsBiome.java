package com.erfurt.eadore.world.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class EadoreMountainsBiome extends EadoreBiome
{
    public EadoreMountainsBiome()
    {
        super(new Biome.Builder()
                .surfaceBuilder(SurfaceBuilder.MOUNTAIN, new SurfaceBuilderConfig(
                        Blocks.GRASS_BLOCK.getDefaultState(),
                        Blocks.DIRT.getDefaultState(),
                        Blocks.GRAVEL.getDefaultState()))
                .category(Category.EXTREME_HILLS)
                .depth(1.0F)
                .scale(0.5F)
                .temperature(0.2F));

        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addLakes(this);
        EadoreBiomeFeatures.addEadoreStoneVariants(this);
        EadoreBiomeFeatures.addEadoreOres(this);
        EadoreBiomeFeatures.addEadoreExtraEmeraldOre(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        EadoreBiomeFeatures.addScatteredMallornTrees(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addSparseGrass(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
    }
}