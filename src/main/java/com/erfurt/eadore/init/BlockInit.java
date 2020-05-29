package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.objects.blocks.AmethystOreBlock;
import com.erfurt.eadore.objects.blocks.BaseBlock;
import com.erfurt.eadore.objects.blocks.BlockItemBase;
import com.erfurt.eadore.objects.blocks.EadoreOreBlock;
import com.erfurt.eadore.objects.blocks.trees.mallorn.*;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Eadore.MOD_ID);

    // Blocks
    /** Generic Blocks
     * All generic blocks, stair, slabs and walls
     */
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new BaseBlock(Blocks.DIAMOND_BLOCK));

    /** Ore Blocks
     * All Ore Blocks
     */
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new EadoreOreBlock(Blocks.DIAMOND_ORE));
    public static final RegistryObject<Block> EADORE_GOLD_ORE = BLOCKS.register("eadore_gold_ore", () -> new EadoreOreBlock((Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> EADORE_IRON_ORE = BLOCKS.register("eadore_iron_ore", () -> new EadoreOreBlock(Blocks.IRON_ORE));
    public static final RegistryObject<Block> EADORE_COAL_ORE = BLOCKS.register("eadore_coal_ore", () -> new EadoreOreBlock(Blocks.COAL_ORE));
    public static final RegistryObject<Block> EADORE_LAPIS_ORE = BLOCKS.register("eadore_lapis_ore", () -> new EadoreOreBlock(Blocks.LAPIS_ORE));
    public static final RegistryObject<Block> EADORE_EMERALD_ORE = BLOCKS.register("eadore_emerald_ore", () -> new EadoreOreBlock(Blocks.EMERALD_ORE));
    public static final RegistryObject<Block> EADORE_REDSTONE_ORE = BLOCKS.register("eadore_redstone_ore", () -> new RedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE)));

    /** Wood Stuff
     * All blocks related to trees and planks
     */
    public static final RegistryObject<Block> MALLORN_LOG = BLOCKS.register("mallorn_log", MallornLogBlock::new);
    public static final RegistryObject<Block> MALLORN_WOOD = BLOCKS.register("mallorn_wood", MallornWoodBlock::new);
    public static final RegistryObject<Block> STRIPPED_MALLORN_LOG = BLOCKS.register("stripped_mallorn_log", MallornLogBlock::new);
    public static final RegistryObject<Block> STRIPPED_MALLORN_WOOD = BLOCKS.register("stripped_mallorn_wood", MallornWoodBlock::new);
    public static final RegistryObject<Block> MALLORN_LEAVES = BLOCKS.register("mallorn_leaves", MallornLeavesBlock::new);
    public static final RegistryObject<Block> MALLORN_SAPLING = BLOCKS.register("mallorn_sapling", MallornSaplingBlock::new);
    public static final RegistryObject<Block> POTTED_MALLORN_SAPLING = BLOCKS.register("potted_mallorn_sapling", () -> new FlowerPotBlock(null, MallornSaplingBlock::new, Block.Properties.from(Blocks.POTTED_OAK_SAPLING))); // Not working for now
    public static final RegistryObject<Block> MALLORN_PLANKS = BLOCKS.register("mallorn_planks", () -> new BaseBlock(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> MALLORN_STAIRS = BLOCKS.register("mallorn_stairs", MallornStairsBlock::new);
    public static final RegistryObject<Block> MALLORN_SLAB = BLOCKS.register("mallorn_slab", MallornSlabBlock::new);
    public static final RegistryObject<Block> MALLORN_FENCE = BLOCKS.register("mallorn_fence", MallornFenceBlock::new);
    public static final RegistryObject<Block> MALLORN_FENCE_GATE = BLOCKS.register("mallorn_fence_gate", MallornFenceGateBlock::new);
    public static final RegistryObject<Block> MALLORN_DOOR = BLOCKS.register("mallorn_door", MallornDoorBlock::new);
    public static final RegistryObject<Block> MALLORN_TRAPDOOR = BLOCKS.register("mallorn_trapdoor", MallornTrapDoorBlock::new);
    public static final RegistryObject<Block> MALLORN_BUTTON = BLOCKS.register("mallorn_button", MallornButtonBlock::new);
    public static final RegistryObject<Block> MALLORN_PRESSURE_PLATE = BLOCKS.register("mallorn_pressure_plate", MallornPressurePlateBlock::new);
    public static final RegistryObject<Block> MALLORN_SIGN = BLOCKS.register("mallorn_sign", MallornSignBlock::new); // Not working for now


    // Block Items
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ItemInit.ITEMS.register("amethyst_block", () -> new BlockItemBase(AMETHYST_BLOCK.get()));

    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ItemInit.ITEMS.register("amethyst_ore", () -> new BlockItemBase(AMETHYST_ORE.get()));
    public static final RegistryObject<Item> EADORE_GOLD_ORE_ITEM = ItemInit.ITEMS.register("eadore_gold_ore", () -> new BlockItemBase(EADORE_GOLD_ORE.get()));
    public static final RegistryObject<Item> EADORE_IRON_ORE_ITEM = ItemInit.ITEMS.register("eadore_iron_ore", () -> new BlockItemBase(EADORE_IRON_ORE.get()));
    public static final RegistryObject<Item> EADORE_COAL_ORE_ITEM = ItemInit.ITEMS.register("eadore_coal_ore", () -> new BlockItemBase(EADORE_COAL_ORE.get()));
    public static final RegistryObject<Item> EADORE_LAPIS_ORE_ITEM = ItemInit.ITEMS.register("eadore_lapis_ore", () -> new BlockItemBase(EADORE_LAPIS_ORE.get()));
    public static final RegistryObject<Item> EADORE_EMERALD_ORE_ITEM = ItemInit.ITEMS.register("eadore_emerald_ore", () -> new BlockItemBase(EADORE_EMERALD_ORE.get()));
    public static final RegistryObject<Item> EADORE_REDSTONE_ORE_ITEM = ItemInit.ITEMS.register("eadore_redstone_ore", () -> new BlockItemBase(EADORE_REDSTONE_ORE.get()));

    public static final RegistryObject<Item> MALLORN_LOG_ITEM = ItemInit.ITEMS.register("mallorn_log", () -> new BlockItemBase(MALLORN_LOG.get()));
    public static final RegistryObject<Item> MALLORN_WOOD_ITEM = ItemInit.ITEMS.register("mallorn_wood", () -> new BlockItemBase(MALLORN_WOOD.get()));
    public static final RegistryObject<Item> STRIPPED_MALLORN_LOG_ITEM = ItemInit.ITEMS.register("stripped_mallorn_log", () -> new BlockItemBase(STRIPPED_MALLORN_LOG.get()));
    public static final RegistryObject<Item> STRIPPED_MALLORN_WOOD_ITEM = ItemInit.ITEMS.register("stripped_mallorn_wood", () -> new BlockItemBase(STRIPPED_MALLORN_WOOD.get()));
    public static final RegistryObject<Item> MALLORN_LEAVES_ITEM = ItemInit.ITEMS.register("mallorn_leaves", () -> new BlockItemBase(MALLORN_LEAVES.get()));
    public static final RegistryObject<Item> MALLORN_SAPLING_ITEM = ItemInit.ITEMS.register("mallorn_sapling", () -> new BlockItemBase(MALLORN_SAPLING.get()));
    public static final RegistryObject<Item> MALLORN_PLANKS_ITEM = ItemInit.ITEMS.register("mallorn_planks", () -> new BlockItemBase(MALLORN_PLANKS.get()));
    public static final RegistryObject<Item> MALLORN_STAIRS_ITEM = ItemInit.ITEMS.register("mallorn_stairs", () -> new BlockItemBase(MALLORN_STAIRS.get()));
    public static final RegistryObject<Item> MALLORN_SLAB_ITEM = ItemInit.ITEMS.register("mallorn_slab", () -> new BlockItemBase(MALLORN_SLAB.get()));
    public static final RegistryObject<Item> MALLORN_FENCE_ITEM = ItemInit.ITEMS.register("mallorn_fence", () -> new BlockItemBase(MALLORN_FENCE.get()));
    public static final RegistryObject<Item> MALLORN_FENCE_GATE_ITEM = ItemInit.ITEMS.register("mallorn_fence_gate", () -> new BlockItemBase(MALLORN_FENCE_GATE.get()));
    public static final RegistryObject<Item> MALLORN_DOOR_ITEM = ItemInit.ITEMS.register("mallorn_door", () -> new BlockItemBase(MALLORN_DOOR.get()));
    public static final RegistryObject<Item> MALLORN_TRAPDOOR_ITEM = ItemInit.ITEMS.register("mallorn_trapdoor", () -> new BlockItemBase(MALLORN_TRAPDOOR.get()));
    public static final RegistryObject<Item> MALLORN_BUTTON_ITEM = ItemInit.ITEMS.register("mallorn_button", () -> new BlockItemBase(MALLORN_BUTTON.get()));
    public static final RegistryObject<Item> MALLORN_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("mallorn_pressure_plate", () -> new BlockItemBase(MALLORN_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> MALLORN_SIGN_ITEM = ItemInit.ITEMS.register("mallorn_sign", () -> new BlockItemBase(MALLORN_SIGN.get()));
}