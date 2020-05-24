package com.erfurt.eadore.objects.blocks.trees.mallorn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;

public class MallornLogBlock extends LogBlock
{
    public MallornLogBlock()
    {
        super(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG));
    }
}