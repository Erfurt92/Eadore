package com.erfurt.eadore.objects.blocks.trees.mallorn;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;

import java.util.Set;

public class MallornWoodType extends WoodType
{
    private static final Set<MallornWoodType> VALUES = new ObjectArraySet<>();
    public static final MallornWoodType MALLORN = register(new MallornWoodType("mallorn"));
    private final String name;

    public MallornWoodType(String nameIn)
    {
        super(nameIn);
        this.name = nameIn;
    }

    private static MallornWoodType register(MallornWoodType woodTypeIn)
    {
        VALUES.add(woodTypeIn);
        return woodTypeIn;
    }

    public String getName() {
        return this.name;
    }
}