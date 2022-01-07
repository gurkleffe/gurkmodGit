package net.mcreator.gurkmod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodModElements;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

@GurkmodModElements.ModElement.Tag
public class PotartzPlayerEntersDimensionProcedure extends GurkmodModElements.ModElement {
	public PotartzPlayerEntersDimensionProcedure(GurkmodModElements instance) {
		super(instance, 114);
	}

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
	}
}
