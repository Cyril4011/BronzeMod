package net.mcreator.cyrilbronze.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BronzeItemsSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 183, 5f, 0, 11, TagKey.create(Registries.ITEM, ResourceLocation.parse("cyril_bronze:bronze_items_sword_repair_items")));

	public BronzeItemsSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -3f));
	}
}