
package net.mcreator.modexonia.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.modexonia.item.SaphyrpickaxeItem;
import net.mcreator.modexonia.item.OpalePickaxeItem;
import net.mcreator.modexonia.item.ExoniumtoolsItem;
import net.mcreator.modexonia.item.ExoniumhammerevolutedItem;
import net.mcreator.modexonia.item.ExoniumhammerItem;
import net.mcreator.modexonia.item.AmethystepickaxeItem;
import net.mcreator.modexonia.ModexoniaModElements;

@ModexoniaModElements.ModElement.Tag
public class SmeltEnchantment extends ModexoniaModElements.ModElement {
	@ObjectHolder("modexonia:smelt")
	public static final Enchantment enchantment = null;

	public SmeltEnchantment(ModexoniaModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("smelt"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == ExoniumtoolsItem.block)
				return true;
			if (stack.getItem() == ExoniumhammerItem.block)
				return true;
			if (stack.getItem() == ExoniumhammerevolutedItem.block)
				return true;
			if (stack.getItem() == SaphyrpickaxeItem.block)
				return true;
			if (stack.getItem() == AmethystepickaxeItem.block)
				return true;
			if (stack.getItem() == OpalePickaxeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
