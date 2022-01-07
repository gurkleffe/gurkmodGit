
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class BronzeaxeItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:bronzeaxe")
	public static final Item block = null;
	public BronzeaxeItem(GurkmodModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 175;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BronzeingotItem.block, (int) (1)), new ItemStack(CopperingotItem.block, (int) (1)),
						new ItemStack(TiningotItem.block, (int) (1)));
			}
		}, 1, -3.3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bronzeaxe"));
	}
}
