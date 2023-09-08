
package net.mcreator.gurkmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.gurkmod.GurkmodModElements;

import java.util.List;

@GurkmodModElements.ModElement.Tag
public class RedstoneBatteryItem extends GurkmodModElements.ModElement {
	@ObjectHolder("gurkmod:redstone_battery")
	public static final Item block = null;

	public RedstoneBatteryItem(GurkmodModElements instance) {
		super(instance, 301);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.REDSTONE).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("redstone_battery");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Put with item in crafting table to charge."));
		}
	}
}
