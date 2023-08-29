
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class RefineNuggetItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:refine_nugget")
	public static final Item block = null;

	public RefineNuggetItem(GurkmodModElements instance) {
		super(instance, 272);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("refine_nugget");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
