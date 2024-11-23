package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.configuration.ExposionscaleConfiguration;
import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ValocraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValocraftModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ExposionscaleConfiguration.SPEC, "Valocraft.toml");
		});
	}
}
