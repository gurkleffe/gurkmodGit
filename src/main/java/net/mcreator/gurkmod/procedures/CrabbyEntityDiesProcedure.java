package net.mcreator.gurkmod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class CrabbyEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CrabbyEntityDies!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof ServerPlayerEntity) {
			((ServerPlayerEntity) sourceentity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("gurkmod:totem_of_hydraka")});
		}
	}
}
