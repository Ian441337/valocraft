
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.network.MenubuyMessage;
import wuzu.ian.valocraft.ValocraftMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ValocraftModKeyMappings {
	public static final KeyMapping MENUBUY = new KeyMapping("key.valocraft.menubuy", GLFW.GLFW_KEY_B, "key.categories.valocraft") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ValocraftMod.PACKET_HANDLER.sendToServer(new MenubuyMessage(0, 0));
				MenubuyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MENUBUY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MENUBUY.consumeClick();
			}
		}
	}
}
