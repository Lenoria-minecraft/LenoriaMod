
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class UnclaimfinderitemItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:unclaimfinderitem")
	public static final Item block = null;

	public UnclaimfinderitemItem(ModexoniaModElements instance) {
		super(instance, 47);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExoniumStuffItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("unclaimfinderitem");
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

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected)

				UnclaimfinderProcedure.executeProcedure(Collections.EMPTY_MAP);
		}

	}

}
