package com.erfurt.eadore.init;

import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.objects.items.AmethystItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Eadore.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", AmethystItem::new);

    // Mallorn Boat
}