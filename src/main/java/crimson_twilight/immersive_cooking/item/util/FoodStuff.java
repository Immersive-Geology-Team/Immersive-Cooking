package crimson_twilight.immersive_cooking.item.util;

import crimson_twilight.immersive_cooking.ImmersiveCooking;
import crimson_twilight.immersive_cooking.item.ItemFood;
import crimson_twilight.immersive_cooking.regestry.ItemRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

public enum FoodStuff
{
    // RAW UNPREPARED
    RAW_SPIDER_SHANK(6, 0.1f, () -> FoodStuffOptions.MEAT_SHANK, new int[] {FoodStuff.BRIEF_DURATION, FoodStuff.VERY_BRIEF_DURATION}, new int[] { 1, 0}, new float[] { 1f, 1f}, List.of(MobEffects.HUNGER, MobEffects.CONFUSION)),
    CLEAN_SPIDER_SHANK(6, 0.15f, () -> FoodStuffOptions.MEAT_SHANK, new int[] {FoodStuff.VERY_BRIEF_DURATION}, new int[] { 1 }, new float[] { 0.7f }, List.of(MobEffects.HUNGER)),

    // RAW CHOPPED
    DICED_ONION(1, 0f, ()-> FoodStuffOptions.FAST_FOOD),
    POTATO_SLICE(1, 0.1f, ()-> FoodStuffOptions.FAST_FOOD),
    POTATO_CUBES(1, 0.1f, ()-> FoodStuffOptions.FAST_FOOD),
    BAMBOO_SLICE(1, 0f, ()-> FoodStuffOptions.FAST_FOOD),
    RAW_SPIDER_CUTLET(1, 0.1f, ()-> FoodStuffOptions.MEATY, new int[] {FoodStuff.VERY_BRIEF_DURATION}, new int[] { 1 }, new float[] { 0.7f }, List.of(MobEffects.HUNGER)),

    // BASIC COOKED
    FRIED_POTATO_SLICE(2, 0.4f, ()-> FoodStuffOptions.FAST_FOOD),
    FRIED_POTATO_CUBES(2, 0.3f, ()-> FoodStuffOptions.FAST_FOOD),
    COOKED_SPIDER_CUTLET(3, 0.5f, ()-> FoodStuffOptions.MEATY),
    SMOKED_SPIDER_SHANK(10, 0.6f, ()-> FoodStuffOptions.FAST_FOOD),

    // BOWL FOODS
    PYTTIPANNA(10, 0.6f, ()-> FoodStuffOptions.BOWL_FOOD),
    CURRY_BASE(10, 0.6f, ()-> FoodStuffOptions.BOWL_FOOD);


    public static final int VERY_BRIEF_DURATION = 200;    // 10 seconds
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes
    private final int nutrition;
    private final float saturation_mod;
    private final List<Holder<MobEffect>> effects;
    private final int[] effect_durations, powers;
    private final float[] effect_chances;

    private final Supplier<FoodOptionHolder> options;

    FoodStuff(int nutrition, float saturation_mod, Supplier<FoodOptionHolder> options) {
        this(nutrition, saturation_mod, options, new int[0], new int[0], new float[0], List.of());
    }

    FoodStuff(int nutrition, float saturation_mod, Supplier<FoodOptionHolder> options, int[] effect_durations, int[] powers, float[] effect_chances, List<Holder<MobEffect>> effects) {
        this.nutrition = nutrition;
        this.saturation_mod = saturation_mod;
        this.options = options;
        this.effects = effects;
        this.powers = powers;
        this.effect_chances = effect_chances;
        this.effect_durations = effect_durations;
    }

    public Supplier<FoodOptionHolder> getOptionHolder() {
        return options;
    }

    public void registerEntry() {
        ItemRegistry.registerItem(getRegistryName(), ()-> new ItemFood(this));
    }

    public String getRegistryName() {
        return this.name().toLowerCase();
    }

    public Item.Properties getProp() {
        Item.Properties prop = new Item.Properties().food(getFood());
        if (this.options.get().hasOption(FoodOptions.BOWL_ITEM)) {
            prop.craftRemainder(Items.BOWL).stacksTo(16);
        }
        if (this.options.get().hasOption(FoodOptions.BOTTLE_ITEM)) {
            prop.craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
        }
        if (this.options.get().hasOption(FoodOptions.SHANK)) {
            prop.craftRemainder(Items.BONE);
        }
        return prop;
    }

    public FoodProperties getFood() {
        FoodProperties.Builder builder = (new FoodProperties.Builder());
        builder.nutrition(this.nutrition);
        builder.saturationModifier(this.saturation_mod);

        if (this.options.get().hasOption(FoodOptions.FAST)) {
            builder.fast();
        }

        if (this.options.get().hasOption(FoodOptions.ALWAYS_EAT)) {
            builder.alwaysEdible();
        }

        if(effect_durations.length != powers.length || powers.length != effect_chances.length || powers.length != effects.size()) {
            ImmersiveCooking.LOGGER.warn("Bad Effect Lengths.");
            return builder.build();
        }

        if (powers.length == 0) return builder.build();

        for (int i = 0; i < powers.length; i++) {
            var effectHolder = effects.get(i);
            int duration = effect_durations[i];
            int power = powers[i];
            float chance = effect_chances[i];

            builder.effect(() -> new MobEffectInstance(effectHolder, duration, power), chance);
        }
        return builder.build();
    }

    public enum FoodOptions
    {
        FAST,
        MEAT,
        ALWAYS_EAT,
        BOWL_ITEM,
        BOTTLE_ITEM,
        SHANK
    }

    public static class FoodOptionHolder
    {
        HashMap<FoodOptions, Boolean> heldOptions;

        public FoodOptionHolder()
        {
            init();
        }

        public void init() {
            heldOptions = new HashMap<>();
            for (FoodOptions option: FoodOptions.values()) {
                heldOptions.put(option, false);
            }
        }

        public HashMap<FoodOptions, Boolean> getOptions() {
            return heldOptions;
        }

        public FoodOptionHolder set(FoodOptions option) {
            this.heldOptions.replace(option, true);
            return this;
        }

        public boolean hasOption(FoodOptions option)
        {
            return this.heldOptions.get(option);
        }
    }
}
