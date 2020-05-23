package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.objects.blocks.AmethystOreBlock;
import com.erfurt.eadore.objects.blocks.BaseBlock;
import com.erfurt.eadore.objects.blocks.BlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Eadore.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new BaseBlock(Material.IRON, 5.0F, 6.0F, SoundType.METAL, ToolType.PICKAXE, 2));
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", AmethystOreBlock::new);


    // Block Items
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ItemInit.ITEMS.register("amethyst_block", () -> new BlockItemBase(AMETHYST_BLOCK.get()));
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ItemInit.ITEMS.register("amethyst_ore", () -> new BlockItemBase(AMETHYST_ORE.get()));
}