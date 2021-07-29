
package net.mcreator.shardsoftheglobe.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.shardsoftheglobe.ShardsOfTheGlobeModElements;

import java.util.List;

@ShardsOfTheGlobeModElements.ModElement.Tag
public class Clue1Item extends ShardsOfTheGlobeModElements.ModElement {
	@ObjectHolder("shards_of_the_globe:clue_1")
	public static final Item block = null;
	public Clue1Item(ShardsOfTheGlobeModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("clue_1");
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
			return 0F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("deep in a sandy place"));
			list.add(new StringTextComponent(
					"lies a temple of guess what more sand. but the deeper you go the more loot you will find however all things come with a danger..."));
		}
	}
}
