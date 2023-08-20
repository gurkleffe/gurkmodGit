package net.mcreator.gurkmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class BlaziumBlockEntityWalksOnTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure BlaziumBlockEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 0, (false), (false)));
		entity.setFire((int) 15);
	}
}
