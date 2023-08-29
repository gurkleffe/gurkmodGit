
package net.mcreator.gurkmod.item.extension;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.gurkmod.item.BiofuelItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiofuelFuelItemExtension {
	@Mod.EventBusSubscriber
	public static class Fuel {
		@SubscribeEvent
		public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
			ItemStack itemstack = event.getItemStack();
			if (itemstack.getItem() == BiofuelItem.block)

				event.setBurnTime(3000);
		}
	}
}
