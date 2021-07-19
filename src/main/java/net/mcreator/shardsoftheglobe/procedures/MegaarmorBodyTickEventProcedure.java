package net.mcreator.shardsoftheglobe.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeMod;

import java.util.Map;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class MegaarmorBodyTickEventProcedure extends ShardsOfTheGlobeModElements.ModElement {
	public MegaarmorBodyTickEventProcedure(ShardsOfTheGlobeModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency entity for procedure MegaarmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect give @p haste 1000000 2");
			}
		}
	}
}
