
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ValocraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ValocraftMod.MODID);
	public static final RegistryObject<Item> SPIKE_SPAWN_EGG = REGISTRY.register("spike_spawn_egg", () -> new ForgeSpawnEggItem(ValocraftModEntities.SPIKE, -10066330, -10027009, new Item.Properties()));
	public static final RegistryObject<Item> EXPLODE = block(ValocraftModBlocks.EXPLODE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
