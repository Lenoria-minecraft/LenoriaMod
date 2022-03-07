package net.mcreator.modexonia.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MetierProcedure {

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
				ModexoniaMod.LOGGER.warn("Failed to load dependency world for procedure Metier!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency x for procedure Metier!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency y for procedure Metier!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency z for procedure Metier!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency entity for procedure Metier!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.STONE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 1));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COAL_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 2));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.IRON_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 2.5));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.REDSTONE_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 3));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GOLD_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 5));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.LAPIS_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 7));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DIAMOND_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 10));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.EMERALD_ORE) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 12));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == AmethytesoreBlock.block) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 30));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == OpaleOreBlock.block) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 50));
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ExoniumoreBlock.block) {
			entity.getPersistentData().putDouble("mineur", (entity.getPersistentData().getDouble("mineur") + 100));
		}
		if (entity.getPersistentData().getDouble("mineur") <= 100) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 1"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 300) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 2"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 500) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 3"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 700) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 4"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 1000) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 5"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 2500) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 6"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 5400) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 7"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 10200) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 8"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 16300) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 9"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 22000) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 10"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 26500) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 11"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 31000) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 12"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 36100) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 13"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 41300) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 14"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 45900) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 15"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 48700) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 16"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 52700) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 17"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 55840) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 18"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 59690) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 19"), (false));
			}
		}
		if (entity.getPersistentData().getDouble("mineur") <= 65000) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("MINEUR niveaux 20"), (false));
			}
		}
	}

}
