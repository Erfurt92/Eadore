package com.erfurt.eadore.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class AmethystOreBlock extends OreBlock
{
    public AmethystOreBlock()
    {
        super(Block.Properties.from(Blocks.DIAMOND_ORE));
    }

    @Override
    public int getExperience(Random rand)
    {
        return MathHelper.nextInt(rand, 3, 7);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch)
    {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}