
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class BilletItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:billet")
	public static final Item block = null;

	public BilletItem(ModexoniaModElements instance) {
		super(instance, 59);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AutresItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("billet");
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
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			BilletRightClickedInAirProcedure.executeProcedure(Collections.EMPTY_MAP);
			return ar;
		}

	}

}
