package net.mcreator.gurkmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.block.BlockState;

import net.mcreator.gurkmod.block.GurkmitfruitBlock;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class GurkBonemealOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure GurkBonemealOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure GurkBonemealOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure GurkBonemealOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure GurkBonemealOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			BlockPos _bp = new BlockPos(x, y, z);
			BlockState _bs = GurkmitfruitBlock.block.getDefaultState();
			world.setBlockState(_bp, _bs, 3);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z)));
			_ent.setEffectOnly(true);
			((World) world).addEntity(_ent);
		}
	}
}
