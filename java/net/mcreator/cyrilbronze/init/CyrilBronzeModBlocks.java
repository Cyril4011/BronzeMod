/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cyrilbronze.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.cyrilbronze.block.TinoreBlock;
import net.mcreator.cyrilbronze.block.DeepslatetinoreBlock;
import net.mcreator.cyrilbronze.CyrilBronzeMod;

import java.util.function.Function;

public class CyrilBronzeModBlocks {
	public static Block TINORE;
	public static Block DEEPSLATETINORE;

	public static void load() {
		TINORE = register("tinore", TinoreBlock::new);
		DEEPSLATETINORE = register("deepslatetinore", DeepslatetinoreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CyrilBronzeMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}