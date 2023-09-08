
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
public class IridiumSwordItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:iridium_sword")
	public static final Item block = null;

	public IridiumSwordItem(GurkmodModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2400;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(IridiumIngotItem.block));
			}
		}, 3, -2.3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("iridium_sword"));
	}
}
