package net.mcreator.shardsoftheglobe.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModVariables;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeMod;

import java.util.Map;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class WhendissconectclickeddoProcedure extends ShardsOfTheGlobeModElements.ModElement {
	public WhendissconectclickeddoProcedure(ShardsOfTheGlobeModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency entity for procedure Whendissconectclickeddo!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency world for procedure Whendissconectclickeddo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"say sucsesfully disconnected from twitch and streamlabs");
			}
		}
		if ((true)) {
			ShardsOfTheGlobeModVariables.MapVariables.get(world).connectedornot = (boolean) (false);
			ShardsOfTheGlobeModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
