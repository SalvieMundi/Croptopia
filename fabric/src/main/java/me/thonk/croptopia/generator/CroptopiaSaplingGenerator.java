package me.thonk.croptopia.generator;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;
import java.util.function.Supplier;

public class CroptopiaSaplingGenerator extends SaplingGenerator {

    private final Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree;

    public CroptopiaSaplingGenerator(Supplier<ConfiguredFeature<TreeFeatureConfig, ?>> tree) {
        this.tree = tree;
    }

    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return tree.get();
    }
}
