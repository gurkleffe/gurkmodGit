package net.mcreator.gurkmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodModElements;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

@GurkmodModElements.ModElement.Tag
public class HasteOnPotionActiveTickProcedure extends GurkmodModElements.ModElement {
	public HasteOnPotionActiveTickProcedure(GurkmodModElements instance) {
		super(instance, 107);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure HasteOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 30, (int) 2, (false), (false)));
	}
}
