package net.mcreator.gurkmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.gurkmod.item.MagmaGeodeItem;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class MagmiteOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure MagmiteOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure MagmiteOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure MagmiteOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure MagmiteOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() == 0) {
			if (Math.random() == 0) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MagmaGeodeItem.block));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
