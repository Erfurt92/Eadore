package com.erfurt.eadore.objects.blocks;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class EadoreOreBlock extends OreBlock
{
    public EadoreOreBlock(Block block)
    {
        super(Block.Properties.from(block));
    }

    @Override
    public int getExperience(Random rand)
    {
        if (this == BlockInit.EADORE_COAL_ORE.get()) return MathHelper.nextInt(rand, 0, 2);
        else if (this == BlockInit.AMETHYST_ORE.get()) return MathHelper.nextInt(rand, 3, 7);
        else if (this == BlockInit.EADORE_EMERALD_ORE.get()) return MathHelper.nextInt(rand, 3, 7);
        else return this == BlockInit.EADORE_LAPIS_ORE.get() ? MathHelper.nextInt(rand, 2, 5) : 0;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch)
    {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}