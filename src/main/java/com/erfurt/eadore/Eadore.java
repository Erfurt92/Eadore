package com.erfurt.eadore;

import com.erfurt.eadore.init.BiomeInit;
import com.erfurt.eadore.init.BlockInit;
import com.erfurt.eadore.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Eadore.MOD_ID)
public class Eadore
{
    public static final String MOD_ID = "eadore";
    public static final String MOD_NAME = "Eadore";

    public static Eadore instance;
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public Eadore()
    {
        instance = this;

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientRegistries);
        modEventBus.addListener(this::enqueue);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event)
    {
        LOGGER.info("clientRegistries method registered.");
    }

    private void enqueue(final InterModEnqueueEvent evt)
    {
        LOGGER.info("enqueue method registered.");
    }

    public static ResourceLocation getId(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }

    public static final ItemGroup GROUP = new ItemGroup("eadoreGroup")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.AMETHYST.get());
        }
    };
}