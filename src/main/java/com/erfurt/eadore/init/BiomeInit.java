package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.world.biomes.*;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit
{
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Eadore.MOD_ID);

    public static final RegistryObject<Biome> EADORE_PLAINS = BIOMES.register("eadore_plains", EadorePlainsBiome::new);
    public static final RegistryObject<Biome> EADORE_FOREST = BIOMES.register("eadore_forest", EadoreForestBiome::new);
    public static final RegistryObject<Biome> EADORE_MOUNTAINS = BIOMES.register("eadore_mountains", EadoreMountainsBiome::new);
    public static final RegistryObject<Biome> EADORE_FOREST_HILLS = BIOMES.register("eadore_forest_hills", EadoreForestHills::new);
    public static final RegistryObject<Biome> EADORE_RIVER = BIOMES.register("eadore_river", EadoreRiverBiome::new);
    public static final RegistryObject<Biome> EADORE_BEACH = BIOMES.register("eadore_beach", EadoreBeachBiome::new);
    public static final RegistryObject<Biome> EADORE_OCEAN = BIOMES.register("eadore_ocean", EadoreOceanBiome::new);
    public static final RegistryObject<Biome> EADORE_DEEP_OCEAN = BIOMES.register("eadore_deep_ocean", EadoreDeepOceanBiome::new);

    public static void registerBiomes()
    {
        registerBiome(EADORE_PLAINS.get(), Type.PLAINS, Type.OVERWORLD);
        registerBiome(EADORE_FOREST.get(), Type.FOREST, Type.OVERWORLD);
        registerBiome(EADORE_MOUNTAINS.get(), Type.MOUNTAIN, Type.OVERWORLD);
        registerBiome(EADORE_FOREST_HILLS.get(), Type.FOREST, Type.OVERWORLD);
        registerBiome(EADORE_RIVER.get(), Type.RIVER, Type.OVERWORLD);
        registerBiome(EADORE_BEACH.get(), Type.BEACH, Type.OVERWORLD);
        registerBiome(EADORE_OCEAN.get(), Type.OCEAN, Type.OVERWORLD);
        registerBiome(EADORE_DEEP_OCEAN.get(), Type.OCEAN, Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, Type... types)
    {
        //BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100)); // Only for added biomes to Overworld
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
}