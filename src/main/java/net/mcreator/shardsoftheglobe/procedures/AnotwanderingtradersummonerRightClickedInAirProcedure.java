package net.mcreator.shardsoftheglobe.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeMod;

import java.util.Map;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class AnotwanderingtradersummonerRightClickedInAirProcedure extends ShardsOfTheGlobeModElements.ModElement {
	public AnotwanderingtradersummonerRightClickedInAirProcedure(ShardsOfTheGlobeModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency entity for procedure AnotwanderingtradersummonerRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"clear @s[type:shards_of_the_globe:anotwanderingtradersummoner");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon shards_of_the_globe:anotwanderingtrader");
			}
		}
	}
}
