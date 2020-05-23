package com.erfurt.eadore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class AmethystOreBlock extends OreBlock
{
    public AmethystOreBlock()
    {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0F, 3.0F)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
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