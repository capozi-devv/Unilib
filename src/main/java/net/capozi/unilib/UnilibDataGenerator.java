package net.capozi.unilib;

import net.capozi.unilib.datagen.CoreBlockTagProvider;
import net.capozi.unilib.datagen.CoreItemTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UnilibDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(CoreBlockTagProvider::new);
		pack.addProvider(CoreItemTagProvider::new);
	}
}
