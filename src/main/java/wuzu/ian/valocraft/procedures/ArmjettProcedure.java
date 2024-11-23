package wuzu.ian.valocraft.procedures;

import wuzu.ian.valocraft.init.ValocraftModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class ArmjettProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderArmEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ValocraftModItems.SPIKE_SPAWN_EGG.get())) : false) {
			RenderArmEvent _evt = (RenderArmEvent) event;
			Minecraft mc = Minecraft.getInstance();
			EntityRenderDispatcher dis = mc.getEntityRenderDispatcher();
			Entity _evtEntity = _evt.getPlayer();
			PlayerRenderer playerRenderer = (PlayerRenderer) dis.getRenderer(_evt.getPlayer());
			EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
			MultiBufferSource bufferSource = _evt.getMultiBufferSource();
			int packedLight = _evt.getPackedLight();
			PoseStack poseStack = _evt.getPoseStack();
			PlayerModel<AbstractClientPlayer> playerModel = new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false);
			playerModel.attackTime = 0.0F;
			playerModel.crouching = false;
			playerModel.swimAmount = 0.0F;
			playerModel.setupAnim(_evt.getPlayer(), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			playerModel.leftArm.xRot = 0.0F;
			playerModel.rightArm.xRot = 0.0F;
			HumanoidArm arm = _evt.getArm();
			{
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("valocraft:textures/entities/jett.png") != null) {
					_texture = new ResourceLocation("valocraft:textures/entities/jett.png");
				}
				PlayerModel<AbstractClientPlayer> newModel = new PlayerModel<>(context.bakeLayer(true ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), true);
				newModel.leftArm.copyFrom(playerModel.leftArm);
				newModel.rightArm.copyFrom(playerModel.rightArm);
				if (arm == HumanoidArm.LEFT) {
					newModel.leftArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
				} else {
					newModel.rightArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
				}
			}
		}
	}
}
