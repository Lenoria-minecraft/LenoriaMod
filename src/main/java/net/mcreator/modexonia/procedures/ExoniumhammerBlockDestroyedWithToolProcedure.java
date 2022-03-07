package net.mcreator.modexonia.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExoniumhammerBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency world for procedure ExoniumhammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency x for procedure ExoniumhammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency y for procedure ExoniumhammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency z for procedure ExoniumhammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ModexoniaMod.LOGGER.warn("Failed to load dependency entity for procedure ExoniumhammerBlockDestroyedWithTool!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if (entity.rotationPitch > 40 || entity.rotationPitch < -40) {
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) (z - 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z - 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 2)), false);
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.NORTH || (entity.getHorizontalFacing()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y + 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x + 2), (int) (y - 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) (y - 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) (x - 2), (int) (y + 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.WEST || (entity.getHorizontalFacing()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z + 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) (z - 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 2)))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 2)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 2))), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z - 2)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));

					world.destroyBlock(new BlockPos((int) x, (int) (y - 2), (int) z), false);
				}
			}
		}
	}

}
