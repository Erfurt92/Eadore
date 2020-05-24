package com.erfurt.eadore.world.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class EadoreOceanBiome extends EadoreBiome
{
    public EadoreOceanBiome()
    {
        super(new Biome.Builder()
                .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(
                        Blocks.GRASS_BLOCK.getDefaultState(),
                        Blocks.DIRT.getDefaultState(),
                        Blocks.GRAVEL.getDefaultState()))
                .category(Category.OCEAN)
                .depth(-1.0F)
                .scale(0.1F)
                .temperature(0.5F));

        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addLakes(this);
        EadoreBiomeFeatures.addEadoreStoneVariants(this);
        EadoreBiomeFeatures.addEadoreOres(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        EadoreBiomeFeatures.addScatteredMallornTrees(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addSparseGrass(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addTallSeagrassSparse(this);
        DefaultBiomeFeatures.addKelp(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
    }
}