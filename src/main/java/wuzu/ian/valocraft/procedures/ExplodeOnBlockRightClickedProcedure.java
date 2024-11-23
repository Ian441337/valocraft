package wuzu.ian.valocraft.procedures;

import wuzu.ian.valocraft.network.ValocraftModVariables;

import net.minecraft.world.level.LevelAccessor;

public class ExplodeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world) {
		if (!(ValocraftModVariables.MapVariables.get(world).spike_scale_x == 36)) {
			ValocraftModVariables.MapVariables.get(world).spike_scale_x = ValocraftModVariables.MapVariables.get(world).spike_scale_x + 0.1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_y = ValocraftModVariables.MapVariables.get(world).spike_scale_y + 0.1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_z = ValocraftModVariables.MapVariables.get(world).spike_scale_y + 0.1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
		} else {
			ValocraftModVariables.MapVariables.get(world).spike_scale_x = 0;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_y = 0;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_z = 0;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
