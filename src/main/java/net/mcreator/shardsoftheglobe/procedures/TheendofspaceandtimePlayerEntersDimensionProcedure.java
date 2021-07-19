package net.mcreator.shardsoftheglobe.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeMod;

import java.util.Map;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class TheendofspaceandtimePlayerEntersDimensionProcedure extends ShardsOfTheGlobeModElements.ModElement {
	public TheendofspaceandtimePlayerEntersDimensionProcedure(ShardsOfTheGlobeModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency entity for procedure TheendofspaceandtimePlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"/say [The Final Boss]:well done brave adventurer you have made it far, and for that i congratulate you... but the adventure is not over, you will enter my castle compleate the tasks and then come up to meat me in person!");
			}
		}
	}
}
