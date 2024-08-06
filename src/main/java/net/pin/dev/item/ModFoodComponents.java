package net.pin.dev.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.pin.dev.entity.effect.ModStatusEffects;

public class ModFoodComponents {
    public static final FoodComponent STUFFEDCAN = new FoodComponent.Builder().hunger(5).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 250), 0.25f).build();

    public static final FoodComponent KILLFOOD = new FoodComponent.Builder().hunger(0).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(ModStatusEffects.DEATH, 1200, 100), 0.9F)
            //.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1200, 100), 0.9F)
            //.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 0), 0.9F)
            .alwaysEdible()
            .build();

    public static final FoodComponent ADRENALINE = new FoodComponent.Builder().hunger(8).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 500, 1), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0), 0.9F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 900, 0), 0.8F)
            .alwaysEdible()
            //.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1200, 100), 0.9F)
            //.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 0), 0.9F)
            .build();

    public static final FoodComponent DINO = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f)
            .build();
}
