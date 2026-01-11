/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cyrilbronze.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.cyrilbronze.item.*;
import net.mcreator.cyrilbronze.CyrilBronzeMod;

import java.util.function.Function;

public class CyrilBronzeModItems {
	public static Item TINORE;
	public static Item DEEPSLATETINORE;
	public static Item TIN;
	public static Item RAW_BRONZE;
	public static Item BRONZE;
	public static Item BRONZEARMOR_HELMET;
	public static Item BRONZEARMOR_CHESTPLATE;
	public static Item BRONZEARMOR_LEGGINGS;
	public static Item BRONZEARMOR_BOOTS;
	public static Item BRONZE_ITEMS_PICKAXE;
	public static Item BRONZE_ITEMS_AXE;
	public static Item BRONZE_ITEMS_SWORD;
	public static Item BRONZE_ITEMS_SHOVEL;
	public static Item BRONZE_ITEMS_HOE;

	public static void load() {
		TINORE = block(CyrilBronzeModBlocks.TINORE, "tinore");
		DEEPSLATETINORE = block(CyrilBronzeModBlocks.DEEPSLATETINORE, "deepslatetinore");
		TIN = register("tin", TinItem::new);
		RAW_BRONZE = register("raw_bronze", RawBronzeItem::new);
		BRONZE = register("bronze", BronzeItem::new);
		BRONZEARMOR_HELMET = register("bronzearmor_helmet", BronzearmorItem.Helmet::new);
		BRONZEARMOR_CHESTPLATE = register("bronzearmor_chestplate", BronzearmorItem.Chestplate::new);
		BRONZEARMOR_LEGGINGS = register("bronzearmor_leggings", BronzearmorItem.Leggings::new);
		BRONZEARMOR_BOOTS = register("bronzearmor_boots", BronzearmorItem.Boots::new);
		BRONZE_ITEMS_PICKAXE = register("bronze_items_pickaxe", BronzeItemsPickaxeItem::new);
		BRONZE_ITEMS_AXE = register("bronze_items_axe", BronzeItemsAxeItem::new);
		BRONZE_ITEMS_SWORD = register("bronze_items_sword", BronzeItemsSwordItem::new);
		BRONZE_ITEMS_SHOVEL = register("bronze_items_shovel", BronzeItemsShovelItem::new);
		BRONZE_ITEMS_HOE = register("bronze_items_hoe", BronzeItemsHoeItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CyrilBronzeMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CyrilBronzeMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}