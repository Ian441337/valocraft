
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.item.ViperItem;
import wuzu.ian.valocraft.item.SovaItem;
import wuzu.ian.valocraft.item.SageItem;
import wuzu.ian.valocraft.item.NeonItem;
import wuzu.ian.valocraft.item.KilljoyItem;
import wuzu.ian.valocraft.item.JettItem;
import wuzu.ian.valocraft.item.IsoItem;
import wuzu.ian.valocraft.item.GekkoItem;
import wuzu.ian.valocraft.item.CloveItem;
import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class ValocraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ValocraftMod.MODID);
	public static final RegistryObject<Item> SPIKE_SPAWN_EGG = REGISTRY.register("spike_spawn_egg", () -> new ForgeSpawnEggItem(ValocraftModEntities.SPIKE, -10066330, -10027009, new Item.Properties()));
	public static final RegistryObject<Item> JETT = REGISTRY.register("jett", () -> new JettItem());
	public static final RegistryObject<Item> NEON = REGISTRY.register("neon", () -> new NeonItem());
	public static final RegistryObject<Item> CLOVE = REGISTRY.register("clove", () -> new CloveItem());
	public static final RegistryObject<Item> KILLJOY = REGISTRY.register("killjoy", () -> new KilljoyItem());
	public static final RegistryObject<Item> VIPER = REGISTRY.register("viper", () -> new ViperItem());
	public static final RegistryObject<Item> SAGE = REGISTRY.register("sage", () -> new SageItem());
	public static final RegistryObject<Item> ISO = REGISTRY.register("iso", () -> new IsoItem());
	public static final RegistryObject<Item> SOVA = REGISTRY.register("sova", () -> new SovaItem());
	public static final RegistryObject<Item> GEKKO = REGISTRY.register("gekko", () -> new GekkoItem());
	// Start of user code block custom items
	// End of user code block custom items
}
