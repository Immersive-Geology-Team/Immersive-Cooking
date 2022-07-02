package crimson_twilight.immersive_cooking.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods
{
    //Raw
    public static final Food RAW_SPIDER_SHANK = (new Food.Builder())
            .nutrition(6).saturationMod(0.1f)
            .effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 1f)
            .effect(() -> new EffectInstance(Effects.CONFUSION, 200), 1f).meat().build();
    public static final Food CLEAN_SPIDER_SHANK = (new Food.Builder())
            .nutrition(6).saturationMod(0.15f)
            .effect(() -> new EffectInstance(Effects.HUNGER, 200, 1), 0.7f).meat().build();

    //Chopped
    public static final Food DICED_ONION = (new Food.Builder())
            .nutrition(1).saturationMod(0f).fast().build();
    public static final Food POTATO_SLICE = (new Food.Builder())
            .nutrition(1).saturationMod(0.1f).fast().build();
    public static final Food POTATO_CUBES = (new Food.Builder())
            .nutrition(1).saturationMod(0.1f).fast().build();
    public static final Food BAMBOO_SLICE = (new Food.Builder())
            .nutrition(1).saturationMod(0f).fast().build();
    public static final Food RAW_SPIDER_CUTLET = (new Food.Builder())
            .nutrition(1).saturationMod(0.1f)
            .effect(() -> new EffectInstance(Effects.HUNGER, 600), 0.7f).meat().build();

    //Basic
    public static final Food FRIED_POTATO_SLICE = (new Food.Builder())
            .nutrition(2).saturationMod(0.4f).fast().build();
    public static final Food FRIED_POTATO_CUBES = (new Food.Builder())
            .nutrition(2).saturationMod(0.3f).fast().build();
    public static final Food COOKED_SPIDER_CUTLET = (new Food.Builder())
            .nutrition(3).saturationMod(0.5f).meat().build();
    public static final Food SMOKED_SPIDER_SHANK = (new Food.Builder())
            .nutrition(10).saturationMod(0.6f)
            .effect(() -> new EffectInstance(Effects.HUNGER, 200), 0.05f).meat().build();

    //Hand Held
    public static final Food PYTTIPANNA = (new Food.Builder())
            .nutrition(9).saturationMod(0.8f).build();
    public static final Food CURRY_BASE = (new Food.Builder())
            .nutrition(5).saturationMod(0.6f).build();
}
