// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer body2;
	private final ModelRenderer body1;

	public Modelcustom_model() {
		texWidth = 24;
		texHeight = 16;

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, 21.0F, 0.5F);
		body2.texOffs(8, 10).addBox(-1.5F, 0.0F, -4.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		body1 = new ModelRenderer(this);
		body1.setPos(0.0F, 22.0F, 3.5F);
		body1.texOffs(4, 7).addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		body1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}