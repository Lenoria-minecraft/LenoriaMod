
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class ExoniumswordItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:exoniumsword")
	public static final Item block = null;

	public ExoniumswordItem(ModexoniaModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 16f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ExoniumingotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ExoniumStuffItemGroup.tab)) {

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}

		}.setRegistryName("exoniumsword"));
	}

}
