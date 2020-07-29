package com.zinthite.zinthtools.util;

import com.zinthite.zinthtools.ZT;
import com.zinthite.zinthtools.blocks.BlockItemBase;
import com.zinthite.zinthtools.blocks.ZinthiteBlock;
import com.zinthite.zinthtools.blocks.ZinthiteOre;
import com.zinthite.zinthtools.items.ItemBase;
import com.zinthite.zinthtools.tools.ZTItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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

    public static final RegistryObject<SwordItem> ZINTH_SWORD = ITEMS.register("zinth_sword", () ->
            new SwordItem(ZTItemTier.ZINTHITE, 2, -2.0f, new Item.Properties().group(ZT.TAB)));
    public static final RegistryObject<PickaxeItem> ZINTH_PICKAXE = ITEMS.register("zinth_pickaxe", () ->
            new PickaxeItem(ZTItemTier.ZINTHITE, -1, -2.4f, new Item.Properties().group(ZT.TAB)));
    public static final RegistryObject<ShovelItem> ZINTH_SHOVEL = ITEMS.register("zinth_shovel", () ->
            new ShovelItem(ZTItemTier.ZINTHITE, -2, -2.4f, new Item.Properties().group(ZT.TAB)));
    public static final RegistryObject<AxeItem> ZINTH_AXE = ITEMS.register("zinth_axe", () ->
            new AxeItem(ZTItemTier.ZINTHITE, 1, -2.8f, new Item.Properties().group(ZT.TAB)));
    public static final RegistryObject<HoeItem> ZINTH_HOE= ITEMS.register("zinth_hoe", () ->
            new HoeItem(ZTItemTier.ZINTHITE, -2, new Item.Properties().group(ZT.TAB)));

    public static final RegistryObject<Block> ZINTHITE_BLOCK = BLOCKS.register("zinthite_block.json", ZinthiteBlock::new);
    public static final RegistryObject<Block> ZINTHITE_ORE = BLOCKS.register("zinthite_ore", ZinthiteOre::new);

    public static final RegistryObject<Item> ZINTHITE_BLOCK_ITEM = ITEMS.register("zinthite_block.json", () -> new BlockItemBase(ZINTHITE_BLOCK.get()));
    public static final RegistryObject<Item> ZINTHITE_ORE_ITEM = ITEMS.register("zinthite_ore", () -> new BlockItemBase(ZINTHITE_ORE.get()));
}
