
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.LivingEntity;

import net.mcreator.gurkmod.procedures.BlaziumLivingEntityIsHitWithToolProcedure;
import net.mcreator.gurkmod.GurkmodModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@GurkmodModElements.ModElement.Tag
public class BlaziumAxeItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:blazium_axe")
	public static final Item block = null;

	public BlaziumAxeItem(GurkmodModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 11.5f;
			}

			public float getAttackDamage() {
				return 7.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlaziumItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				BlaziumLivingEntityIsHitWithToolProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("blazium_axe"));
	}
}
