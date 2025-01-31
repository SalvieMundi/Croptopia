package me.thonk.croptopia.mixin;

import net.minecraft.entity.ai.brain.task.FarmerWorkTask;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(FarmerWorkTask.class)
public interface FarmerWorkTaskAccessor {

    @Accessor(value = "COMPOSTABLES")
    static List<Item> getCompostables() {
        throw new AssertionError();
    }

    @Accessor(value = "COMPOSTABLES")
    static void setCompostables(List<Item> items) {
        throw new AssertionError();
    }
}

