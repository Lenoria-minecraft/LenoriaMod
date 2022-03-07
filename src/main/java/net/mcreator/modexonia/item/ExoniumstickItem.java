
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class ExoniumstickItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:exoniumstick")
	public static final Item block = null;

	public ExoniumstickItem(ModexoniaModElements instance) {
		super(instance, 27);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExoniumStuffItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("exoniumstick");
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
