package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.objects.items.AmethystItem;
import com.erfurt.eadore.util.emuns.AmethystArmorMaterial;
import com.erfurt.eadore.util.emuns.AmethystItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Eadore.MOD_ID);

    /** Gems
     * All gems
     */
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", AmethystItem::new);

    /** Amethyst Tools & Armor
     * Axe, Hoe, Pickaxe, Shovel and Sword
     * Boots, Chestplate, Helmet and Leggings
     */
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(AmethystItemTier.AMETHYST, 5.0F, -3.0F, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(AmethystItemTier.AMETHYST, 0.0F, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(AmethystItemTier.AMETHYST, 1, -2.8F, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(AmethystItemTier.AMETHYST, 1.5F, -3.0F, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(AmethystItemTier.AMETHYST, 3, -2.4F, new Item.Properties().group(Eadore.GROUP)));

    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(AmethystArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(AmethystArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(AmethystArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(Eadore.GROUP)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(AmethystArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(Eadore.GROUP)));

    // Mallorn Boat
}