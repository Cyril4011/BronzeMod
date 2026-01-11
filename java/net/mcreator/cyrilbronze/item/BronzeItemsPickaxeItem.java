package net.mcreator.cyrilbronze.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BronzeItemsPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 183, 5f, 0, 11, TagKey.create(Registries.ITEM, ResourceLocation.parse("cyril_bronze:bronze_items_pickaxe_repair_items")));

	public BronzeItemsPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 2f, -3f));
	}
}