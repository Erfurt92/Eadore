package com.erfurt.eadore.world.dimension;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationSettings;

public class EadoreGenSettings extends GenerationSettings
{
    // Placeholder
    public static final BlockState DEFAULT_FILLER_BLOCK = Blocks.COAL_BLOCK.getDefaultState();

    public EadoreGenSettings()
    {
        this.defaultBlock = DEFAULT_FILLER_BLOCK;
    }

    public int getBiomeSize()
    {
        return 4;
    }

    public int getRiverSize()
    {
        return 4;
    }

    public int getBiomeId()
    {
        return -1;
    }

    @Override
    public int getBedrockFloorHeight()
    {
        return 0;
    }
}