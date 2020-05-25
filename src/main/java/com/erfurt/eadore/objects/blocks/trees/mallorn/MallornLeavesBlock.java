package com.erfurt.eadore.objects.blocks.trees.mallorn;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;

import javax.annotation.Nullable;

public class MallornLeavesBlock extends LeavesBlock
{
    private static final int color = 16755200;

    public MallornLeavesBlock()
    {
        super(Block.Properties.from(Blocks.OAK_LEAVES));
    }

    public static int getItemColor(ItemStack stack, int tintIndex)
    {
        return color;
    }

    public static int getBlockColor(BlockState state, @Nullable ILightReader lightReader, @Nullable BlockPos pos, int tintIndex)
    {
        return color;
    }
}