package net.capozi.unilib;

import net.capozi.unilib.datagen.UnilibBlockTagProvider;
import net.capozi.unilib.datagen.UnilibItemTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UnilibDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(UnilibBlockTagProvider::new);
		pack.addProvider(UnilibItemTagProvider::new);
		Unilib.LOGGER.info("Generating Data...");
	}
}
