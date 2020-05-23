package com.erfurt.eadore.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BaseBlock extends Block
{
    public BaseBlock(Material material, float hardness, float resistance, SoundType sound, ToolType tool, int harvestLevel)
    {
        super(Block.Properties.create(material)
                .hardnessAndResistance(hardness, resistance)
                .sound(sound)
                .harvestLevel(harvestLevel)
                .harvestTool(tool));
    }
}
