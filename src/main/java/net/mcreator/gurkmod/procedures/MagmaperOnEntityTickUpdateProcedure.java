package net.mcreator.gurkmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class MagmaperOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure MagmaperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure MagmaperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure MagmaperOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure MagmaperOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0, 1, 0);
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.DRIPPING_LAVA, x, y, z, (int) 5, 3, 3, 3, 1);
			}
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.DESTROY);
			}
		}
	}
}
