package wuzu.ian.valocraft.procedures;

import wuzu.ian.valocraft.network.ValocraftModVariables;
import wuzu.ian.valocraft.ValocraftMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ExplodeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(ValocraftModVariables.MapVariables.get(world).spike_scale_x >= 36)) {
			ValocraftModVariables.MapVariables.get(world).spike_scale_x = ValocraftModVariables.MapVariables.get(world).spike_scale_x + 1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_y = ValocraftModVariables.MapVariables.get(world).spike_scale_y + 1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftModVariables.MapVariables.get(world).spike_scale_z = ValocraftModVariables.MapVariables.get(world).spike_scale_y + 1;
			ValocraftModVariables.MapVariables.get(world).syncData(world);
			ValocraftMod.queueServerWork(1, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "valoexpand");
					}
				}
			});
		}
	}
}
