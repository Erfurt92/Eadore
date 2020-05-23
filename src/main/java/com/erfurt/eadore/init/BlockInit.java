package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.objects.blocks.AmethystBlock;
import com.erfurt.eadore.objects.blocks.BlockItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Eadore.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", AmethystBlock::new);


    // Block Items
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ItemInit.ITEMS.register("amethyst_block", () -> new BlockItemBase(AMETHYST_BLOCK.get()));
}