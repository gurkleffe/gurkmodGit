package net.mcreator.gurkmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class RedstoneDrillBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure RedstoneDrillBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure RedstoneDrillBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure RedstoneDrillBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure RedstoneDrillBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x + 1, y, z), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x - 1, y, z), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y + 1, z), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y - 1, z), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z + 1), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z - 1), false);
			}
		}
	}
}
