
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class BronzeswordItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:bronzesword")
	public static final Item block = null;

	public BronzeswordItem(GurkmodModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 165;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BronzeingotItem.block), new ItemStack(CopperingotItem.block),
						new ItemStack(TiningotItem.block));
			}
		}, 3, -2.2999999999999998f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("bronzesword"));
	}
}
