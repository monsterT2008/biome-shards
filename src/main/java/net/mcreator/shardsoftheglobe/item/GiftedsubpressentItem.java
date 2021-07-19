
package net.mcreator.shardsoftheglobe.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class GiftedsubpressentItem extends ShardsOfTheGlobeModElements.ModElement {
	@ObjectHolder("shards_of_the_globe:giftedsubpressent")
	public static final Item block = null;
	public GiftedsubpressentItem(ShardsOfTheGlobeModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("giftedsubpressent");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
