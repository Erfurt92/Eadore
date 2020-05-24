package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;

public class MallornWoodBlock extends RotatedPillarBlock
{
    public MallornWoodBlock()
    {
        super(Block.Properties.from(BlockInit.MALLORN_LOG.get()));
    }
}