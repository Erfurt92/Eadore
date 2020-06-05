package com.erfurt.eadore.objects.blocks.trees.mallorn;

import com.erfurt.eadore.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class MallornLogBlock extends LogBlock
{
    public MallornLogBlock()
    {
        super(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
    {
        BlockState blockstate = world.getBlockState(pos);
        Block block = BlockInit.STRIPPED_MALLORN_LOG.get();
        if(blockstate.getBlock() == BlockInit.MALLORN_LOG.get() && player.getHeldItem(handIn).getItem() instanceof AxeItem)
        {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if(!world.isRemote)
            {
                world.setBlockState(pos, block.getDefaultState().with(RotatedPillarBlock.AXIS, blockstate.get(RotatedPillarBlock.AXIS)), 11);
                if(player != null) player.getHeldItem(handIn).damageItem(1, player, (p_220040_1_) -> { p_220040_1_.sendBreakAnimation(handIn); });
            }

            return ActionResultType.SUCCESS;
        }
        else return ActionResultType.PASS;
    }
}