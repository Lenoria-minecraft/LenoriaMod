
package net.mcreator.modexonia.itemgroup;

@ModexoniaModElements.ModElement.Tag
public class AmethystestuffItemGroup extends ModexoniaModElements.ModElement {

	public AmethystestuffItemGroup(ModexoniaModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabamethystestuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmethysteingotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
