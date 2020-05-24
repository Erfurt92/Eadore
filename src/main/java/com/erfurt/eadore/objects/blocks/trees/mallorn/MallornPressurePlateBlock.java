package com.erfurt.eadore.objects.blocks.trees.mallorn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;

public class MallornPressurePlateBlock extends PressurePlateBlock
{
    public MallornPressurePlateBlock()
    {
        super(Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE));
    }
}