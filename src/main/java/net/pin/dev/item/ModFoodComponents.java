package net.pin.dev.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STUFFEDCAN = new FoodComponent.Builder().hunger(5).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 250), 0.25f).build();

    public static final FoodComponent DINO = new FoodComponent.Builder().hunger(4).saturationModifier(0.25f)
            .build();
}
