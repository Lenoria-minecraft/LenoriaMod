
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class SaphyringotItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:saphyringot")
	public static final Item block = null;

	public SaphyringotItem(ModexoniaModElements instance) {
		super(instance, 24);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(SaphyrStuffItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("saphyringot");
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
