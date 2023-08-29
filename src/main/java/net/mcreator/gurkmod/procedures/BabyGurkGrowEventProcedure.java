package net.mcreator.gurkmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.gurkmod.block.GurkBlock;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class BabyGurkGrowEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure BabyGurkGrowEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure BabyGurkGrowEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure BabyGurkGrowEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure BabyGurkGrowEvent!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() > 0.999) {
			if (Blocks.BEETROOTS.getDefaultState().isValidPosition(world, new BlockPos(x, y, z))) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = GurkBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
							SoundCategory.BLOCKS, (float) 45, (float) 1.2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
							SoundCategory.BLOCKS, (float) 45, (float) 1.2, false);
				}
				world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
	}
}
