package net.supercraftalex.materialx;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MaterialXMain.MOD_ID)
public class MaterialXMain {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "materialx";

    public MaterialXMain() {
        ModBlocks.registerMaterials(new modtab());

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }


    public static class modtab extends CreativeModeTab {

        public modtab() {
            super("materialx");
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.IRON_BLOCK);
        }
    }

}