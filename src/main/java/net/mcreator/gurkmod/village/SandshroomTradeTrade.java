
package net.mcreator.gurkmod.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.gurkmod.block.SandshroomBlock;
import net.mcreator.gurkmod.block.MorelMushroomBlock;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SandshroomTradeTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FARMER) {
			trades.get(2).add(new BasicTrade(new ItemStack(SandshroomBlock.block, (int) (5)), new ItemStack(MorelMushroomBlock.block, (int) (2)),
					new ItemStack(Items.EMERALD), 10, 4, 0.04f));
		}
	}
}
