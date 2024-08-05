package net.pin.dev.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;

public class ModStatusEffects{
    public static final StatusEffect DEATH = registerEffect("death", new DeathStatusEffect());

    private static StatusEffect registerEffect(String name, StatusEffect statusEffect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(PinDev.MOD_ID, name), statusEffect);
    }

    public static void registerModEffects(){
        PinDev.LOGGER.info("registering effects");
    }
}
