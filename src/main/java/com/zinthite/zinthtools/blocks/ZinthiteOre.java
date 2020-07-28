package com.zinthite.zinthtools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ZinthiteOre extends Block {

    public ZinthiteOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(10.0f, 1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
