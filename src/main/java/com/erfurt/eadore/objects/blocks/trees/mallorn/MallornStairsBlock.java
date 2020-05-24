package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class MallornStairsBlock extends StairsBlock
{
    public MallornStairsBlock()
    {
        super(() -> BlockInit.MALLORN_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.MALLORN_PLANKS.get()));
    }
}