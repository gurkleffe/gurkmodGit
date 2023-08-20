package net.mcreator.gurkmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.gurkmod.entity.CrabEntity;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Random;
import java.util.Map;
import java.util.Calendar;

public class TotemOfHydrakaRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure TotemOfHydrakaRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure TotemOfHydrakaRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure TotemOfHydrakaRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure TotemOfHydrakaRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				GurkmodMod.LOGGER.warn("Failed to load dependency itemstack for procedure TotemOfHydrakaRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CrabEntity.CustomEntity(CrabEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world.isRemote()) {
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.attemptDamageItem((int) Calendar.getInstance().get(Calendar.HOUR_OF_DAY), new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}
