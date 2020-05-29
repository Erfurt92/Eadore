package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.world.feature.MallornTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SaplingBlock;

public class MallornSaplingBlock extends SaplingBlock implements IGrowable
{
    public MallornSaplingBlock()
    {
        super(new MallornTree(), Block.Properties.from(Blocks.OAK_SAPLING));
    }
}