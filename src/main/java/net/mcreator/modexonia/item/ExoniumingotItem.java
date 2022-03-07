
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class ExoniumingotItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:exoniumingot")
	public static final Item block = null;

	public ExoniumingotItem(ModexoniaModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExoniumStuffItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("exoniumingot");
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
