package net.metromodbyitzjerry.metro;

import net.fabricmc.api.ModInitializer;
import net.metromodbyitzjerry.metro.block.ModBlocks;
import net.metromodbyitzjerry.metro.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Thanks for tutorial from Kaupenjoe! This helped me a lot to code this mod!
public class MetroMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("metro");
	public static final String MOD_ID = "metro";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
