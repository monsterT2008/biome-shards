// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelUltimateArmor extends EntityModel<Entity> {
	private final ModelRenderer head;

	public ModelUltimateArmor() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 248).addBox(-4.0F, -9.0F, -3.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(31, 242).addBox(-5.0F, -6.0F, -5.0F, 1.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 233).addBox(4.0F, -6.0F, -5.0F, 1.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(20, 238).addBox(4.0F, -8.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(12, 228).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 224).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(23, 226).addBox(5.0F, -8.0F, -1.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(33, 226).addBox(-7.0F, -8.0F, -1.0F, 2.0F, 6.0F, 3.0F, 0.0F, true);
		head.setTextureOffset(0, 216).addBox(7.0F, -8.5F, -0.5F, 3.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 235).addBox(-10.0F, -8.5F, -0.5F, 3.0F, 5.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(11, 218).addBox(10.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 218).addBox(-11.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(25, 217).addBox(11.0F, -10.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(31, 212).addBox(-12.0F, -10.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 204).addBox(-2.0F, -10.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 207).addBox(0.75F, -11.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(18, 202).addBox(-1.75F, -11.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(19, 194).addBox(-1.75F, -12.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(11, 199).addBox(0.75F, -12.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 198).addBox(2.0F, -10.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 190).addBox(-3.0F, -10.0F, 4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(8, 189).addBox(-3.0F, -11.0F, 5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(22, 188).addBox(2.0F, -11.0F, 5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(1, 175).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}