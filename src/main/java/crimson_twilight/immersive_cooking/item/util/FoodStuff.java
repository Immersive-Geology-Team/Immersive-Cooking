package crimson_twilight.immersive_cooking.item.util;

import crimson_twilight.immersive_cooking.item.ItemFood;
import crimson_twilight.immersive_cooking.regestry.ItemRegistry;
import crimson_twilight.immersive_cooking.ImmersiveCooking;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public enum FoodStuff
{
    RAW_SPIDER_SHANK(6, 0.1f, new int[] {600, 200}, new int[] { 1, 0}, new float[] { 1f, 1f}, MobEffects.HUNGER, MobEffects.CONFUSION),
    CLEAN_SPIDER_SHANK(6, 0.15f, new int[] {200}, new int[] { 1}, new float[] { 0.7f}, MobEffects.HUNGER);

    private final int nutrition;
    private final float saturation_mod;
    private final MobEffect[] effects;
    private final int[] effect_durations, powers;
    private final float[] effect_chances;

    FoodStuff(int nutrition, float saturation_mod, int[] effect_durations, int[] powers, float[] effect_chances, MobEffect... effects) {
        this.nutrition = nutrition;
        this.saturation_mod = saturation_mod;
        this.effects = effects;
        this.powers = powers;
        this.effect_chances = effect_chances;
        this.effect_durations = effect_durations;
    }


    public void registerEntry()
    {
        ItemRegistry.registerItem(getRegistryName(), ()->new ItemFood(this));
    }
    public String getRegistryName()
    {
        return this.name().toLowerCase();
    }
    public Item.Properties getProp()
    {
        return new Item.Properties().food(getFood()); //TEMP
    }
    public FoodProperties getFood()
    {
        FoodProperties.Builder builder = new FoodProperties.Builder();

        builder.nutrition(this.nutrition);
        builder.saturationMod(this.saturation_mod);
        if(effect_durations.length != powers.length || powers.length != effect_chances.length || powers.length != effects.length)
        {
            ImmersiveCooking.LOGGER.warn("Bad Effect Lengths.");
            return builder.build();
        }
        if (powers.length == 0) return builder.build();
        for(int i=0;i< powers.length;i++)
        {
            MobEffect effect = effects[i];
            int duration = effect_durations[i];
            int power = powers[i];
            float chance = effect_chances[i];
            builder.effect(()->new MobEffectInstance(effect,duration,power), chance);
        }
        return builder.build();
    }

}
