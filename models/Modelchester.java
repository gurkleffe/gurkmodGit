// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelchester extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer sub_bone_1;
	private final ModelRenderer bone2;
	private final ModelRenderer sub_bone_2;
	private final ModelRenderer bone3;
	private final ModelRenderer sub_bone_3;
	private final ModelRenderer bone4;
	private final ModelRenderer sub_bone_4;
	private final ModelRenderer bone5;
	private final ModelRenderer sub_bone_5;

	public Modelchester() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		sub_bone_1 = new ModelRenderer(this);
		sub_bone_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(sub_bone_1);
		sub_bone_1.setTextureOffset(31, 6).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-6.0F, 24.0F, 0.0F);

		sub_bone_2 = new ModelRenderer(this);
		sub_bone_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(sub_bone_2);
		sub_bone_2.setTextureOffset(30, 5).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-6.0F, 24.0F, 0.0F);

		sub_bone_3 = new ModelRenderer(this);
		sub_bone_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(sub_bone_3);
		sub_bone_3.setTextureOffset(0, 19).addBox(-1.0F, -12.0F, -7.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.0F, 24.0F, 0.0F);

		sub_bone_4 = new ModelRenderer(this);
		sub_bone_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(sub_bone_4);
		sub_bone_4.setTextureOffset(0, 0).addBox(-1.0F, -16.0F, -7.0F, 14.0F, 4.0F, 14.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-6.0F, 26.0F, 0.0F);

		sub_bone_5 = new ModelRenderer(this);
		sub_bone_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(sub_bone_5);
		sub_bone_5.setTextureOffset(0, 0).addBox(5.0F, -15.0F, 7.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.sub_bone_2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.sub_bone_1.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}