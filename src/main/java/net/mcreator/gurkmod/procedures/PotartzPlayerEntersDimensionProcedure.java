package net.mcreator.gurkmod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class PotartzPlayerEntersDimensionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure PotartzPlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayerEntity) {
			((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("gurkmod:refined_quartz_recipe")});
		}
		if (entity instanceof ServerPlayerEntity) {
			((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("gurkmod:refine_gem_recipe")});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel(-((int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 8, (int) 1, (false), (false)));
	}
}
