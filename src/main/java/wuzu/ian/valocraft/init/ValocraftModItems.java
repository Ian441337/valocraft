
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.item.ItemneonItem;
import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class ValocraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ValocraftMod.MODID);
	public static final RegistryObject<Item> SPIKE_SPAWN_EGG = REGISTRY.register("spike_spawn_egg", () -> new ForgeSpawnEggItem(ValocraftModEntities.SPIKE, -10066330, -10027009, new Item.Properties()));
	public static final RegistryObject<Item> ITEMNEON = REGISTRY.register("itemneon", () -> new ItemneonItem());
	// Start of user code block custom items
	// End of user code block custom items
}
