package net.supercraftalex.materialx;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaterialXMain.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        try {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        } catch (Exception e) {}

        return null;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void registerMaterials(CreativeModeTab tab) {
        System.out.println( "MaterialX: Materials to load: " + (new Materials()).getMaterials().size() );
        for (Materials.Material material : (new Materials()).getMaterials()) {
            registerBlock(material.name + "_block", () -> new Block(Block.Properties.of(Material.HEAVY_METAL).strength(4f, 1200f)), tab);
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}