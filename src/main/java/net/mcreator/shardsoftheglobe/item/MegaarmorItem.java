
package net.mcreator.shardsoftheglobe.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.shardsoftheglobe.procedures.MegaarmorLeggingsTickEventProcedure;
import net.mcreator.shardsoftheglobe.procedures.MegaarmorHelmetTickEventProcedure;
import net.mcreator.shardsoftheglobe.procedures.MegaarmorBootsTickEventProcedure;
import net.mcreator.shardsoftheglobe.procedures.MegaarmorBodyTickEventProcedure;
import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class MegaarmorItem extends ShardsOfTheGlobeModElements.ModElement {
	@ObjectHolder("shards_of_the_globe:megaarmor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("shards_of_the_globe:megaarmor_chestplate")
	public static final Item body = null;
	@ObjectHolder("shards_of_the_globe:megaarmor_leggings")
	public static final Item legs = null;
	@ObjectHolder("shards_of_the_globe:megaarmor_boots")
	public static final Item boots = null;
	public MegaarmorItem(ShardsOfTheGlobeModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{10, 10, 10, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 10;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RepaircoreItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "megaarmor";
			}

			@Override
			public float getToughness() {
				return 7.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelUltimateArmor().head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shards_of_the_globe:textures/ultimatearmorh.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					MegaarmorHelmetTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("megaarmor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelUltimateArmorB().body;
				armorModel.bipedLeftArm = new ModelUltimateArmorB().body;
				armorModel.bipedRightArm = new ModelUltimateArmorB().body;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shards_of_the_globe:textures/ultimatearmorc.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					MegaarmorBodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("megaarmor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelUltimateArmorL().leftLeg;
				armorModel.bipedRightLeg = new ModelUltimateArmorL().leftLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shards_of_the_globe:textures/ultimatearmorbnl.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					MegaarmorLeggingsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("megaarmor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelUltimateArmorB2().bootR;
				armorModel.bipedRightLeg = new ModelUltimateArmorB2().bootR;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shards_of_the_globe:textures/ultimatearmorbnl.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					MegaarmorBootsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("megaarmor_boots"));
	}
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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bootR.render(matrixStack, buffer, packedLight, packedOverlay);
			bootL.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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
}
