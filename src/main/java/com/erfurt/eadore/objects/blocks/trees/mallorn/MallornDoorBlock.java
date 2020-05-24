package com.erfurt.eadore.objects.blocks.trees.mallorn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;

public class MallornDoorBlock extends DoorBlock
{
    public MallornDoorBlock()
    {
        super(Block.Properties.from(Blocks.OAK_DOOR));
    }
}