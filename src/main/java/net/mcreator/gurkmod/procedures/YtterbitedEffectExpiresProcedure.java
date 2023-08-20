package net.mcreator.gurkmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class YtterbitedEffectExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure YtterbitedEffectExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setNoGravity((false));
	}
}
