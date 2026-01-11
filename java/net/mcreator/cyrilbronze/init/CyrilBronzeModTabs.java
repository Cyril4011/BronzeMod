/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cyrilbronze.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CyrilBronzeModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(CyrilBronzeModBlocks.TINORE.asItem());
			tabData.accept(CyrilBronzeModBlocks.DEEPSLATETINORE.asItem());
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(tabData -> {
			tabData.accept(CyrilBronzeModItems.TIN);
			tabData.accept(CyrilBronzeModItems.RAW_BRONZE);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(CyrilBronzeModItems.BRONZEARMOR_HELMET);
			tabData.accept(CyrilBronzeModItems.BRONZEARMOR_CHESTPLATE);
			tabData.accept(CyrilBronzeModItems.BRONZEARMOR_LEGGINGS);
			tabData.accept(CyrilBronzeModItems.BRONZEARMOR_BOOTS);
			tabData.accept(CyrilBronzeModItems.BRONZE_ITEMS_SWORD);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(CyrilBronzeModItems.BRONZE_ITEMS_PICKAXE);
			tabData.accept(CyrilBronzeModItems.BRONZE_ITEMS_AXE);
			tabData.accept(CyrilBronzeModItems.BRONZE_ITEMS_SHOVEL);
			tabData.accept(CyrilBronzeModItems.BRONZE_ITEMS_HOE);
		});
	}
}