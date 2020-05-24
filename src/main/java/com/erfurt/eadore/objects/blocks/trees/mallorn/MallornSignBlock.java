package com.erfurt.eadore.objects.blocks.trees.mallorn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StandingSignBlock;

public class MallornSignBlock extends StandingSignBlock
{
    public MallornSignBlock()
    {
        super(Block.Properties.from(Blocks.OAK_SIGN), MallornWoodType.MALLORN);
    }
}