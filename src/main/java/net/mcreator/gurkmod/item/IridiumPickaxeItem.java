
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class IridiumPickaxeItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:iridium_pickaxe")
	public static final Item block = null;

	public IridiumPickaxeItem(GurkmodModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(IridiumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("iridium_pickaxe"));
	}
}
