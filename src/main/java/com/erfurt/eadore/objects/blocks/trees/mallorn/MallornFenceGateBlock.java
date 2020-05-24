package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;

public class MallornFenceGateBlock extends FenceGateBlock
{
    public MallornFenceGateBlock()
    {
        super(Block.Properties.from(BlockInit.MALLORN_PLANKS.get()));
    }
}