package com.viorele2009.coolmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class CoolMod implements ModInitializer {
    public static final String MOD_ID = "coolmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block COOL_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE));
    public static final Item COOL_ITEM = new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    public static final BlockItem COOL_BLOCK_ITEM = new BlockItem(COOL_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing CoolMod");

        Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, "cool_block"), COOL_BLOCK);
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "cool_item"), COOL_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "cool_block"), COOL_BLOCK_ITEM);
    }
}
