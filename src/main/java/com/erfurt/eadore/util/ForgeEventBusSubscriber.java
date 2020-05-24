package com.erfurt.eadore.util;


import com.erfurt.eadore.Eadore;
import com.erfurt.eadore.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Eadore.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber
{
    @SubscribeEvent
    public static void registerDimension(final RegisterDimensionsEvent event)
    {
        if(DimensionType.byName(Eadore.EADORE_DIMENSION_TYPE) == null)
        {
            DimensionManager.registerDimension(Eadore.EADORE_DIMENSION_TYPE, DimensionInit.EADORE_DIMENSION.get(), null, true);
            Eadore.LOGGER.info("DimensionType was null");
        }
        else
        {
            Eadore.LOGGER.info("DimensionType = " + Eadore.EADORE_DIMENSION_TYPE);
        }
        Eadore.LOGGER.info("registerDimension method registered.");
    }
}