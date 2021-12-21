package com.gildedgames.aether.client.renderer.entity;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.client.renderer.entity.layers.MoaSaddleLayer;
import com.gildedgames.aether.client.renderer.entity.model.MoaModel;
import com.gildedgames.aether.common.entity.passive.MoaEntity;
import com.gildedgames.aether.core.api.AetherMoaTypes;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.UUID;

public class MoaRenderer extends MobRenderer<MoaEntity, MoaModel>
{
	private static final ResourceLocation MOS_TEXTURE = new ResourceLocation(Aether.MODID, "textures/entity/mobs/moa/mos.png");
	private static final ResourceLocation RAPTOR_TEXTURE = new ResourceLocation(Aether.MODID, "textures/entity/mobs/moa/raptor.png");

	public MoaRenderer(EntityRendererManager rendererManager) {
		super(rendererManager, new MoaModel(0.0F), 0.7F);
		this.addLayer(new MoaSaddleLayer(this));
	}

	@Override
	public void render(MoaEntity moa, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
		super.render(moa, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
		this.model.setupWingsAnimation(moa);
	}

	@Override
	protected void scale(MoaEntity moa, MatrixStack matrixStackIn, float partialTickTime) {
		float moaScale = moa.isBaby() ? 1.0F : 1.8F;
		matrixStackIn.scale(moaScale, moaScale, moaScale);
		if (moa.isSitting()) {
			matrixStackIn.translate(0, 0.5D, 0);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(MoaEntity moa) {
		if (moa.hasCustomName() && moa.getCustomName() != null && "Mos".equals(moa.getCustomName().getContents()) && moa.getMoaType() == AetherMoaTypes.ORANGE) {
			return MOS_TEXTURE;
		}
		if ((moa.hasCustomName() && moa.getCustomName() != null && "Raptor__".equals(moa.getCustomName().getContents()) && moa.getMoaType() == AetherMoaTypes.BLUE)
				|| (moa.getRider() != null && moa.getRider().equals(UUID.fromString("c3e6871e-8e60-490a-8a8d-2bbe35ad1604")))) {
			return RAPTOR_TEXTURE;
		}
		return moa.getMoaType().getMoaTexture();
	}
}
