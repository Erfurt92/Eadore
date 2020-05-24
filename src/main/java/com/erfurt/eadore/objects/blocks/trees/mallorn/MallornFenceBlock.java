package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;

public class MallornFenceBlock extends FenceBlock
{
    public MallornFenceBlock()
    {
        super(Block.Properties.from(BlockInit.MALLORN_PLANKS.get()));
    }
}