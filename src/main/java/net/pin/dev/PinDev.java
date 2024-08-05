package net.pin.dev;

import net.fabricmc.api.ModInitializer;

import net.pin.dev.block.ModBlocks;
import net.pin.dev.item.ModItemGroups;
import net.pin.dev.item.ModItems;
import net.pin.dev.sound.ModSounds;
import net.pin.dev.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PinDev implements ModInitializer {

	public static final String MOD_ID = "pindev";

    public static final Logger LOGGER = LoggerFactory.getLogger("pindev");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		ModSounds.registerSounds();

		//ModStatusEffects.registerModStatusEffects();

		ModWorldGeneration.generateModWorldGen();
	}
}