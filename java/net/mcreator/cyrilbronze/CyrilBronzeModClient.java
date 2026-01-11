package net.mcreator.cyrilbronze;

import net.mcreator.cyrilbronze.init.CyrilBronzeModBlocksRenderers;
import net.mcreator.cyrilbronze.init.CyrilBronzeModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class CyrilBronzeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		CyrilBronzeModBlocksRenderers.clientLoad();
		CyrilBronzeModArmorModels.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}