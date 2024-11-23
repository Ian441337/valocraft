
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.valocraft.init;

import wuzu.ian.valocraft.block.ExplodeBlock;
import wuzu.ian.valocraft.ValocraftMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ValocraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ValocraftMod.MODID);
	public static final RegistryObject<Block> EXPLODE = REGISTRY.register("explode", () -> new ExplodeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
