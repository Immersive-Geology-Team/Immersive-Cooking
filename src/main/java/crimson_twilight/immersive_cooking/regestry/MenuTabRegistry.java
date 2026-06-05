package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MenuTabRegistry {

    public static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImmersiveCooking.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> IC_BASE_TAB = TAB_REGISTER.register("main", () ->
            // 2. Changed to CreativeModeTab.builder()
            CreativeModeTab.builder()
                    .icon(() -> ItemRegistry.ITEM_MAP.get("raw_spider_shank").get().getDefaultInstance())
                    .title(Component.translatable("itemGroup.immersive_cooking"))
                    .displayItems(MenuTabRegistry::fillTab)
                    .build()
    );

    private static void fillTab(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output out)
    {
        for (DeferredItem<Item> holder : ItemRegistry.ITEM_MAP.values())
        {
            var item = holder.get();
            out.accept(item);
        }
    }

}
