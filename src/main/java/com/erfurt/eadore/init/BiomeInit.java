package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit
{
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Eadore.MOD_ID);
}