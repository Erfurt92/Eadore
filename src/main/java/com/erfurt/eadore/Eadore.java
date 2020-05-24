package com.erfurt.eadore;

import com.erfurt.eadore.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Eadore.MOD_ID)
public class Eadore
{
    public static final String MOD_ID = "eadore";
    public static final String MOD_NAME = "Eadore";

    public static Eadore instance;

    public static final ResourceLocation EADORE_DIMENSION_TYPE = getId("eadore_dimension");

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public Eadore()
    {
        instance = this;

        DistExecutor.runForDist(
                () -> () -> new SideProxy.Client(),
                () -> () -> new SideProxy.Server()
        );
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