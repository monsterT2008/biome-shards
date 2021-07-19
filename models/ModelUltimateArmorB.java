// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelUltimateArmorB extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public ModelUltimateArmorB() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, 3.0F, -2.25F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 0).addBox(-4.0F, 0.0F, 1.25F, 8.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(36, 0).addBox(-4.5F, 10.0F, -2.5F, 9.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(36, 7).addBox(-1.0F, 10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(42, 7).addBox(-3.0F, 5.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(42, 10).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 18).addBox(-4.5F, -1.0F, 2.25F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(21, 13).addBox(-4.0F, -0.25F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 69).addBox(-4.25F, 0.0F, -2.15F, 1.0F, 10.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 69).addBox(3.25F, 0.0F, -2.15F, 1.0F, 10.0F, 4.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(0, 11).addBox(0.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 16).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(27, 42).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(45, 39).addBox(-4.0F, -2.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(10, 17).addBox(-4.0F, 7.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(48, 19).addBox(-4.0F, 7.0F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(11, 42).addBox(0.25F, -2.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(16, 56).addBox(-3.75F, 8.0F, -2.5F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(42, 53).addBox(-3.75F, -3.0F, -2.75F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(41, 29).addBox(-4.75F, -2.5F, -2.75F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 54).addBox(-5.25F, -1.5F, -2.75F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		leftArm.setTextureOffset(17, 41).addBox(-5.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 44).addBox(-3.0F, -3.5F, -1.75F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		leftArm.setTextureOffset(4, 20).addBox(-5.75F, -0.75F, -2.25F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 51).addBox(-4.0F, -2.25F, -3.25F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(0, 48).addBox(-4.0F, -2.25F, 1.75F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		leftArm.setTextureOffset(46, 16).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(0, 20).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(0, 25).addBox(0.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(0, 28).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, 0.0F, true);
		rightArm.setTextureOffset(18, 19).addBox(3.0F, -2.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, true);
		rightArm.setTextureOffset(13, 13).addBox(-1.0F, 7.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(13, 15).addBox(-1.0F, 7.0F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(28, 21).addBox(-1.25F, -2.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, true);
		rightArm.setTextureOffset(38, 21).addBox(-1.25F, 8.0F, -2.5F, 5.0F, 3.0F, 5.0F, 0.0F, true);
		rightArm.setTextureOffset(18, 35).addBox(-1.25F, -3.0F, -2.75F, 5.0F, 1.0F, 5.0F, 0.0F, true);
		rightArm.setTextureOffset(33, 34).addBox(3.75F, -2.5F, -2.75F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		rightArm.setTextureOffset(20, 41).addBox(4.25F, -1.5F, -2.75F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		rightArm.setTextureOffset(38, 29).addBox(4.0F, -2.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		rightArm.setTextureOffset(40, 35).addBox(0.0F, -3.5F, -1.75F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		rightArm.setTextureOffset(4, 15).addBox(4.75F, -0.75F, -2.25F, 1.0F, 1.0F, 4.0F, 0.0F, true);
		rightArm.setTextureOffset(10, 20).addBox(-1.0F, -2.25F, -3.25F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(4, 25).addBox(-1.0F, -2.25F, 1.75F, 5.0F, 2.0F, 1.0F, 0.0F, true);
		rightArm.setTextureOffset(10, 10).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}