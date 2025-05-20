package net.capozi.unilib;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unilib implements ModInitializer {
	public static final String MOD_ID = "unilib";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Unilib.LOGGER.info("Unilib Coming Online...");
	}
}