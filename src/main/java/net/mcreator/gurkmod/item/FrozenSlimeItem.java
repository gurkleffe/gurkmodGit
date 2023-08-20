
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.gurkmod.GurkmodModElements;

@GurkmodModElements.ModElement.Tag
public class FrozenSlimeItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:frozen_slime")
	public static final Item block = null;

	public FrozenSlimeItem(GurkmodModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("frozen_slime");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
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
