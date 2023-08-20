package net.mcreator.gurkmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class BouncyBootsBootsTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure BouncyBootsBootsTickEvent!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure BouncyBootsBootsTickEvent!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 2, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 2, (int) 1, (false), (false)));
		if (world.getWorldInfo().isRaining()) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 1, (false), (false)));
		}
	}
}
