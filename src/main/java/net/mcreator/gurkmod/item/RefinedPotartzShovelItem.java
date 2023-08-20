
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class RefinedPotartzShovelItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:refined_potartz_shovel")
	public static final Item block = null;

	public RefinedPotartzShovelItem(GurkmodModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PotartzGemItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("refined_potartz_shovel"));
	}
}
