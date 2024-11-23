package wuzu.ian.valocraft.procedures;

import wuzu.ian.valocraft.network.ValocraftModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ToggelexplodeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ValocraftModVariables.MapVariables.get(world).spike_scale_x = 0;
		ValocraftModVariables.MapVariables.get(world).syncData(world);
		ValocraftModVariables.MapVariables.get(world).spike_scale_y = 0;
		ValocraftModVariables.MapVariables.get(world).syncData(world);
		ValocraftModVariables.MapVariables.get(world).spike_scale_z = 0;
		ValocraftModVariables.MapVariables.get(world).syncData(world);
		ValocraftModVariables.MapVariables.get(world).spike_x = entity.getX();
		ValocraftModVariables.MapVariables.get(world).syncData(world);
		ValocraftModVariables.MapVariables.get(world).spike_y = entity.getY();
		ValocraftModVariables.MapVariables.get(world).syncData(world);
		ValocraftModVariables.MapVariables.get(world).spike_z = entity.getZ();
		ValocraftModVariables.MapVariables.get(world).syncData(world);
	}
}
