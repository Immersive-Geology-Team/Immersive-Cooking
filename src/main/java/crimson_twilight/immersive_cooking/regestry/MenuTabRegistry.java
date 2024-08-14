package crimson_twilight.immersive_cooking.regestry;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class MenuTabRegistry {

    public static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImmersiveCooking.MODID);

    public static final RegistryObject<CreativeModeTab> IC_BASE_TAB = TAB_REGISTER.register("main", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0)
            .icon(ItemRegistry.ITEM_MAP.get("raw_spider_shank").get()::getDefaultInstance)
            .title(Component.translatable("itemGroup.immersive_cooking"))
            .displayItems(MenuTabRegistry::fillTab)
            .build());

    private static void fillTab(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output out)
    {
        for(final Item item : ItemRegistry.ITEM_MAP.values().stream().map(RegistryObject::get).toList())
        {
            out.accept(item);
        }
    }

}
