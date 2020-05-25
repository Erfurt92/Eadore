package com.erfurt.eadore.util.handlers;

import com.erfurt.eadore.init.BlockInit;
import com.erfurt.eadore.objects.blocks.trees.mallorn.MallornLeavesBlock;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class ModColorHandler
{
	public static void registerItemColor(ColorHandlerEvent.Item event)
	{
		event.getItemColors().register(MallornLeavesBlock::getItemColor, BlockInit.MALLORN_LEAVES_ITEM.get());
	}

	public static void registerBlockColor(ColorHandlerEvent.Block event)
	{
		event.getBlockColors().register(MallornLeavesBlock::getBlockColor, BlockInit.MALLORN_LEAVES.get());
	}
}