package net.mcreator.cyrilbronze.client.renderer.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import net.mcreator.cyrilbronze.init.CyrilBronzeModItems;
import net.mcreator.cyrilbronze.init.CyrilBronzeModArmorModels;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BronzearmorArmor {
	public static void clientLoad() {
		CyrilBronzeModArmorModels.ARMOR_MODELS.put(CyrilBronzeModItems.BRONZEARMOR_HELMET, new CyrilBronzeModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("cyril_bronze:textures/entities/binze-12.png.png");
			}
		});
		CyrilBronzeModArmorModels.ARMOR_MODELS.put(CyrilBronzeModItems.BRONZEARMOR_CHESTPLATE, new CyrilBronzeModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("cyril_bronze:textures/entities/binze-12.png.png");
			}
		});
		CyrilBronzeModArmorModels.ARMOR_MODELS.put(CyrilBronzeModItems.BRONZEARMOR_LEGGINGS, new CyrilBronzeModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("cyril_bronze:textures/entities/binze-11.png.png");
			}
		});
		CyrilBronzeModArmorModels.ARMOR_MODELS.put(CyrilBronzeModItems.BRONZEARMOR_BOOTS, new CyrilBronzeModArmorModels.ArmorModel() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("cyril_bronze:textures/entities/binze-12.png.png");
			}
		});
	}
}