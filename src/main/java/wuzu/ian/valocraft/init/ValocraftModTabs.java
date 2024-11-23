
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ValocraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ValocraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> VALOCRAFT = REGISTRY.register("valocraft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.valocraft.valocraft")).icon(() -> new ItemStack(ValocraftModItems.SPIKE_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ValocraftModItems.JETT.get());
				tabData.accept(ValocraftModItems.NEON.get());
				tabData.accept(ValocraftModItems.CLOVE.get());
				tabData.accept(ValocraftModItems.KILLJOY.get());
				tabData.accept(ValocraftModItems.VIPER.get());
				tabData.accept(ValocraftModItems.SAGE.get());
				tabData.accept(ValocraftModItems.ISO.get());
				tabData.accept(ValocraftModItems.SOVA.get());
				tabData.accept(ValocraftModItems.GEKKO.get());
			})

					.build());
}
