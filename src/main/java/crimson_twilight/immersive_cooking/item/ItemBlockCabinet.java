package crimson_twilight.immersive_cooking.item;

import crimson_twilight.immersive_cooking.block.helper.CabinetMaterial;
import crimson_twilight.immersive_cooking.block.helper.CounterTop;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ItemBlockCabinet extends ItemBlockGeneric {
    private final CabinetMaterial body_material;
    private final CounterTop top_material;

    public ItemBlockCabinet(Block block, Properties properties, String cabinet_name, CounterTop top_material, CabinetMaterial body_material) {
        super(block, properties, cabinet_name);
        this.body_material = body_material;
        this.top_material = top_material;
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack ignored) {
        MutableComponent top_lang = Component.translatable("material.immersive_cooking." + top_material.name().toLowerCase());
        MutableComponent body_lang = Component.translatable("material.immersive_cooking." + body_material.name().toLowerCase());
        return Component.translatable("block.immersive_cooking.cabinet", top_lang, body_lang);
    }

    @Override
    public CabinetMaterial getBodyMaterial() {
        return this.body_material;
    }

    @Override
    public CounterTop getTopMaterial() {
        return this.top_material;
    }
}
