package net.mcreator.gurkmod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class CrabbyEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure CrabbyEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayerEntity) {
			((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("gurkmod:totem_of_hydraka")});
		}
	}
}
