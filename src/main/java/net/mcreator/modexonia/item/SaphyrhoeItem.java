
package net.mcreator.modexonia.item;

import net.minecraft.entity.ai.attributes.Attributes;

@ModexoniaModElements.ModElement.Tag
public class SaphyrhoeItem extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:saphyrhoe")
	public static final Item block = null;

	public SaphyrhoeItem(ModexoniaModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 1, -3f, new Item.Properties().group(SaphyrStuffItemGroup.tab)) {

		}.setRegistryName("saphyrhoe"));
	}

}
