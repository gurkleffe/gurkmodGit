package net.mcreator.gurkmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.gurkmod.block.BabyGurkBlock;
import net.mcreator.gurkmod.GurkmodMod;

import java.util.Map;

public class GurkSeedsRightclickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GurkmodMod.LOGGER.warn("Failed to load dependency world for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GurkmodMod.LOGGER.warn("Failed to load dependency x for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GurkmodMod.LOGGER.warn("Failed to load dependency y for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GurkmodMod.LOGGER.warn("Failed to load dependency z for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GurkmodMod.LOGGER.warn("Failed to load dependency entity for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				GurkmodMod.LOGGER.warn("Failed to load dependency itemstack for procedure GurkSeedsRightclickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (Blocks.BEETROOTS.getDefaultState().isValidPosition(world, new BlockPos(x, y + 1, z))) {
			world.setBlockState(new BlockPos(x, y + 1, z), BabyGurkBlock.block.getDefaultState(), 3);
			(itemstack).shrink((int) 1);
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
						SoundCategory.BLOCKS, (float) 45, (float) 1.2);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
						SoundCategory.BLOCKS, (float) 45, (float) 1.2, false);
			}
		}
	}
}
