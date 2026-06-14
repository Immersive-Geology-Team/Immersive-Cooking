package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CounterMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ItemBlockCounter extends ItemBlockGeneric {
    private final CounterTop top_material;
    private final CounterMaterial counter_material;

    public ItemBlockCounter(Block block, Properties properties, String registry_name, CounterTop top_material, CounterMaterial counter_material) {
        super(block, properties, registry_name);
        this.top_material = top_material;
        this.counter_material = counter_material;
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack stack) {
        MutableComponent top_lang = Component.translatable("material.immersive_cooking." + top_material.name().toLowerCase());
        MutableComponent counter_lang = Component.translatable("material.immersive_cooking." + counter_material.name().toLowerCase());
        return Component.translatable("block.immersive_cooking.counter", top_lang, counter_lang);
    }

    @Override
    public CounterMaterial getCounterBodyMaterial() {
        return this.counter_material;
    }

    @Override
    public CounterTop getTopMaterial() {
        return this.top_material;
    }
}
