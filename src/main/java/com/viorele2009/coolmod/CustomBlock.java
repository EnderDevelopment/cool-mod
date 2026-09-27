package com.viorele2009.coolmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public
class CustomBlock extends Block {
    public CustomBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f));
    }
}
