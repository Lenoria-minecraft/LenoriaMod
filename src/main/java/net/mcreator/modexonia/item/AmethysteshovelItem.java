
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class AmethysteshovelItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:amethysteshovel")
	public static final Item block = null;

	public AmethysteshovelItem(ModexoniaModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 4.5f;
			}

			public float getAttackDamage() {
				return 2.5f;
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
		}, 1, -3f, new Item.Properties().group(AmethystestuffItemGroup.tab)) {

		}.setRegistryName("amethysteshovel"));
	}

}
