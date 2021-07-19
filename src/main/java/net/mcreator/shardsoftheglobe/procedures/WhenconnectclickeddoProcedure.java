package net.mcreator.shardsoftheglobe.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModVariables;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeMod;

import java.util.Map;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class WhenconnectclickeddoProcedure extends ShardsOfTheGlobeModElements.ModElement {
	public WhenconnectclickeddoProcedure(ShardsOfTheGlobeModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency entity for procedure Whenconnectclickeddo!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ShardsOfTheGlobeMod.LOGGER.warn("Failed to load dependency world for procedure Whenconnectclickeddo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"say sucsesfully connected to twitch and streamlabs");
			}
		}
		if ((false)) {
			ShardsOfTheGlobeModVariables.MapVariables.get(world).connectedornot = (boolean) (true);
			ShardsOfTheGlobeModVariables.MapVariables.get(world).syncData(world);
		}
		if ((true)) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"give @p shards_of_the_globe:gifted_sub_pressent");
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 1000000);
		}
	}
}
