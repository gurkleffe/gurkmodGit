
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class BronzehoeItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:bronzehoe")
	public static final Item block = null;
	public BronzehoeItem(GurkmodModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 160;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return -0.8f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TiningotItem.block, (int) (1)), new ItemStack(CopperingotItem.block, (int) (1)),
						new ItemStack(BronzeingotItem.block, (int) (1)));
			}
		}, 0, -1.8f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bronzehoe"));
	}
}
