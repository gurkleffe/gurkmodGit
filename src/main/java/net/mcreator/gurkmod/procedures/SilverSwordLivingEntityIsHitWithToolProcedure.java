package net.mcreator.gurkmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class SilverSwordLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure SilverSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure SilverSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure SilverSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure SilverSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure SilverSwordLivingEntityIsHitWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEAD) : false) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 999, (int) 3, (true), (true)));
			entity.setFire((int) 15);
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
			}
		}
	}
}
