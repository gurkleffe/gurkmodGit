package net.mcreator.gurkmod.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class YtterbitedOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure YtterbitedOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(Blocks.AIR.getDefaultState(), new Vector3d(0.25D, (double) 0.05F, 0.25D));
		entity.setNoGravity((true));
	}
}
