package net.mcreator.modexonia.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BucheronProcedure {

	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockBreak(BlockEvent.BreakEvent event) {
			Entity entity = event.getPlayer();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("xpAmount", event.getExpToDrop());
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency world for procedure Bucheron!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency x for procedure Bucheron!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency y for procedure Bucheron!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency z for procedure Bucheron!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency entity for procedure Bucheron!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.OAK_LOG) {
			entity.getPersistentData().putDouble("BUCHERON", (entity.getPersistentData().getDouble("BUCHERON") + 0));
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 5) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 1"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 2"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 120) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 3"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 4"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 5"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 6"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 7 "), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 8"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 9"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 10"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 11"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 12"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 13"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 14"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 15"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 16"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 17"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 18"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 19"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("BUCHERON") <= 50) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("BUCHERON niveaux 20"), (false));
			}
		}
	}

}
