
package wuzu.ian.valocraft.command;

import wuzu.ian.valocraft.procedures.SkinProcedure;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import java.util.HashMap;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class ValorantCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("valorant").requires(s -> s.hasPermission(4)).then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();
			HashMap<String, String> cmdparams = new HashMap<>();
			int index = -1;
			for (String param : arguments.getInput().split("\\s+")) {
				if (index >= 0)
					cmdparams.put(Integer.toString(index), param);
				index++;
			}

			SkinProcedure.execute(arguments, entity);
			return 0;
		})).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();
			HashMap<String, String> cmdparams = new HashMap<>();
			int index = -1;
			for (String param : arguments.getInput().split("\\s+")) {
				if (index >= 0)
					cmdparams.put(Integer.toString(index), param);
				index++;
			}

			SkinProcedure.execute(arguments, entity);
			return 0;
		}));
	}
}