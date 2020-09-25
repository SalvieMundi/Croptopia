package me.thonk.croptopia.items;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;

public class CroptopiaSeedItem extends AliasedBlockItem {

    private Category category;

    public CroptopiaSeedItem(Block block, Settings settings, Category category) {
        super(block, settings);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
