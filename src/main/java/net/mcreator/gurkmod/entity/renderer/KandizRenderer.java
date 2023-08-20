
package net.mcreator.gurkmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.GhastModel;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.gurkmod.entity.KandizEntity;

@OnlyIn(Dist.CLIENT)
public class KandizRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(KandizEntity.entity,
					renderManager -> new MobRenderer(renderManager, new GhastModel(), 1.2999999999999998f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("gurkmod:textures/entities/kandiz.png");
						}
					});
			RenderingRegistry.registerEntityRenderingHandler(KandizEntity.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
