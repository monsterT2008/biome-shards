// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelUltimateArmorB2 extends EntityModel<Entity> {
	private final ModelRenderer bootR;
	private final ModelRenderer bootL;

	public ModelUltimateArmorB2() {
		textureWidth = 256;
		textureHeight = 256;

		bootR = new ModelRenderer(this);
		bootR.setRotationPoint(0.0F, 12.0F, 0.0F);
		bootR.setTextureOffset(236, 0).addBox(0.0F, 8.001F, -2.5F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		bootR.setTextureOffset(246, 9).addBox(-0.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		bootR.setTextureOffset(238, 17).addBox(0.0F, 7.0F, -1.5F, 5.0F, 1.0F, 4.0F, 0.0F, true);

		bootL = new ModelRenderer(this);
		bootL.setRotationPoint(0.0F, 12.0F, 0.0F);
		bootL.setTextureOffset(236, 23).addBox(-5.0F, 8.001F, -2.5F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		bootL.setTextureOffset(238, 33).addBox(-5.0F, 7.0F, -1.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bootL.setTextureOffset(246, 39).addBox(-0.75F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bootR.render(matrixStack, buffer, packedLight, packedOverlay);
		bootL.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}