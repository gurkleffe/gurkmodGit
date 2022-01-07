package net.mcreator.gurkmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gurkmod.GurkmodModElements;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

@GurkmodModElements.ModElement.Tag
public class PotartzPlayerEntersDimension2Procedure extends GurkmodModElements.ModElement {
	public PotartzPlayerEntersDimension2Procedure(GurkmodModElements instance) {
		super(instance, 134);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure PotartzPlayerEntersDimension2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 8, (int) 1, (false), (false)));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
