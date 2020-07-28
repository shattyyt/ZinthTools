package com.zinthite.zinthtools.util;

import com.zinthite.zinthtools.ZT;
import com.zinthite.zinthtools.blocks.BlockItemBase;
import com.zinthite.zinthtools.blocks.ZinthiteBlock;
import com.zinthite.zinthtools.blocks.ZinthiteOre;
import com.zinthite.zinthtools.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ZT.MOD_ID);
    public static final DeferredRegister<Block>  BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ZT.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> ZINTHITE = ITEMS.register("zinthite", ItemBase::new);

    public static final RegistryObject<Block> ZINTHITE_BLOCK = BLOCKS.register("zinthite_block", ZinthiteBlock::new);
    public static final RegistryObject<Block> ZINTHITE_ORE = BLOCKS.register("zinthite_ore", ZinthiteOre::new);

    public static final RegistryObject<Item> ZINTHITE_BLOCK_ITEM = ITEMS.register("zinthite_block", () -> new BlockItemBase(ZINTHITE_BLOCK.get()));
    public static final RegistryObject<Item> ZINTHITE_ORE_ITEM = ITEMS.register("zinthite_ore", () -> new BlockItemBase(ZINTHITE_ORE.get()));
}
