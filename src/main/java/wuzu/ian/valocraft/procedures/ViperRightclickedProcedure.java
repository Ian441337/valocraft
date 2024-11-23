package wuzu.ian.valocraft.procedures;

import net.minecraft.world.entity.Entity;

public class ViperRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("agent", "viper");
	}
}
