package net.pin.dev.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.pin.dev.PinDev;

public class ModSounds {

    public static final SoundEvent INDIAN_MUSIC = registerSoundEvent("indian_music");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(PinDev.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        PinDev.LOGGER.info("soundz");
    }
}
