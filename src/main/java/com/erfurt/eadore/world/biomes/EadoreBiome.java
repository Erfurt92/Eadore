package com.erfurt.eadore.world.biomes;

import net.minecraft.world.biome.Biome;

public class EadoreBiome extends Biome
{
    public EadoreBiome(Builder biomeBuilder)
    {
        super(biomeBuilder
                .precipitation(RainType.NONE)
                .downfall(0.0F)
                .waterColor(8388863) //water color adds a lot of blue to the mix, if 'bug' gets fixed use this "8388863" else use this "16711808"
                .waterFogColor(4194559)
                .parent(null));
    }

    @Override
    public int getGrassColor(double posX, double posZ)
    {
        return 8454143;
    }

    @Override
    public int getFoliageColor()
    {
        return 8454108;
    }
}