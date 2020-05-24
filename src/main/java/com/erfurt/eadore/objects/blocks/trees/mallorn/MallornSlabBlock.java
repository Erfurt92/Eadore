package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class MallornSlabBlock extends SlabBlock
{
    public MallornSlabBlock()
    {
        super(Block.Properties.from(BlockInit.MALLORN_PLANKS.get()));
    }
}