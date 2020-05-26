package com.erfurt.eadore;

import com.erfurt.eadore.init.BiomeInit;
import com.erfurt.eadore.init.BlockInit;
import com.erfurt.eadore.init.DimensionInit;
import com.erfurt.eadore.init.ItemInit;
import com.erfurt.eadore.util.handlers.ModColorHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.Dimension;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy
{
    SideProxy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);

        modEventBus.addGenericListener(GlobalLootModifierSerializer.class, SideProxy::lootModifierRegistries);
        modEventBus.addGenericListener(Biome.class, SideProxy::onRegisterBiomes);
        modEventBus.addListener(SideProxy::setup);
        modEventBus.addListener(SideProxy::enqueue);
        modEventBus.addListener(SideProxy::process);

        MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
    }

    private static void setup(final FMLCommonSetupEvent event)
    {
        Eadore.LOGGER.info("Setup method registered.");
    }

    private static void enqueue(final InterModEnqueueEvent event)
    {
        Eadore.LOGGER.info("enqueue method registered.");
    }

    private static void process(final InterModProcessEvent event)
    {
        Eadore.LOGGER.info("process method registered.");
    }

    private static void serverStarting(FMLServerStartingEvent event)
    {
        Eadore.LOGGER.info("serverStarting method registered.");
    }

    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event)
    {
        BiomeInit.registerBiomes();
        Eadore.LOGGER.info("onRegisterBiomes method registered.");
    }

    private static void lootModifierRegistries(final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
    {
        Eadore.LOGGER.info("lootModifierRegistries method registered.");
    }

    static class Client extends SideProxy
    {
        Client()
        {
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            modEventBus.addListener(Client::clientRegistries);
            modEventBus.addListener(ModColorHandler::registerItemColor);
            modEventBus.addListener(ModColorHandler::registerBlockColor);
        }

        private static void clientRegistries(FMLClientSetupEvent event)
        {
            RenderTypeLookup.setRenderLayer(BlockInit.MALLORN_SAPLING.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.MALLORN_DOOR.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockInit.MALLORN_TRAPDOOR.get(), RenderType.getCutout());

            Eadore.LOGGER.info("clientRegistries method registered.");
        }
    }

    static class Server extends SideProxy
    {
        Server()
        {
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            modEventBus.addListener(Server::serverSetup);
        }

        private static void serverSetup(FMLDedicatedServerSetupEvent event) { }
    }
}