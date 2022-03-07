
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class ExoniumhoeItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:exoniumhoe")
	public static final Item block = null;

	public ExoniumhoeItem(ModexoniaModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ExoniumStuffItemGroup.tab)) {

		}.setRegistryName("exoniumhoe"));
	}

}
