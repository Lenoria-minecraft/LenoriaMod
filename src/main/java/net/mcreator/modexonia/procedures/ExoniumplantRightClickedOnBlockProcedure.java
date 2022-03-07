package net.mcreator.modexonia.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExoniumplantRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency world for procedure ExoniumplantRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency x for procedure ExoniumplantRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency y for procedure ExoniumplantRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency z for procedure ExoniumplantRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency entity for procedure ExoniumplantRightClickedOnBlock!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FARMLAND
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.VOID_AIR
						|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Exoniumplantstage0Block.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(ExoniumplantItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}

}
