
package net.mcreator.gurkmod.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.gurkmod.item.VexHeartItem;
import net.mcreator.gurkmod.item.PowerlessRefineGemItem;
import net.mcreator.gurkmod.item.ObsidianShardItem;
import net.mcreator.gurkmod.item.GurkSeedsItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GurkSeedsTradeTrade {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (53)), new ItemStack(ObsidianShardItem.block, (int) (5)),
				new ItemStack(GurkSeedsItem.block), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (13)), new ItemStack(ObsidianShardItem.block),
				new ItemStack(VexHeartItem.block), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (15)), new ItemStack(ObsidianShardItem.block, (int) (3)),
				new ItemStack(PowerlessRefineGemItem.block), 10, 5, 0.05f));
	}
}
