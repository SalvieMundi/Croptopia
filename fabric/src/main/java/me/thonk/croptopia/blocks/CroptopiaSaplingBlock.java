package me.thonk.croptopia.blocks;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.sapling.SaplingGenerator;

public class CroptopiaSaplingBlock extends SaplingBlock {


    public CroptopiaSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

	public CroptopiaSaplingBlock(SaplingGenerator generator, Block block) {
		this(generator, Settings.copy(block));
	}
}
