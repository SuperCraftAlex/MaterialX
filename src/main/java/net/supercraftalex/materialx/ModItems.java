package net.supercraftalex.materialx;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaterialXMain.MOD_ID);

    //public static final RegistryObject<Item> copper_ingot = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ModTabs.MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}