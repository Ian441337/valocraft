package wuzu.ian.valocraft.entity.model;

import wuzu.ian.valocraft.entity.SpikeEntity;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

public class SpikeModel extends GeoModel<SpikeEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpikeEntity entity) {
		return new ResourceLocation("valocraft", "animations/spike.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpikeEntity entity) {
		return new ResourceLocation("valocraft", "geo/spike.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpikeEntity entity) {
		return new ResourceLocation("valocraft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
