// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelUltimateArmorL extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;

	public ModelUltimateArmorL() {
		textureWidth = 256;
		textureHeight = 256;

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(225, 0).addBox(-2.0F, 0.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, true);
		leftLeg.setTextureOffset(214, 0).addBox(-2.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, true);
		leftLeg.setTextureOffset(204, 0).addBox(1.15F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, true);
		leftLeg.setTextureOffset(193, 0).addBox(-2.0F, 0.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(181, 0).addBox(1.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		rightLeg.setTextureOffset(187, 8).addBox(-2.15F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		rightLeg.setTextureOffset(197, 13).addBox(-2.0F, 0.0F, 1.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
		rightLeg.setTextureOffset(207, 13).addBox(-2.0F, 0.0F, -2.25F, 4.0F, 8.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}